package co.com.sofka.util;

public enum PaisesOrigen {
    COLOMBIA("Colombia"),
    CHILE("Chile"),
    HOLANAD("Holanda");

    private final String value;

    public String getValue() {
        return value;
    }

    PaisesOrigen(String value) {
        this.value = value;
    }
}
