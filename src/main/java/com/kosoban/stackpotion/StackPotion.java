package com.kosoban.stackpotion;

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
        Item[] itemsToChangeStackSize = Config.getItemsToChangeStackSize();
        String maxStackSizeFieldName = Config.getMaxStackSizeFieldName();
        int newMaxStackSize = Config.getNewMaxStackSize();
        try {
            for (int i = 0; i < itemsToChangeStackSize.length; i += 1) {
                Item currentItem = itemsToChangeStackSize[i];
                ClassUtil.updateFieldRecursive(currentItem, maxStackSizeFieldName, newMaxStackSize);
//                boolean hasStackSizeProp = false;
//                while(!hasStackSizeProp) {
//                    currentItem = currentItem.getSuperclass();
//                    if (currentItem == null) {
//                        break;
//                    }
//                    hasStackSizeProp = ClassUtil.objectHasProperty(currentItem, maxStackSizeFieldName);
//                }
//                if (!hasStackSizeProp) {
//                    continue;
//                }
//                Field field = currentItem.getDeclaredField(maxStackSizeFieldName);
//                field.setAccessible(true);
//                field.set(currentItem, 8);
            }

//            for (int i = 0; i < potionInfo.length; i += 1) {
//                int inheritanceDepth = potionInfo[i].inheritanceDepth;
//                Item potionItem = potionInfo[i].item;
//                Class potionSuperClass = ClassUtil.getParentClassByInheritanceDepth(potionItem.getClass(), inheritanceDepth);
//
//                Field field = potionSuperClass.getDeclaredField(maxStackSizeFieldName);
//                field.setAccessible(true);
//                field.set(potionItem, 8);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
