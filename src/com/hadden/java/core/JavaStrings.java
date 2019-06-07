package com.hadden.java.core;

public class JavaStrings {

    public static void main(String[] args) {
        String s = "Hello World"; // Must be initialized (even to null) if used to compile

        // String pool (moved from PermGen to Heap as of Java 7)
        String a = "A";
        String b = "A";
        System.out.println(a == b); // true because a and b point to string in string pool

        a = new String("A");
        b = new String("A");
        System.out.println(a == b); // false because a and b do not point to string in string pool

        a.intern();
        b.intern();
        a = b;
        System.out.println(a == b); // true because a and b now point to the same string in string pool

        // Concatenation
        a = a.concat("B"); // Does not change a unless assigned
        a += "C";
        System.out.println(a); // ABC
    }

}
