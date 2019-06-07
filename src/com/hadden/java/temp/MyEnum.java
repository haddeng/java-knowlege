package com.hadden.java.temp;

public enum MyEnum {
    BANANA("yellow"),
    APPLE("green"),
    ORANGE("orange");

    private String colour;

    private MyEnum(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
