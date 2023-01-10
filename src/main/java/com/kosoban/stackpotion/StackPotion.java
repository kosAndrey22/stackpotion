package com.kosoban.stackpotion;

import com.kosoban.stackpotion.Core.PotionInfo;
import com.kosoban.stackpotion.Utils.ClassUtil;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;

import java.lang.reflect.Field;


@Mod(StackPotion.MODID)
public class StackPotion
{
    public static final String MODID = "stackpotion";

    public StackPotion() {
        this.changePotionStackSize();
    }

    private void changePotionStackSize() {
        PotionInfo[] potionInfo = Config.getPotionConfig();
        String maxStackSizeFieldName = Config.getMaxStackSizeFieldName();
        try {
            for (int i = 0; i < potionInfo.length; i += 1) {
                int inheritanceDepth = potionInfo[i].inheritanceDepth;
                Item potionItem = potionInfo[i].item;
                Class potionSuperClass = ClassUtil.getParentClassByInheritanceDepth(potionItem.getClass(), inheritanceDepth);

                Field field = potionSuperClass.getDeclaredField(maxStackSizeFieldName);
                field.setAccessible(true);
                field.set(potionItem, 8);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
