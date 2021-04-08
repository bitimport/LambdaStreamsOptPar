package com.satya.example;

import java.util.Comparator;

public class LambdaExample {
    public static void main(String[] args) {
        Comparator <String> comparator = new Comparator<>() {
            @Override
            public int compare(String s, String t) {
                return s.length() - t.length();
            }
        };

        System.out.println(comparator.compare("Satya", "Prakash"));

        Comparator <String>comparatorByLambda = (a,b)-> a.length()-b.length();
        System.out.println(comparatorByLambda.compare("Satya", "Prakash"));


        Function myFunction  = a -> String.format("Good Morning %s", a);

        System.out.println(myFunction.greet("Aarna"));
        System.out.println(myFunction.add(5,34).intValue());
        System.out.println(Function.multiply(5,3));

        String name = "Mahesh";
        Function myFunction2 = a -> String.format("Good Morning %s", name);
        System.out.println(myFunction2.greet("me"));

    }
}
