package de.codecentric.secrets_of_java._01_unconstructed;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

import static de.codecentric.secrets_of_java._01_unconstructed.Magic.getImpossible;

public class Impossible implements Serializable {
    private static final long serialVersionUID = 6407696445704641362L;

    private Impossible() {
        throw new AssertionError();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getImpossible());
    }
}

