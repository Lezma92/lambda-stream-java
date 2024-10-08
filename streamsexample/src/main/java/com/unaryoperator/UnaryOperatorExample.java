package com.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    /**
     * UnaryOperator
     * 
     * Recibe un parametro, lo procesa y devuelve un resultado del mismo tipo
     */
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println("Multi: " + unaryOperator.apply(26));
    }

}
