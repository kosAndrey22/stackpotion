package com.kosoban.stackpotion;

import com.kosoban.stackpotion.Core.PotionInfo;
import net.minecraft.world.item.Items;

public class Config {
    private static final String maxStackSizeFieldName = "f_41370_";
    private static final PotionInfo[] potionInfo = new PotionInfo[] {
            new PotionInfo(Items.POTION, 1),
            new PotionInfo(Items.SPLASH_POTION, 3),
            new PotionInfo(Items.LINGERING_POTION, 3),
    };

    public static String getMaxStackSizeFieldName() {
        return Config.maxStackSizeFieldName;
    }

    public static PotionInfo[] getPotionConfig() {
        return Config.potionInfo;
    }

}
