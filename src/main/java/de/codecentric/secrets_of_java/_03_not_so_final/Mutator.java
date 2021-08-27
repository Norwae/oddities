package de.codecentric.secrets_of_java._03_not_so_final;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Mutator {
    private static final Method getDeclaredFieldImpl;

    static {
        var allMethods = Class.class.getDeclaredMethods();
        Method gdf = null;
        for (Method m : allMethods) {
            if (m.getName().equals("getDeclaredFieldImpl")) {
                gdf = m;
                break;
            }
        }
        getDeclaredFieldImpl = gdf;
        getDeclaredFieldImpl.setAccessible(true);
    }

    public static void mutate(SurpriseMutation surprise) throws Exception {
        var field = SurpriseMutation.class.getDeclaredField("value");
        Field metaField = (Field) getDeclaredFieldImpl.invoke(Field.class, "modifiers");
        metaField.setAccessible(true);
        metaField.set(field, ((Integer) metaField.get(field)) & ~Modifier.FINAL);
        field.setAccessible(true);
        field.set(surprise, 250);
    }
}
