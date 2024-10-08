package com.runnable;

public class RunnableExample {
    public static void main(String[] args) {
        /**
         * Runnable 
         * No recibe ningun parametro solo ejecuta una tarea
         * 
         */

         Runnable runnable = ()->{
            System.out.println("ejecutando tarea");
         };
         runnable.run();
    }
}
