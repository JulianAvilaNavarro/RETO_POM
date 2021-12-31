package co.com.sofka.util;

public enum Meses2 {

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

    Meses2(String value) {
        this.value = value;
    }
}
