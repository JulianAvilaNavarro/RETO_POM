package co.com.sofka.util;

public enum Ciudades {
    BOGOTA("Bogotá, Bogotá D.C., Colombia"),
    IBAGUE("Ibagué, Tolima, Colombia"),
   MEDELLIN("Medellín, Antioquia, Colombia");

    private final String value;

    public String getValue() {
        return value;
    }

    Ciudades(String value) {
        this.value = value;
    }
}
