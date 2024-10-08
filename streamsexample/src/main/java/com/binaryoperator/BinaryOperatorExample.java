package com.binaryoperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    /**
     * Recibe dos parametros del mismo tipo y retorna un valor del mismo
     * 
     */
    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;

        System.out.println("Suma: " + binaryOperator.apply(10, 30));
    }
}
