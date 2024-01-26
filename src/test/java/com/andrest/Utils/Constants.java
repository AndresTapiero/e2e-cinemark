package com.andrest.Utils;

public enum Constants {

    NAME("Andres"),
    NEW_NAME("Pedro"),
    LAST_NAME("Taps"),
    EMAIL("andrestapiero72@yopmail.com"),
    PHONE("3182149258"),
    ADDRESS("Calle 132 # 12-98"),
    DOCUMENT_NUMBER("10451787"),
    NEW_EMAIL("andrestapiero92@yopmail.com"),
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
