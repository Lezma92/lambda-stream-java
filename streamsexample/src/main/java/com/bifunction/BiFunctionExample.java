package com.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    /**
     * BiFunction
     * Recibe dos valores y retorna uno
     */
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (a, b) -> {
            return a.length() + b.length();
        };

        System.out.println(biFunction.apply("Hola", "Mundo"));
    }
}
