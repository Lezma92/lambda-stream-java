package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamMapExample {
    public static void main(String[] args) {
        // Map() : Transforma los elementos aplicando una funcion
        List<String> nombres = Arrays.asList("Misael", "Eva Judith", "Ivan", "Willian", "Eva", "One", "Juan", "María",
                "Pedro", "Ana", "Carlos", "Sofía", "Luis", "Elena",
                "Miguel", "Laura", "Javier", "Cristina", "Alejandro", "Natalia",
                "Francisco", "Gabriela", "Daniel", "Valeria", "Rafael", "Isabel");
                
        nombres.stream().map((nombre) -> {
            return nombre.toUpperCase();
        }).filter((nombre) -> {
            return nombre.startsWith("A");
        }).forEach((nombre) -> {
            System.out.println(nombre);
        });

    }
}
