package com.satya.example;

import java.util.Comparator;

public class LambdaExample {
    public static void main(String[] args) {
        Comparator <String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s, String t) {
                return s.length()-t.length();
            }
        };

        System.out.println(comparator.compare("Satya", "Prakash"));

        Comparator <String>comparatorByLambda = (a,b)-> a.length()-b.length();
        System.out.println(comparatorByLambda.compare("Satya", "Prakash"));


        Function myFunction  = a -> "Good Morning "+a;

        System.out.println(myFunction.greet("Satya"));

    }
}
