package de.codecentric.secrets_of_java._03_universes;

public class EvilTwin {
    public static void main(String[] args) throws Exception {
        Class<? extends Terrans> federation = Universe.getOurUniverse().getClass();
        Class<? extends Terrans> empire = Universe.getMirrorUniverse().getClass();

        System.out.println(empire.getName().equals(federation.getName()));
        System.out.println(empire.equals(federation));
    }
}
