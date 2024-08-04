package net.maisiemarlowe.angelsascent;

import net.fabricmc.api.ClientModInitializer;
import software.bernie.geckolib.GeckoLib;

public class AngelsAscentClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModKeyBindings.register();
        GeckoLib.initialize();
    }
}
