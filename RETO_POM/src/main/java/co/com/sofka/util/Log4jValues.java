package co.com.sofka.util;

public enum Log4jValues {
    LOG4J_PROPERTIES_FILE_PATH("\\src\\test\\resources\\log4j\\log4j.properties");

    private final String value;

    Log4jValues(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}