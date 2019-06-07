package com.hadden.java.temp;

public class Parent {

    protected int data = 5;

    public void call(Child o) {
        System.out.println("Data = " + o.data);
    }
}
