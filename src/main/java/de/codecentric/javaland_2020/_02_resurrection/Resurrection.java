package de.codecentric.javaland_2020._02_resurrection;

public class Resurrection {

    static Immortal immortal = new Immortal();

    public static void main(String[] args) throws Exception {
        do {
            System.out.println(immortal);
            immortal = null;
            System.gc();
            Thread.sleep(500);
        } while (immortal != null);
    }
}
