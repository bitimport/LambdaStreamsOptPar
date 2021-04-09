package com.satya.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {

    static List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0,5,12,45,78,353,23377,
            124,143,232,54621,56,2354122,45,18);
    public static void main(String[] args) {

        Predicate<Integer> isEven = a -> a%2 == 0;
        Predicate<Integer> isGreaterThan100 = a -> a > 100 ;
        Predicate<Integer> isDivisibleBy5  = a -> a%5 == 0;

        Consumer<Integer> testAll = a -> {
            if(isEven.and(isGreaterThan100).test(a)){
                System.out.println(a);
            }
        };

        numbers.forEach(testAll);


    }
}
