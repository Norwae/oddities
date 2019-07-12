package de.codecentric.javaland_2020._00_unchecked;

class Loophole {
    private static class Holder<E extends Throwable>  {
        E exception;
        void doThrow() throws E {
            throw exception;
        }
    }

    @SuppressWarnings("unchecked")
    static <R> R _throw(Exception exception) {
        Holder raw = new Holder();
        raw.exception = exception;

        ((Holder<RuntimeException>) raw).doThrow();

        return null;
    }
}
