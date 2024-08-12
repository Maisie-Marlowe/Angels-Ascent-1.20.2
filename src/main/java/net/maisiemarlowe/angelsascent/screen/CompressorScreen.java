package net.maisiemarlowe.angelsascent.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.maisiemarlowe.angelsascent.AngelsAscent;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class CompressorScreen extends HandledScreen<CompressorScreenHandler> {

    private static final Identifier TEXTURE = new Identifier(AngelsAscent.MOD_ID,
            "textures/gui/compressor_block_gui.png");


    public CompressorScreen(CompressorScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleY = 1000;
        playerInventoryTitleY = 1000;
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);

        renderProgressArrow(context, x, y);
        renderFuelDisplay(context, x, y);
    }

    private void renderProgressArrow(DrawContext context, int x, int y) {
        if(handler.isCrafting()) {
            //(x, y, u, v, width)
            //(where we want it to be = x, y)
            //u = offset v = where texture starts vertically
            context.drawTexture(TEXTURE, x + 87 - 9, y + 30, 176, 14, 21, handler.getScaledProgress());
        }
    }

    private void renderFuelDisplay(DrawContext context, int x, int y) {
        if(handler.hasFuel()) {
            context.drawTexture(TEXTURE, x + 57, y + 37 + 14 - 1 - handler.getScaledFuelProgress(), 176, 14 - 1 - handler.getScaledFuelProgress(), 15, handler.getScaledFuelProgress());
        }
    }


    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
