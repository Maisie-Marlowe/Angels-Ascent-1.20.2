package net.maisiemarlowe.angelsascent.block.entity;

import io.wispforest.owo.util.ImplementedInventory;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.maisiemarlowe.angelsascent.recipe.CompressorRecipe;
import net.maisiemarlowe.angelsascent.screen.CompressorScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class CompressorBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {

    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);

    private static final int INPUT_SLOT = 0;
    private static final int OUTPUT_SLOT = 1;
    private static final int FUEL_SLOT = 2;

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 360;
    private int fuelTime = 0;
    private int maxFuelTime = 0;

    public CompressorBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.COMPRESSOR_BLOCK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> CompressorBlockEntity.this.progress;
                    case 1 -> CompressorBlockEntity.this.maxProgress;
                    case 2 -> CompressorBlockEntity.this.fuelTime;
                    case 3 -> CompressorBlockEntity.this.maxFuelTime;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> CompressorBlockEntity.this.progress = value;
                    case 1 -> CompressorBlockEntity.this.maxProgress = value;
                    case 2 -> CompressorBlockEntity.this.fuelTime = value;
                    case 3 -> CompressorBlockEntity.this.maxFuelTime = value;
                }
            }

            @Override
            public int size() {
                return 3;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("compressor_block.progress", progress);
        nbt.putInt("compressor_block.fuelTime", fuelTime);
        nbt.putInt("compressor_block.maxFuelTime", maxFuelTime);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("compressor_block.progress");
        fuelTime = nbt.getInt("compressor_block.fuelTime");
        maxFuelTime = nbt.getInt("compressor_block.maxFuelTime");

    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    private void consumeFuel() {
        if(!getStack(2).isEmpty()) {
            ItemStack fuelStack = this.getStack(FUEL_SLOT);
            this.fuelTime = FuelRegistry.INSTANCE.get(this.removeStack(2, 1).getItem());
            this.maxFuelTime = this.fuelTime;
            fuelStack.decrement(1);
        }
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("Compressor");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new CompressorScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if (world.isClient()) {
            return;
        }
        if(isConsumingFuel()) {
            this.fuelTime--;
        }
        if (isOutputSlotEmptyOrReceivable()) {
            if (this.hasRecipe()) {
                if(hasFuelInFuelSlot() && fuelTime <= 0) {
                    this.consumeFuel();
                }
                    if (this.fuelTime > 0) {

                    this.increaseCraftProgress();
                    markDirty(world, pos, state);

                    //System.out.println("Progress: " + this.progress);

                    if (hasCraftingFinished()) {
                        this.craftItem();
                        this.resetProgress();
                    }
                } else {
                    this.resetProgress();
                }
            } else {
                this.resetProgress();
                markDirty(world, pos, state);
            }
        }
    }

    private boolean hasFuelInFuelSlot() {return !this.getStack(FUEL_SLOT).isEmpty();}

    private boolean isConsumingFuel() {return this.fuelTime > 0;}

    private void resetProgress() {
        this.progress = 0;
    }


    private void craftItem() {
        Optional<RecipeEntry<CompressorRecipe>> recipe = getCurrentRecipe();

        this.removeStack(INPUT_SLOT, 1);


        this.setStack(OUTPUT_SLOT, new ItemStack(recipe.get().value().getResult(null).getItem(),
                getStack(OUTPUT_SLOT).getCount() + recipe.get().value().getResult(null).getCount()));

    }

    private boolean hasCraftingFinished() {
        return progress >= maxProgress;

    }

    private void increaseCraftProgress() {
        progress++;

    }

    private boolean hasRecipe() {
        Optional<RecipeEntry<CompressorRecipe>> recipe = getCurrentRecipe();


        return recipe.isPresent() && canInsertAmountIntoOutputSlot(recipe.get().value().getResult(null))
                && canInsertItemIntoOutputSlot(recipe.get().value().getResult(null).getItem());
    }

    private Optional<RecipeEntry<CompressorRecipe>> getCurrentRecipe() {
        SimpleInventory inv = new SimpleInventory(this.size());
        for (int i = 0; i < this.size(); i++) {
            inv.setStack(i, this.getStack(i));
        }
        return getWorld().getRecipeManager().getFirstMatch(CompressorRecipe.Type.INSTANCE, inv, getWorld());
    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.getStack(OUTPUT_SLOT).getItem() == item || this.getStack(OUTPUT_SLOT).isEmpty();
    }

    private boolean canInsertAmountIntoOutputSlot(ItemStack result) {
        return this.getStack(OUTPUT_SLOT).getCount() + result.getCount() <= getStack(OUTPUT_SLOT).getMaxCount();
    }

    private boolean isOutputSlotEmptyOrReceivable() {
        return this.getStack(OUTPUT_SLOT).isEmpty() || this.getStack(OUTPUT_SLOT).getCount() < this.getStack(OUTPUT_SLOT).getMaxCount();
    }


}


