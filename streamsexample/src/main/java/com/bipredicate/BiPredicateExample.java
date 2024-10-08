package com.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    /**
     * BiPredicate
     * Se reciben dos parametros y devuelve boolean
     * 
     */

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> {
            return a > b;
        };

        System.out.println("Resultado: "+biPredicate.test(10, 4));
        System.out.println("Resultado: "+biPredicate.test(10, 43));
    }
}
