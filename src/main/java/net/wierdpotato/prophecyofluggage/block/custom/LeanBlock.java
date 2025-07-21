package net.wierdpotato.prophecyofluggage.block.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class LeanBlock extends Block {
    public LeanBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {

       level.playSound(player, pos, SoundEvents.APPLY_EFFECT_BAD_OMEN, SoundSource.BLOCKS, 1f, 1f);
        return InteractionResult.SUCCESS;
    }
}

