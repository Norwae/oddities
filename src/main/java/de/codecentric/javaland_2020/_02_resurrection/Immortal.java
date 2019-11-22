package de.codecentric.javaland_2020._02_resurrection;

public class Immortal {

    private class Resurrector {
        @Override
        protected void finalize() {
            Resurrection.immortal = Immortal.this;
            resurrector = new Resurrector();
        }
    }

    private Resurrector resurrector = new Resurrector();

}
