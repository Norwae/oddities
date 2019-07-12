package de.codecentric.javaland_2020._02_resurrection;

public class Resurrection {

    static Object resurrectron;

    public static void main(String[] args) throws Exception {
        resurrectron = new Resurrecting();
        System.out.println(resurrectron);

        for (int i = 0; i < 10; i++){
            resurrectron = null;
            System.gc();
            Thread.sleep(100);
            System.out.println(resurrectron);
        }
    }
}
