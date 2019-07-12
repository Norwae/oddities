package de.codecentric.javaland_2020._02_resurrection;

public class Resurrecting {
    @Override
    protected void finalize() throws Throwable {
        Resurrection.resurrectron = this;
    }
}
