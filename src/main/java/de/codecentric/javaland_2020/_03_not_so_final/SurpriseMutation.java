package de.codecentric.javaland_2020._03_not_so_final;

public class SurpriseMutation {
    private final int value;

    public SurpriseMutation(int val) {
        value = val;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) throws Exception {
        var surprise = new SurpriseMutation(100);
        Mutator.mutate(surprise);
        System.out.println(surprise.getValue());
    }
}
