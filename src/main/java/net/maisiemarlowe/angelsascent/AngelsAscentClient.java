package net.maisiemarlowe.angelsascent;

import net.fabricmc.api.ClientModInitializer;
import net.maisiemarlowe.angelsascent.block.entity.ModBlockEntities;
//import net.maisiemarlowe.angelsascent.block.entity.client.CompressorBlockRenderer;
import net.maisiemarlowe.angelsascent.screen.CompressorScreen;
import net.maisiemarlowe.angelsascent.screen.ModScreenHandlers;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import software.bernie.geckolib.GeckoLib;

public class AngelsAscentClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModKeyBindings.register();
        GeckoLib.initialize();


        //BlockEntityRendererFactories.register(ModBlockEntities.COMPRESSOR_BLOCK_ENTITY, CompressorBlockRenderer::new);
        HandledScreens.register(ModScreenHandlers.COMPRESSOR_SCREEN_HANDLER, CompressorScreen::new);
    }
}
