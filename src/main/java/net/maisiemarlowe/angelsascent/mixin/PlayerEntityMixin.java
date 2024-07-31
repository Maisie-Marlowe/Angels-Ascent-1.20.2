package net.maisiemarlowe.angelsascent.mixin;

import net.maisiemarlowe.angelsascent.interfaces.IClientPlayerEntityMixin;
import net.maisiemarlowe.angelsascent.item.ModItems;
import net.minecraft.client.input.Input;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {

    public Input input;

    @Shadow
    public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    @Shadow
    public abstract PlayerAbilities getAbilities();

    private boolean startFlying = false;

    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        PlayerAbilities abilities = player.getAbilities();
        ItemStack chestStack = player.getEquippedStack(EquipmentSlot.CHEST);
        boolean hasWingsEquipped = chestStack.isOf(ModItems.ANGEL_WINGS) || chestStack.isOf(ModItems.DEVIL_WINGS);

        if (player instanceof IClientPlayerEntityMixin mixin) {
            startFlying = mixin.isDoubleJumpActive();
        }

        if (hasWingsEquipped) {
            if (player.isOnGround() || player.hasVehicle()) {
                // Ensure flying is disabled when on ground or in a vehicle
                abilities.allowFlying = false;
                abilities.flying = false;
            } else {
                handleWingsFlight(player);
            }
        } else {
            // Ensure flying is disabled if no wings are equipped
            if (abilities.allowFlying) {
                defaultFlight(player);
            }
        }

        // If no wings are equipped, disable flying
        if (!player.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.ANGEL_WINGS) && !player.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.DEVIL_WINGS)) {
            abilities.allowFlying = false;
            abilities.flying = false;
        }
    }

    private void defaultFlight(PlayerEntity player) {
        PlayerAbilities abilities = player.getAbilities();
        float defaultFlightSpeed = 0.05F;
        abilities.setFlySpeed(defaultFlightSpeed);
        abilities.allowFlying = false; // Disallow flight when not using wings
    }

    private void handleWingsFlight(PlayerEntity player) {
        PlayerAbilities abilities = player.getAbilities();
        // Allow flight if wings are equipped and flying is active
        abilities.allowFlying = true;
        abilities.flying = startFlying;

        if (player.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.ANGEL_WINGS)) {
            // Adjust flight speed for angel wings
            float flightSpeed = 0.15f;
            abilities.setFlySpeed(flightSpeed);
        } else if (player.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.DEVIL_WINGS)) {
            // Adjust flight speed for devil wings
            float flightSpeed = 0.3f;
            abilities.setFlySpeed(flightSpeed);
        }

        // Ensure the player is not flying if on the ground or in a vehicle
        if (player.isOnGround() || player.hasVehicle()) {
            abilities.allowFlying = false;
            abilities.flying = false;
        }
    }
}
