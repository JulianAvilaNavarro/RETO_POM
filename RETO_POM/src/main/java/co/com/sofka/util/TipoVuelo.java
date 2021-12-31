package co.com.sofka.util;

public enum TipoVuelo {
    IDAVUELTA ("Ida y vuelta"),
    SOLOIDA("Solo ida"),
    MULTIDESTINO("Multidestino");

    private final String value;

    public String getValue() {
        return value;
    }

    TipoVuelo(String value) {
        this.value = value;
    }
}
