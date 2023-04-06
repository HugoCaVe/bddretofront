package com.retofront.pom.utils;

public enum Constants {
    EMPTY_FIELD("empty");

    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
