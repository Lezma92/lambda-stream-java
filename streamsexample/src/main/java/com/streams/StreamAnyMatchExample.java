package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamAnyMatchExample {
    public static void main(String[] args) {

        // AnyMatch(): Verifica si algun elemento cumple una condicion

        List<String> nombres = Arrays.asList("Misael", "Eva Judith", "Ivan", "Willian", "Eva", "One", "Juan", "María",
                "Pedro", "Ana", "Carlos", "Sofía", "Luis", "Elena",
                "Miguel", "Laura", "Javier", "Cristina", "Alejandro", "Natalia",
                "Francisco", "Gabriela", "Daniel", "Valeria", "Rafael", "Isabel");
        boolean response = nombres.stream().anyMatch((nombre) -> {
            return nombre.startsWith("E");
        });

        System.out.println(response);
    }
}
