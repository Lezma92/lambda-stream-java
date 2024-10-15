package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamSortedExample {
    public static void main(String[] args) {
        // sorted: Orden los elementos del stream
        List<String> nombres = Arrays.asList("Misael", "Eva Judith", "Ivan", "Willian", "Eva", "One", "Juan", "María",
                "Pedro", "Ana", "Carlos", "Sofía", "Luis", "Elena",
                "Miguel", "Laura", "Javier", "Cristina", "Alejandro", "Natalia",
                "Francisco", "Gabriela", "Daniel", "Valeria", "Rafael", "Isabel");
        nombres.stream().sorted().forEach((nombre) -> {
            System.out.println(nombre);
        });
    }
}
