package de.codecentric.secrets_of_java._00_unchecked;

import java.io.IOException;

import static de.codecentric.secrets_of_java._00_unchecked.Loophole._throw;


public class Unchecked {

    static String someFunction() {
        return _throw(new IOException());
    }

    public static void main(String[] args) {
        someFunction();
    }
}
