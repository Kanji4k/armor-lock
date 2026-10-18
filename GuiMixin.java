package com.example.armorlock.mixin;

import com.example.armorlock.ArmorLock;
import net.minecraft.client.gui.Gui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(Gui.class)
public class GuiMixin {
    /*
     * Vanilla: renderArmor(GuiGraphics, Player, int y, int heartRows, int rowHeight, int x)
     * armorY = y - (heartRows - 1) * rowHeight - 10
     * ordinal = 1 -> the second int argument (heartRows).
     * If heartRows > 1 (extra hearts / absorption), pin it so the bar never moves.
     */
    @ModifyVariable(method = "renderArmor", at = @At("HEAD"), argsOnly = true, ordinal = 1)
    private static int armorlock$lockRows(int heartRows) {
        return heartRows > 1 ? ArmorLock.LOCKED_ROWS : heartRows;
    }
}
