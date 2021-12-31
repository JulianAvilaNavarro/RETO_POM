package co.com.sofka.util;

public enum Gender {
    MASCULINO("Masculino"),
    FEMENINO("Femenino");

    private final String value;

    public String getValue() {
        return value;
    }

    Gender(String value) {
        this.value = value;
    }
}
