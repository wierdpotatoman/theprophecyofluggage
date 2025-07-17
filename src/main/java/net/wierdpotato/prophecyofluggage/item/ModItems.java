package net.wierdpotato.prophecyofluggage.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.wierdpotato.prophecyofluggage.ProphecyofLuggage;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProphecyofLuggage.MOD_ID);

public static final DeferredItem<Item> LUGGAGE = ITEMS.register("luggage",
        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
