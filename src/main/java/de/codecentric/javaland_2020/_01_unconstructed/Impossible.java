package de.codecentric.javaland_2020._01_unconstructed;

import java.io.Serializable;

public class Impossible implements Serializable {
    private final String message;

    private static final long serialVersionUID = 6407696445704641362L;

    private Impossible() {
        throw new AssertionError();
    }

    @Override
    public String toString() {
        return message;
    }

    public static void main(String[] args) throws Exception {
        Impossible impossible = Magic.getImpossible();

        System.out.println(impossible);
    }
}

