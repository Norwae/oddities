package de.codecentric.secrets_of_java._07_everything_changes;

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
