package co.com.sofka.util;

public enum TiemposEspera  {

    TIME10(10),
    TIME60(60),
    TIME100(100);

    private int value;

    public int getValue() {
        return value;
    }

    TiemposEspera(int value) {
        this.value = value;
    }
}
