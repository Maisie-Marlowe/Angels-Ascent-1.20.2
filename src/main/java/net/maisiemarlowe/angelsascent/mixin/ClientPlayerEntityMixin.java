package net.maisiemarlowe.angelsascent.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.maisiemarlowe.angelsascent.interfaces.IClientPlayerEntityMixin;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayerEntity.class)
@Environment(EnvType.CLIENT)
public abstract class ClientPlayerEntityMixin implements IClientPlayerEntityMixin {

    private boolean doubleJumpActive = false;
    private boolean jumpPressed = false;
    private int jumpCooldown = 0;

    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        ClientPlayerEntity player = (ClientPlayerEntity) (Object) this;

        if (jumpCooldown > 0) {
            jumpCooldown--;
        }

        if (player.input.jumping) {
            if (!jumpPressed) {
                jumpPressed = true;
                if (jumpCooldown == 0) {
                    jumpCooldown = 7;
                } else if (jumpCooldown > 0) {
                    doubleJumpActive = !doubleJumpActive;
                    jumpCooldown = 0;
                }
            }
        } else {
            jumpPressed = false;
        }
        //reset double jump state when on the ground
        if (player.isOnGround() && doubleJumpActive) {
            doubleJumpActive = false;
        }
    }

    @Override
    public boolean isDoubleJumpActive() {
        return doubleJumpActive;
    }
}
