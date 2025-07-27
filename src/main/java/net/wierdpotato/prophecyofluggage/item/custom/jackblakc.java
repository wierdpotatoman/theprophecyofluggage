package net.wierdpotato.prophecyofluggage.item.custom;

import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.wierdpotato.prophecyofluggage.sound.ModSoundEvents;

public class jackblakc extends Item {
    public jackblakc(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity interactionTarget, InteractionHand usedHand) {
        if (!player.level().isClientSide) {
            player.level().playSound(null, player.blockPosition(), ModSoundEvents.FLINTNSTEEL.get(), SoundSource.PLAYERS, 1.0f, 1.0f
            );

                interactionTarget.setRemainingFireTicks(80);

            EquipmentSlot slot = usedHand == InteractionHand.MAIN_HAND
                    ? EquipmentSlot.MAINHAND
                    : EquipmentSlot.OFFHAND;


                stack.hurtAndBreak(1, player, slot);
        }


        return InteractionResult.SUCCESS;
    }



}

