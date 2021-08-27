package de.codecentric.secrets_of_java._07_everything_changes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Mutator {
    private static final Method getDeclaredField0;

    static {
        var allMethods = Class.class.getDeclaredMethods();
        Method gdf = null;
        for (Method m : allMethods) {
            if (m.getName().equals("getDeclaredFields0")) {
                gdf = m;
                break;
            }
        }
        getDeclaredField0 = gdf;
        getDeclaredField0.setAccessible(true);
    }

    public static void mutate(SurpriseMutation surprise) throws Exception {
        var value = SurpriseMutation.class.getDeclaredField("value");
        var fields = (Field[]) getDeclaredField0.invoke(Field.class, false);

        for (var field : fields) {
            if (field.getName().equals("modifiers")) {
                field.setAccessible(true);
                field.set(field, ((Integer) field.get(field)) & ~Modifier.FINAL);
            }
        }
        value.setAccessible(true);
        value.set(surprise, 250);
    }
}
