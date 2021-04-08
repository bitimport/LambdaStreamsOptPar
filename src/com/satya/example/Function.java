package com.satya.example;

import java.math.BigDecimal;

public interface Function {

    String greet(String a);

    default BigDecimal add(Integer a, Integer b){
        return BigDecimal.valueOf(a + b);
    }

    static int multiply(int a, int b){
        return a*b;
    }
}
