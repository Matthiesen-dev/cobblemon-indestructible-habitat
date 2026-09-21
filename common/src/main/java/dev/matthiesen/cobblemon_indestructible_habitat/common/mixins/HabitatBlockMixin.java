package dev.matthiesen.cobblemon_indestructible_habitat.common.mixins;

import com.cobblemon.mod.common.CobblemonBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockBehaviour.BlockStateBase.class)
public class HabitatBlockMixin {
    @Inject(method = "getDestroySpeed", at = @At("HEAD"), cancellable = true)
    private void makeIndestructible(BlockGetter blockGetter, BlockPos blockPos, CallbackInfoReturnable<Float> cir) {
        BlockBehaviour.BlockStateBase state = (BlockBehaviour.BlockStateBase) (Object) this;
        if (state.is(CobblemonBlocks.HABITAT_BLOCK)) {
            cir.setReturnValue(-1.0F);
        }
    }
}
