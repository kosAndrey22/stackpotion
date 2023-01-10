package com.kosoban.stackpotion.Core;

import net.minecraft.world.item.Item;

public class PotionInfo {
    public Item item;
    public int inheritanceDepth;

    public PotionInfo(Item item) {
        this(item, 0);
    }

    public PotionInfo(Item item, int inheritanceDepth) {
        this.item = item;
        this.inheritanceDepth = inheritanceDepth;
    }

}
