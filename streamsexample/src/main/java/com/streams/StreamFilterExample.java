package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Misael", "Eva Judith", "Ivan", "Willian", "Eva", "One");

        // nombres.stream().forEach((nombre) -> System.out.println(nombre));

        // filter(): Filtra los elementos que cumplen una condicion

        nombres.stream().filter((nombre) -> {
            return nombre.contains("Eva");
        }).forEach((nombre) -> {
            System.out.println(nombre);
        });
        
        System.out.println("");
        nombres.stream().filter((nombre) -> {
            return nombre.length() > 3;
        }).forEach((nombre) -> {
            System.out.println(nombre);
        });
    
    }
}
