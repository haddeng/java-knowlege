package com.hadden.java.temp;

import java.util.List;

public class MyGeneric<T> {

    public void add(List<T> list, T t) {
        list.add(t);
    }

    public void add2(List<?> list, T t) {
        //list.add(1); ERROR
    }

    public <X extends Number> void add3(List<X> x) {
        //x.add(new Integer(5)); ERROR
    }

    public <Y> void doIt(Y y) {

    }
}
