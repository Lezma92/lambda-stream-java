package com.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    /**
     * 
     * BiConsumer
     * Recibe dos parametros pero no devuelve nada
    */
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (param1, param2)->{
            System.out.println(String.format("Mis datos enviados texto: {} - num: {}"+ param1, param2));
        };
        biConsumer.accept("Misael lezma mesino", "Nuevo");
        
    }

}
