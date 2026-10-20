package kate.makes.refraction.mixin;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;



@Mixin(Entity.class)
public abstract class VisibilityMixin {
    @Shadow
    public abstract Component getName();

    @Inject(method="isInvisibleTo", at = @At("HEAD"), cancellable = true)
    private void setVisibilityForYourself(Player player, CallbackInfoReturnable<Boolean> cir){
        if (player.getName().equals(this.getName())) {

            cir.setReturnValue(false);

        }

    }
}