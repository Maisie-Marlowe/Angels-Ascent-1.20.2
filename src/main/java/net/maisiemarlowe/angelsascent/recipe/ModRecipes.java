package net.maisiemarlowe.angelsascent.recipe;

import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {

    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(AngelsAscent.MOD_ID, CompressorRecipe.Serializer.ID),
                CompressorRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(AngelsAscent.MOD_ID, CompressorRecipe.Type.ID),
                CompressorRecipe.Type.INSTANCE);
    }
}
