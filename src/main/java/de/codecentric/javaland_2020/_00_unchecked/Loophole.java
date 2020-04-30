package de.codecentric.javaland_2020._00_unchecked;

class Loophole {
    private static class Holder<E extends Throwable>  {
        private final E exception;

        public Holder(E exception) {
            this.exception = exception;
        }

        void doThrow() throws E {
            throw exception;
        }
    }

    static <R, E extends Throwable> R _throw(E exception) {
        Holder raw = new Holder<>(exception);
        Holder<RuntimeException> sneaky = raw;
        sneaky.doThrow();

        return null;
    }
}
