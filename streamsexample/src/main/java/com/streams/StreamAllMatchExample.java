package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamAllMatchExample {
    public static void main(String[] args) {

        // allMatch(): Verifica si todos los elementos cumplen una condicion
        List<String> nombres = Arrays.asList("Misael", "Eva Judith", "Ivan", "Willian", "Eva", "One", "Juan", "María",
                "Pedro", "Ana", "Carlos", "Sofía", "Luis", "Elena",
                "Miguel", "Laura", "Javier", "Cristina", "Alejandro", "Natalia",
                "Francisco", "Gabriela", "Daniel", "Valeria", "Rafael", "Isabel");

        boolean response = nombres.stream().allMatch((nombre) -> {
            return nombre.startsWith("E");
        });

        System.out.println(response);
    }
}
