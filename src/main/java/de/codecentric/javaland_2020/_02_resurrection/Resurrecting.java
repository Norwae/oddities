package de.codecentric.javaland_2020._02_resurrection;

public class Resurrecting {

    private class Resurrector {
        @Override
        protected void finalize() throws Throwable {
            resurrect();
        }
    }

    private Resurrector resurrector = new Resurrector();

    void resurrect() {
        Resurrection.resurrectron = this;
        resurrector = new Resurrector();
    }

}
