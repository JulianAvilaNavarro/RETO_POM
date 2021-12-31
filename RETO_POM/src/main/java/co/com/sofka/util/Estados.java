package co.com.sofka.util;

public enum Estados {
    BOGOTA("Bogotá D.C."),
    TOLIMA("Tolima"),
   ANTIOQUIA("Antioquia");

    private final String value;

    public String getValue() {
        return value;
    }

    Estados(String value) {
        this.value = value;
    }
}
