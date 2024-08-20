package com.zoeyahmed.animals.item;

import com.zoeyahmed.animals.Animals;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class modItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Animals.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> VINYL = ITEMS.register("vinyl",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
}
