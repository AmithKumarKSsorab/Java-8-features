package com.java.lamdaexpression.methodReference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.lang.*;
public class MethodReferenceDemo {
    public static int addition(int a, int b){
        return (a + b);
    }



    public static void main(String[] args) {

        //1. Method reference to static method
        //lamda expression

        Function<Integer, Double> func = (input)-> Math.sqrt(input);
        System.out.println(func.apply(4));

        //2.With method reference

        Function<Integer, Double> funcmethref =  Math::sqrt;
        System.out.println(funcmethref.apply(6));

        //method reference
        BiFunction<Integer,Integer,Integer> fun = MethodReferenceDemo::addition;
        System.out.println(fun.apply(4,5));



    }
}
