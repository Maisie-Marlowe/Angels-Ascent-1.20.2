//package net.maisiemarlowe.angelsascent.mixin;
//
//import net.minecraft.client.network.ClientPlayerEntity;
//import net.minecraft.client.input.Input;
//import net.minecraft.entity.player.PlayerAbilities;
//import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
//import net.minecraft.util.math.Vec3d;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.Shadow;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//
//@Mixin(ClientPlayerEntity.class)
//public abstract class ClientPlayerEntityMixin {
//
//    @Shadow
//    private int ticksLeftToDoubleTapSprint;
//
//    @Shadow
//    private PlayerAbilities abilities;
//
//    @Shadow
//    private Input input;
//
//    @Shadow
//    public abstract void sendAbilitiesUpdate();
//
//    @Shadow
//    public abstract Vec3d getVelocity();
//
//    @Shadow
//    public abstract void setVelocity(Vec3d velocity);
//
//    @Inject(method = "tickMovement", at = @At("HEAD"))
//    private void onTickMovement(CallbackInfo ci) {
//        boolean isJumping = this.input.jumping;
//
//        // Handle double-tap jump to toggle flying
//        if (isJumping && this.ticksLeftToDoubleTapSprint == 0) {
//            this.ticksLeftToDoubleTapSprint = 7; // Start countdown to detect double-tap
//        } else if (isJumping && this.ticksLeftToDoubleTapSprint > 0) {
//            this.abilities.flying = !this.abilities.flying; // Toggle flying state
//            this.sendAbilitiesUpdate();
//            this.ticksLeftToDoubleTapSprint = 0; // Reset countdown
//        } else if (this.ticksLeftToDoubleTapSprint > 0) {
//            this.ticksLeftToDoubleTapSprint--; // Decrement countdown
//        }
//
//        // Update player velocity if flying
//        if (this.abilities.flying) {
//            double y = isJumping ? 1.0 : (this.input.sneaking ? -1.0 : 0.0);
//            Vec3d velocity = this.getVelocity();
//            this.setVelocity(new Vec3d(velocity.x, y * this.abilities.getFlySpeed(), velocity.z));
//        }
//    }
//}
