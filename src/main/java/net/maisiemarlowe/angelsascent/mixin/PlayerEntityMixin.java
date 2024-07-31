package net.maisiemarlowe.angelsascent.mixin;

import net.maisiemarlowe.angelsascent.item.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
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
        ItemStack chestItem = player.getEquippedStack(EquipmentSlot.CHEST);
        PlayerAbilities abilities = player.getAbilities();

        if (chestItem.isOf(ModItems.ANGEL_WINGS) || chestItem.isOf(ModItems.DEVIL_WINGS)) {
            handleFlight(player, chestItem);
        } else {
            defaultFlight(player);
        }
    }

    private void defaultFlight(PlayerEntity player) {
        PlayerAbilities abilities = player.getAbilities();
        if (player.isOnGround() || player.hasVehicle()) {
            abilities.flying = false;
        }
        // No changes to flight speed when not using custom wings
    }

    private void handleFlight(PlayerEntity player, ItemStack chestItem) {
        PlayerAbilities abilities = player.getAbilities();

        if (player.isOnGround() || player.hasVehicle()) {
            abilities.flying = false;
            return;
        }

        if (chestItem.isOf(ModItems.ANGEL_WINGS)) {
            // Custom flight behavior for Angel Wings
            abilities.flying = true;
            abilities.setFlySpeed(0.15f); // Example speed for Angel Wings
        } else if (chestItem.isOf(ModItems.DEVIL_WINGS)) {
            // Custom flight behavior for Devil Wings
            abilities.flying = true;
            abilities.setFlySpeed(0.3f); // Example speed for Devil Wings
        }
    }
}
