package com.andrest.Utils;

public enum Constants {

    NAME("Andres"),
    LAST_NAME("Taps"),
    EMAIL("andrestapiero72@yopmail.com"),
    PASSWORD("TestCine123.");

    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}