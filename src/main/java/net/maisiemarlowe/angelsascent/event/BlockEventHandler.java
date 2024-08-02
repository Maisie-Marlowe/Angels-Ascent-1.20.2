package net.maisiemarlowe.angelsascent.event;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.maisiemarlowe.angelsascent.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.EndPortalFrameBlock;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class BlockEventHandler {

    // Stores the harvest data for each block
    private static final Map<BlockPos, HarvestData> harvestDataMap = new HashMap<>();
    public static final Logger LOGGER = LoggerFactory.getLogger(AngelsAscent.MOD_ID);

    public static void registerBlockEvents() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> onBlockUse(player, world, hand, hitResult));
    }

    private static ActionResult onBlockUse(PlayerEntity player, World world, Hand hand, BlockHitResult hitResult) {
        if (!world.isClient) {
            BlockPos pos = hitResult.getBlockPos();
            BlockState state = world.getBlockState(pos);

            // Check if the block is an End Portal Frame and has an Eye of Ender
            if (state.getBlock() == Blocks.END_PORTAL_FRAME && state.get(EndPortalFrameBlock.EYE)) {
                // Get the item in hand
                ItemStack heldItem = player.getStackInHand(hand);
                Item item = heldItem.getItem();

                // Check if the player is holding an appropriate tool
                if (item instanceof AxeItem || item instanceof PickaxeItem || item instanceof ShovelItem || item instanceof HoeItem) {
                    HarvestData data = harvestDataMap.computeIfAbsent(pos, k -> new HarvestData());

                    // Check if within cooldown period
                    long currentTime = world.getTime();
                    if (currentTime - data.getLastHarvestTime() < data.COOLDOWN_PERIOD) {
                        long remainingTime = data.COOLDOWN_PERIOD - (currentTime - data.getLastHarvestTime());
                        LOGGER.info("Attempted to harvest from End Portal Frame at {} during cooldown. Time remaining: {} ticks.", pos, remainingTime);
                        // Show cooldown particles
                        world.addParticle(ParticleTypes.SMOKE, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 0, 0, 0);
                        return ActionResult.FAIL;
                    }

                    // Check if the max number of shards has been harvested
                    if (data.getShardsHarvested() < HarvestData.MAX_SHARDS) {
                        // Drop the custom Ender Shard item
                        ItemStack enderShard = new ItemStack(ModItems.ENDER_SHARD);
                        world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), enderShard));
                        data.incrementShardsHarvested();
                        LOGGER.info("Harvested Ender Shard from End Portal Frame at {}. Total shards: {}.", pos, data.getShardsHarvested());
                    } else {
                        // Start the cooldown period
                        data.startCooldown(currentTime);
                        LOGGER.info("Max shards harvested from End Portal Frame at {}. Starting cooldown. Time remaining: {} ticks.", pos, data.COOLDOWN_PERIOD);
                    }

                    return ActionResult.SUCCESS;
                }
            }
        }

        return ActionResult.PASS;
    }

    // Inner class to track harvest data
    private static class HarvestData {
        static final int MAX_SHARDS = 9;
        static final long COOLDOWN_PERIOD = 2400; // 2 minutes in ticks (20 ticks per second)
        private int shardsHarvested = 0;
        private long lastHarvestTime = 0;

        int getShardsHarvested() {
            return shardsHarvested;
        }

        void incrementShardsHarvested() {
            shardsHarvested++;
        }

        long getLastHarvestTime() {
            return lastHarvestTime;
        }

        void startCooldown(long currentTime) {
            shardsHarvested = 0;
            lastHarvestTime = currentTime;
        }
    }
}
