package net.maisiemarlowe.angelsascent.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class LightningEnchantment  extends Enchantment {
    protected LightningEnchantment(Rarity rarity, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(rarity, target, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {

        if(!user.getWorld().isClient()) {
            ServerWorld world = ((ServerWorld) user.getWorld());
            PlayerEntity player = ((PlayerEntity) user);
            BlockPos position = target.getBlockPos();

            if(level == 1) {

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

            }

            if(level == 2) {

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

            }

            if(level == 3) {

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

            }

            if(level == 4) {

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);

            }

        }


        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 4;
    }



}
