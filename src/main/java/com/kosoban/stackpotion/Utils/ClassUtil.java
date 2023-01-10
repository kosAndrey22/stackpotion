package com.kosoban.stackpotion.Utils;

public class ClassUtil {
    public static Class getParentClassByInheritanceDepth(Class childClass, int depth) {
        if (depth == 0) {
            return childClass;
        }
        return ClassUtil.getParentClassByInheritanceDepth(childClass.getSuperclass(), depth - 1);
    }

}
