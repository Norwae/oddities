package de.codecentric.secrets_of_java._05_surprise_children;

import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Spawn {

    static <T> T anInstanceOf(Class<T> clazz) {
        return clazz.cast(Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[]{
                clazz
        }, (proxy, method, args) -> "Invoked method " + method + " on proxy " + proxy.getClass() + " with " + Arrays.toString(args)));
    }
}
