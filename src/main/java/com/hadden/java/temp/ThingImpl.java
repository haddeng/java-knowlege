package com.hadden.java.temp;

import java.util.function.Function;

public class ThingImpl implements Thing {

    private String s;

    public ThingImpl(String s) {
        this.s = s;
    }

    public String say(Function<ThingImpl, String> f) {
        return f.apply(this);
    }

    public String getS() {
        return this.s;
    }

    @Override
    public void report() {
        System.out.println("REPORTING: " + s);
    }
}
