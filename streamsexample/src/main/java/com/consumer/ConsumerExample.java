package com.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    /*
     * Consumer
     * Recibe un valo pero no devuelve nada
     */
    public static void main(String[] args) {
        Consumer<String[]> consumer = (param) -> {
            for(String inf : param){
                System.out.println(inf);
            }
        };

        String[] datos = new String[3];
        datos[0] = "Misael";
        datos[1] = "Lezma";
        datos[2] = "Mesino";
         consumer.accept(datos);
    }
}
 