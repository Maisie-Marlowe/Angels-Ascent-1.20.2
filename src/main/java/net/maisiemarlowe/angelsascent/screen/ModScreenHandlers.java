package net.maisiemarlowe.angelsascent.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {

    public static final ScreenHandlerType<CompressorScreenHandler> COMPRESSOR_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(AngelsAscent.MOD_ID, "compressing"),
                    new ExtendedScreenHandlerType<>(CompressorScreenHandler::new));


    public static void registerScreenHandlers() {
        AngelsAscent.LOGGER.info("Registering Screen Handlers for " + AngelsAscent.MOD_ID);
    }

}