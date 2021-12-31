package co.com.sofka.util;

public enum Bancos {
    BANCOLOMBIA("Bancolombia"),
    BANCOPOPULAR("Femenino"),
    COLPATRIA("Colpatria"),
    BBVA("BBVA"),
    DAVIVIENDA("Davivienda");

    private final String value;

    public String getValue() {
        return value;
    }

    Bancos(String value) {
        this.value = value;
    }
}
