package com.workforce.userauth.constants;

public enum HealthCheckConstants {
    SERVER_IS_OK("Server is OK !."),
    SERVER_IS_SICK("Server is Sick !.");

    private final String value;

    HealthCheckConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
