package co.com.sofka.util;

public enum Clase {
    ECONOMICA("Economica"),
    PREMIUM_ECONOMY("Premium economy"),
    EJECUTIVA_BUSINESS("Ejecutiva/Business"),
    PRIMERA_CLASE("Primera Clase");

    private final String value;

    public String getValue() {
        return value;
    }

    Clase(String value) {
        this.value = value;
    }
}
