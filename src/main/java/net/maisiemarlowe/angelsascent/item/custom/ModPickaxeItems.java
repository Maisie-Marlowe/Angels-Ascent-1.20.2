package net.maisiemarlowe.angelsascent.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModPickaxeItems extends PickaxeItem {
    private final boolean unbreakable;

    public ModPickaxeItems(ToolMaterial material, int attackDamage, float attackSpeed, boolean unbreakable, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.unbreakable = unbreakable;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        if(unbreakable) {
            NbtCompound nbt = stack.getOrCreateNbt();
            nbt.putBoolean("Unbreakable", true);
        }
    }

    @Override
    public boolean isDamageable() {
        return !unbreakable;
    }
}
