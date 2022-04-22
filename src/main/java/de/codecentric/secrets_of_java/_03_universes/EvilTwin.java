package de.codecentric.secrets_of_java._03_universes;

public class EvilTwin {
    public static void main(String[] args) throws Exception {
        Class<? extends Terrans> federation = Universe.getOurUniverse().getClass();
        Class<? extends Terrans> empire = Universe.getMirrorUniverse().getClass();

        System.out.println(empire.getName());
        System.out.println(federation.getName());
        System.out.println("Name equals:" + empire.getName().equals(federation.getName()));
        System.out.println("Class equals:" + empire.equals(federation));
    }
}
