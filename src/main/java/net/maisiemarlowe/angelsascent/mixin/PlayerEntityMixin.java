package net.maisiemarlowe.angelsascent.mixin;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.maisiemarlowe.angelsascent.item.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {

    @Shadow
    public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    @Shadow
    public abstract PlayerAbilities getAbilities();


    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        PlayerAbilities abilities = player.getAbilities();
        ItemStack chestStack = player.getEquippedStack(EquipmentSlot.CHEST);
        boolean hasWingsEquipped = chestStack.isOf(ModItems.ANGEL_WINGS) || chestStack.isOf(ModItems.DEVIL_WINGS);



        if (hasWingsEquipped) {
            if(player.isOnGround() || player.hasVehicle()) {
                abilities.flying = false;
            }
            else {
                handleWingsFlight(player);
            }

        } else {
            //ensures the player is not in flying mode if no wings are equipped
            if(abilities.flying)
            defaultFlight(player);
        }
        if (!player.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.ANGEL_WINGS) && !player.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.DEVIL_WINGS)) {
            abilities.flying = false;
        }
    }

    private void defaultFlight(PlayerEntity player) {
        World world = player.getWorld();
        PlayerAbilities abilities = player.getAbilities();
        float defaultFlightSpeed = 0.05F;
        abilities.setFlySpeed(defaultFlightSpeed);

        //abilities.allowFlying = false;
    }

    private void handleWingsFlight(PlayerEntity player) {
        World world = player.getWorld();

        // Allow flight if the player is using the wings
        PlayerAbilities abilities = player.getAbilities();
        abilities.flying = true;
        if (player.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.ANGEL_WINGS)) {
            //adjust flight speed
            float flightSpeed = 0.15f;
            abilities.setFlySpeed(flightSpeed);
        } else if (player.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.DEVIL_WINGS)) {
            //adjust flight speed
            float flightSpeed = 0.3f;
            abilities.setFlySpeed(flightSpeed);
        } else{
            abilities.flying = false;
        }


        // Handle flight mechanics
        if (player.isOnGround() || player.hasVehicle()) {
            abilities.flying = false;
            return; // Skip flight if on ground or in a vehicle
        }
    }


}