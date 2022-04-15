package com.learnJava.lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int value =4;

    public static void main(String[] args) {


        // int value =4; //effectively final
        Consumer<Integer> c1 = a -> value=a;

        c1.accept(2);
        System.out.println(value);
    }
}
