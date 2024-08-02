package net.maisiemarlowe.angelsascent;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

@Environment(EnvType.CLIENT)
public class ModKeyBindings {

    public static final KeyBinding TOGGLE_WING_SPEED = new KeyBinding(
            "Toggle Wing Flight Speed", // The translation key of the keybinding's name
            GLFW.GLFW_KEY_G, // Default key for the keybinding
            "Angel's Ascent Mod" // The translation key of the keybinding's category
    );

    public static void register() {
        KeyBindingHelper.registerKeyBinding(TOGGLE_WING_SPEED);
    }
}
