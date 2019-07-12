package de.codecentric.javaland_2020._01_unconstructed;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.Base64;

public class Magic {

    static Impossible getImpossible() throws Exception {
        String encoded =
                "rO0ABXNyADlkZS5jb2RlY2VudHJpYy5qYXZhbGFuZF8yMDIwLl8wMV91bmNvbnN0cnVjdGVkLkltcG9zc2libGVY7LX3ysIbUgIAAUwAB21lc3NhZ2V0ABJMamF2YS9sYW5nL1N0cmluZzt4cHQAEkkgYW0gaGVyZSBhbnl3aGVyZQ==";

        var bytes = Base64.getDecoder().decode(encoded);
        var str = new ObjectInputStream(new ByteArrayInputStream(bytes));
        return (Impossible) str.readObject();
    }

}
