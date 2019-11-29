package de.codecentric.javaland_2020._05_counting;

public class Childsplay {
    static void fun () {
        try {
            Class<?>[] declaredClasses = Integer.class.getDeclaredClasses();
            var cacheField = declaredClasses[0].getDeclaredField("cache");
            cacheField.setAccessible(true);
            var cache = (Integer[]) cacheField.get(null);
            cache[129] = 4;
            cache[130] = 190;
            cache[131] = -3;
        } catch (Throwable t) {
            throw new ExceptionInInitializerError(t);
        }
    }
}
