package de.codecentric.javaland_2020._05_surprise_children;


public class ChildFromNowhere {
    private interface UnimplementedInterface {
        String foo();
        String bar(int x, int y);
    }

    public static void main(String[] args) {
        System.out.println(Spawn.anInstanceOf(UnimplementedInterface.class).foo());
        System.out.println(Spawn.anInstanceOf(UnimplementedInterface.class).bar(7, 9));
        System.out.println(Spawn.anInstanceOf(UnimplementedInterface.class));
    }
}
