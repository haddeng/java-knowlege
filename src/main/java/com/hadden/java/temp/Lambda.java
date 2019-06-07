package com.hadden.java.temp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda {

    public void run() {
        List<String> list = Arrays.asList("One", "Two", "Three");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.forEach((s) -> System.out.println("LAMB: " + s));

        ThingImpl thing = new ThingImpl("Yo");
        System.out.println(thing.say(t -> {
            return "SAYING " + t.getS();
        }));

        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("e");
            }
        }).forEach(p -> System.out.println(p));

        list.stream().filter(p -> p.contains("e")).forEach(p -> System.out.println(p));
        list.parallelStream().filter(p -> p.contains("e")).forEach(p -> System.out.println(p));
        list.stream().map(p -> {
            return p + "ALTERED";
        }).forEach(p -> System.out.println(p));

        list.forEach(System.out::println);

        new Thread(() -> System.out.println("in run")).start();
    }
}
