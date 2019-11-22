package de.codecentric.javaland_2020._02_resurrection;

public class Resurrection {

    static Object immortal = new Immortal();

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 10; i++){
            System.out.println(immortal);
            immortal = null;
            System.gc();
            Thread.sleep(1);
        }
    }
}
