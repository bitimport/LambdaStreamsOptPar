package com.satya.example.functional;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
        c1.accept("sdajs");

    }
}
