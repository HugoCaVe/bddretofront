package com.retofront.pom.utils;

public enum AssertionMessages {
    ERROR_VALIDATE_CONTENT("Error validating Content"),
    ERROR_VALUE_NOT_FOUND("Error, value not found "),
    ERROR_MAIN_PAGE_NOT_FOUND("Error, main page not found ");

    private String value;

    AssertionMessages(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}