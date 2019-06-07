package com.hadden.java.tdd;

public class Validator {
    public boolean isValid(String value) {
        var valid = false;

        if (value.contains("ABC")) {
            valid = true;
        };

        return valid;
    }
}
