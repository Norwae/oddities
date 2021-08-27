package de.codecentric.secrets_of_java._03_universes;

import java.util.Base64;

public class Universe {
    private static final byte[] CLASSFILE = Base64.getDecoder().decode(
            "yv66vgAAADYAEgoAAwAOBwAPBwAQBwARAQAGPGluaXQ+AQADKClWAQAEQ29kZQEAD0xpbmVOdW1i" +
                    "ZXJUYWJsZQEAEkxvY2FsVmFyaWFibGVUYWJsZQEABHRoaXMBADpMZGUvY29kZWNlbnRyaWMvc2Vj" +
                    "cmV0c19vZl9qYXZhL18wM191bml2ZXJzZXMvUGVza3lIdW1hbnM7AQAKU291cmNlRmlsZQEAEFBl" +
                    "c2t5SHVtYW5zLmphdmEMAAUABgEAOGRlL2NvZGVjZW50cmljL3NlY3JldHNfb2ZfamF2YS9fMDNf" +
                    "dW5pdmVyc2VzL1Blc2t5SHVtYW5zAQAQamF2YS9sYW5nL09iamVjdAEANGRlL2NvZGVjZW50cmlj" +
                    "L3NlY3JldHNfb2ZfamF2YS9fMDNfdW5pdmVyc2VzL1RlcnJhbnMAIQACAAMAAQAEAAAAAQABAAUA" +
                    "BgABAAcAAAAvAAEAAQAAAAUqtwABsQAAAAIACAAAAAYAAQAAAAMACQAAAAwAAQAAAAUACgALAAAA" +
                    "AQAMAAAAAgAN");

    private static final String CLASSNAME = "de.codecentric.secrets_of_java._03_universes.PeskyHumans";


    private static Class<? extends Terrans> freshTerrans() throws ClassNotFoundException {
        return new ClassLoader() {
            @Override
            protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
                if (name.equals(CLASSNAME)) {
                    return defineClass(CLASSNAME, CLASSFILE, 0, CLASSFILE.length);
                }
                return super.loadClass(name, resolve);
            }
        }.loadClass(CLASSNAME).asSubclass(Terrans.class);
    }

    public static Terrans getMirrorUniverse() throws Exception {
        return freshTerrans().newInstance();
    }

    public static Terrans getOurUniverse() throws Exception {
        return freshTerrans().newInstance();
    }
}
