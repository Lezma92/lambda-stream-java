package com.callable;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) {
        
        /**
         * Callable
         * No recibe ningun parametro de entrada, permite retornar un resultado y
         * puede lanzar exceptions
         * 
         */

        Callable<String> callable = () -> {
            return "Resultado de la tarea";
        };

        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
