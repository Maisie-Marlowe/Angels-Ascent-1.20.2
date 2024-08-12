package net.maisiemarlowe.angelsascent.mixin;

import net.maisiemarlowe.angelsascent.item.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerPlayerEntity.class)
public abstract class ServerPlayerEntityMixin {

    private static final RegistryKey<DamageType> FALL = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, new Identifier("fall"));

    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    private void onDamage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        ServerPlayerEntity player = (ServerPlayerEntity) (Object) this;
        ItemStack chestStack = player.getEquippedStack(EquipmentSlot.CHEST);
        boolean hasWingsEquipped = chestStack.isOf(ModItems.HOLY_WINGS) || chestStack.isOf(ModItems.BLASPHEMOUS_WINGS);

        if (hasWingsEquipped && source.isOf(FALL)) {
            // Cancel fall damage if the player is wearing the wings
            cir.setReturnValue(false);
        }
    }
}
