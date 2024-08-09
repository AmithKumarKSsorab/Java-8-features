package com.java.lamdaexpression.functional;


import java.sql.SQLOutput;
import java.util.function.Function;

class FunctionalImpl implements Function<String,Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class Functional {
    public static void main(String[] args) {
//        Function<String, Integer>func = new FunctionalImpl();
//        int res = func.apply("Amith");
//        System.out.println(res);

        Function<String,Integer> func = (String s)-> s.length();
        System.out.println(func.apply("Amithkumar"));


    }
}
