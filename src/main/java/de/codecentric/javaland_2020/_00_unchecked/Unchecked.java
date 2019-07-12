package de.codecentric.javaland_2020._00_unchecked;

import java.io.IOException;

import static de.codecentric.javaland_2020._00_unchecked.Loophole._throw;


public class Unchecked {

    static String someFunction() {
        return _throw(new IOException());
    }

    public static void main(String[] args) {
        someFunction();
    }
}
