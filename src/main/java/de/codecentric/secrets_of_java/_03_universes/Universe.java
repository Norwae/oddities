package de.codecentric.secrets_of_java._03_universes;

import java.util.Base64;

public class Universe {
    private static final byte [] CLASSFILE;

    static {
        CLASSFILE = Base64.getDecoder().decode(
                "yv66vgAAADYAEgoAAwAOBwAPBwAQBwARAQAGPGluaXQ+AQADKClWAQAEQ29kZQEAD0xpbmVOdW1i" +
                        "ZXJUYWJsZQEAEkxvY2FsVmFyaWFibGVUYWJsZQEABHRoaXMBAD9MZGUvY29kZWNlbnRyaWMvc2Vj" +
                        "cmV0c19vZl9qYXZhL18wN191bml2ZXJzZXMvVGhvc2VQZXNreUh1bWFuczsBAApTb3VyY2VGaWxl" +
                        "AQAVVGhvc2VQZXNreUh1bWFucy5qYXZhDAAFAAYBAD1kZS9jb2RlY2VudHJpYy9zZWNyZXRzX29m" +
                        "X2phdmEvXzA3X3VuaXZlcnNlcy9UaG9zZVBlc2t5SHVtYW5zAQAQamF2YS9sYW5nL09iamVjdAEA" +
                        "NGRlL2NvZGVjZW50cmljL3NlY3JldHNfb2ZfamF2YS9fMDdfdW5pdmVyc2VzL1RlcnJhbnMAIQAC" +
                        "AAMAAQAEAAAAAQABAAUABgABAAcAAAAvAAEAAQAAAAUqtwABsQAAAAIACAAAAAYAAQAAAAMACQAA" +
                        "AAwAAQAAAAUACgALAAAAAQAMAAAAAgAN");
    }

    private static final String CLASSNAME = "de.codecentric.secrets_of_java._07_universes.ThosePeskyHumans";

    public static Terrans getMirrorUniverse() throws Exception {
        Class<? extends Terrans> humans = freshTerrans();

        return humans.newInstance();
    }

    private static Class<? extends Terrans> freshTerrans() throws ClassNotFoundException {
        return new ClassLoader(){
            @Override
            protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
                if (name.equals(CLASSNAME)) {
                    return defineClass(CLASSNAME, CLASSFILE, 0, CLASSFILE.length);
                }
                return super.loadClass(name, resolve);
            }
        }.loadClass(CLASSNAME).asSubclass(Terrans.class);
    }

    public static Terrans getOurUniverse()  throws Exception {
        return freshTerrans().newInstance();
    }
}
