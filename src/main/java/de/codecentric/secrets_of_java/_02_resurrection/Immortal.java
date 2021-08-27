package de.codecentric.secrets_of_java._02_resurrection;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Immortal {

    private class Resurrector {
        @Override
        protected void finalize() {
            Resurrection.immortal = Immortal.this;
            resurrector = new Resurrector();
        }
    }

    private Resurrector resurrector = new Resurrector();

    @Override
    public String toString() {
        return LocalTime.now().truncatedTo(ChronoUnit.SECONDS) + ": " + "Still alive";
    }
}
