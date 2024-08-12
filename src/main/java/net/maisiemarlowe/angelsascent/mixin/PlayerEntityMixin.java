package net.maisiemarlowe.angelsascent.mixin;

import net.maisiemarlowe.angelsascent.ModKeyBindings;
import net.maisiemarlowe.angelsascent.interfaces.IClientPlayerEntityMixin;
import net.maisiemarlowe.angelsascent.item.ModItems;
import net.minecraft.client.input.Input;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
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
    private int speedToggleState = 0;
    private static final float SLOW_SPEED = 0.05F;
    private static final float MEDIUM_SPEED = 0.15F;
    private static final float FAST_SPEED = 0.30F;

    // Variables to handle key press debounce
    private boolean keyPreviouslyPressed = false;

    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        PlayerAbilities abilities = player.getAbilities();
        ItemStack chestStack = player.getEquippedStack(EquipmentSlot.CHEST);
        boolean hasWingsEquipped = chestStack.isOf(ModItems.HOLY_WINGS) || chestStack.isOf(ModItems.BLASPHEMOUS_WINGS);

        // Handle key press debounce
        boolean keyPressed = ModKeyBindings.TOGGLE_WING_SPEED.isPressed();
        if (hasWingsEquipped && keyPressed && !keyPreviouslyPressed) {
            speedToggleState = (speedToggleState + 1) % 3;
            String speedStatus;
            Formatting speedColor;
            switch (speedToggleState) {
                case 0:
                    speedStatus = "Slow";
                    speedColor = Formatting.RED;
                    break;
                case 1:
                    speedStatus = "Medium";
                    speedColor = Formatting.YELLOW;
                    break;
                case 2:
                default:
                    speedStatus = "Fast";
                    speedColor = Formatting.GREEN;
                    break;
            }
            player.sendMessage(Text.literal("Flight Speed Toggled: ").formatted(Formatting.AQUA)
                    .append(Text.literal(speedStatus).formatted(speedColor)), true);

        }
        keyPreviouslyPressed = keyPressed;

        if (player.isCreative()) {
            abilities.allowFlying = true;
            return;
        }
        if (player.isSpectator()) {
            abilities.flying = true;
            return;
        }
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
        if (!player.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.HOLY_WINGS) && !player.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.BLASPHEMOUS_WINGS)) {
            abilities.allowFlying = false;
            abilities.flying = false;
        }
    }

    private void defaultFlight(PlayerEntity player) {
        PlayerAbilities abilities = player.getAbilities();
        abilities.setFlySpeed(SLOW_SPEED);
        abilities.allowFlying = false; // Disallow flight when not using wings
    }

    private void handleWingsFlight(PlayerEntity player) {
        PlayerAbilities abilities = player.getAbilities();
        // Allow flight if wings are equipped and flying is active
        abilities.allowFlying = true;
        abilities.flying = startFlying;

        float flightSpeed = SLOW_SPEED;
        switch (speedToggleState) {
            case 1:
                flightSpeed = MEDIUM_SPEED;
                break;
            case 2:
                flightSpeed = FAST_SPEED;
                break;
            case 0:
            default:
                flightSpeed = SLOW_SPEED;
                break;
        }

        if (player.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.HOLY_WINGS)) {
            abilities.setFlySpeed(flightSpeed);
        } else if (player.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.BLASPHEMOUS_WINGS)) {
            abilities.setFlySpeed(flightSpeed * 2); // Double speed for devil wings
        }

        // Ensure the player is not flying if on the ground or in a vehicle
        if (player.isOnGround() || player.hasVehicle()) {
            abilities.allowFlying = false;
            abilities.flying = false;
        }

    }



}
