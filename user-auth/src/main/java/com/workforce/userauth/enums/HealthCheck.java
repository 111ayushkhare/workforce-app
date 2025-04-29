package com.workforce.userauth.enums;

public enum HealthCheck {
    SERVER_IS_OK("Server is OK !."),
    SERVER_IS_SICK("Server is Sick !.");

    private final String value;

    HealthCheck(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
