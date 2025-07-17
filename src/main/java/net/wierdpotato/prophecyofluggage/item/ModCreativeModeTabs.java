package net.wierdpotato.prophecyofluggage.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.wierdpotato.prophecyofluggage.ProphecyofLuggage;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProphecyofLuggage.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LUGGAGE_ITEMS_TAB = CREATIVE_MODE_TABS.register("luggage_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LUGGAGE.get()))
                    .title(Component.translatable("creativetab.prophecyofluggage.luggage_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LUGGAGE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
