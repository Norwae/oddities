package de.codecentric.javaland_2020._01_unconstructed;

import java.io.Serializable;

import static de.codecentric.javaland_2020._01_unconstructed.Magic.getImpossible;

public class Impossible implements Serializable {
    private static final long serialVersionUID = 6407696445704641362L;

    private Impossible() {
        throw new AssertionError();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getImpossible());
    }
}

