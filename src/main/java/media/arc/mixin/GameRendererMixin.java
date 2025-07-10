package media.arc.mixin;

import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(GameRenderer.class)
public class GameRendererMixin {

    /**
     * @author Arc
     * @reason Remove camera tilt when taking damage
     */
    @Overwrite
    public void bobViewWhenHurt(MatrixStack matrices, float tickDelta) {
        // do nothing lol
    }
}

