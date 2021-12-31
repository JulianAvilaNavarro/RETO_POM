package co.com.sofka.util;

public enum Meses {

    ENERO(" ene "),
    FEBRERO(" feb "),
    MARZO(" mar "),
    ABRIL(" abr "),
    MAYO(" may "),
   JUNIO(" jun "),
    JULIO(" jul "),
    AGOSTO(" ago "),
    SEPTIEMBRE(" sep "),
    OCTUBRE(" oct "),
    NOVIEMBRE(" nov "),
    DICIEMBRE(" dic ");

    private final String value;

    public String getValue() {
        return value;
    }

    Meses(String value) {
        this.value = value;
    }
}
