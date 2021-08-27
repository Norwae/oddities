package de.codecentric.secrets_of_java._04_equality_of_the_integers;

public class Equality {
    public static void main(String[] args) {
        for (int i = 126; i < 130; i++) {
            System.out.println(Integer.valueOf(i) == Integer.valueOf(i));
        }
    }
}
