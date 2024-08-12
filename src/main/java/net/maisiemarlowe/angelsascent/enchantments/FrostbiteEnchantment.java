package net.maisiemarlowe.angelsascent.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class FrostbiteEnchantment extends Enchantment {
    public FrostbiteEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, EnchantmentTarget.WEAPON, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return 10 + 20 * (level - 1);
    }

    @Override
    public int getMaxPower(int level) {
        return super.getMinPower(level) + 50;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {

        if(target instanceof LivingEntity livingEntity) {
            // Apply slowness effect
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100 * level, level * 2));

            livingEntity.setOnFireFor(4 * level);
        }

        // Blue fire particles
        if (target.getWorld() instanceof ServerWorld) {

            ServerWorld serverWorld = (ServerWorld) target.getWorld();
            Vec3d targetPos = target.getPos();
            for (int i = 0; i < 10; i++) {
                double xOffset = MathHelper.nextDouble(serverWorld.random, -0.5, 0.5);
                double yOffset = MathHelper.nextDouble(serverWorld.random, 0, 1.0);
                double zOffset = MathHelper.nextDouble(serverWorld.random, -0.5, 0.5);
                serverWorld.spawnParticles(ParticleTypes.SOUL_FIRE_FLAME, targetPos.x + xOffset, targetPos.y + yOffset, targetPos.z + zOffset, 5, 0.1, 0.1, 0.1, 0.1);
            }
        }
    }
}
