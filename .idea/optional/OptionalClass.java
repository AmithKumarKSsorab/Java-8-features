package com.java.lamdaexpression.optional;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        String email = null;
        //of, empty, ofnullable -- these are all the three static methods that are used to create a
        //optional object.

        // how to create  a empty optional object

        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

//        Optional<Object> emailof =Optional.of(email);
//        System.out.println(emailof);

        Optional<Object> ofnullableobject  = Optional.ofNullable(email);
        System.out.println(ofnullableobject);


    }
}
