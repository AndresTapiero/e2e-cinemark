package com.andrest.Utils;

public enum Constants {

    NAME("Andres"),
    LAST_NAME("Taps"),
    EMAIL("andrestapiero72@yopmail.com"),
    PASSWORD("TestCine123."),
    CARD_NAME("APPROVED"),
    CARD_NUMBER("4093551018099251"),
    EXPIRATION_DATE("0726"),
    CVV("777");

    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
