package de.codecentric.secrets_of_java._01_unconstructed;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.Base64;

public class Magic {

    static Impossible getImpossible() throws Exception {
        String encoded =
                "rO0ABXNyADtkZS5jb2RlY2VudHJpYy5zZWNyZXRzX29mX2phdmEuXzAxX3VuY29uc3RydWN0ZWQuSW1wb3NzaWJsZVjstffKwhtSAgAAeHA=";

        var bytes = Base64.getDecoder().decode(encoded);
        var str = new ObjectInputStream(new ByteArrayInputStream(bytes));
        return (Impossible) str.readObject();
    }

}
