package co.com.sofka.util;

public enum TipoDocumentoPersonaNatural {
    CEDULA_CIUDADANIA("Cédula de ciudadania"),
    NIT("NIT"),
    PASAPORTE("Pasaporte"),
    CEDULA_EXTRAJERIA("Cédula de extranjería");

    private final String value;

    public String getValue() {
        return value;
    }

    TipoDocumentoPersonaNatural(String value) {
        this.value = value;
    }
}
