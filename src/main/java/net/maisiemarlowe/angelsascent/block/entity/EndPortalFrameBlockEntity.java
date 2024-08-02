package net.maisiemarlowe.angelsascent.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

public class EndPortalFrameBlockEntity extends BlockEntity {

    public static final int MAX_SHARDS = 9;
    private static final long COOLDOWN_PERIOD = 2400; // 2 minutes in ticks (20 ticks per second)

    private int shardsHarvested = 0;
    private long lastHarvestTime = 0;

    public EndPortalFrameBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityType.END_PORTAL, pos, state);
    }

    @Override
    public void readNbt(NbtCompound tag) {
        super.readNbt(tag);
        this.shardsHarvested = tag.getInt("ShardsHarvested");
        this.lastHarvestTime = tag.getLong("LastHarvestTime");
    }

    @Override
    public void writeNbt(NbtCompound tag) {
        super.writeNbt(tag);
        tag.putInt("ShardsHarvested", this.shardsHarvested);
        tag.putLong("LastHarvestTime", this.lastHarvestTime);
    }

    public int getShardsHarvested() {
        return shardsHarvested;
    }

    public void incrementShardsHarvested() {
        if (shardsHarvested < MAX_SHARDS) {
            shardsHarvested++;
        }
    }

    public long getLastHarvestTime() {
        return lastHarvestTime;
    }

    public void startCooldown(long currentTime) {
        lastHarvestTime = currentTime;
        shardsHarvested = 0;
    }

    public boolean isInCooldown(long currentTime) {
        return (currentTime - lastHarvestTime) < COOLDOWN_PERIOD;
    }
}
