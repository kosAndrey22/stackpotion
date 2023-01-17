package com.kosoban.stackpotion;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class Config {
    private static final String maxStackSizeFieldName = "f_41370_";
    private static final int newMaxStackSize = 8;
    private static final Item[] itemsToChangeStackSize = new Item[] {
            Items.POTION,
            Items.SPLASH_POTION,
            Items.LINGERING_POTION,
    };

    public static String getMaxStackSizeFieldName() {
        return Config.maxStackSizeFieldName;
    }

    public static Item[] getItemsToChangeStackSize() {
        return Config.itemsToChangeStackSize;
    }
    public static int getNewMaxStackSize() {
        return Config.newMaxStackSize;
    }

}
