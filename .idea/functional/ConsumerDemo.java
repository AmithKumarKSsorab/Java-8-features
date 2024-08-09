package com.java.lamdaexpression.functional;


import java.util.function.Consumer;

class Consumerimpl implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> res =(s)-> System.out.println(s);
        res.accept("helloman");

    }
}
