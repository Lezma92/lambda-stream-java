package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamNoneMatchExample {
    public static void main(String[] args) {

        // noneMatch(): Verifica si ningun elemento cumple una condicion
        List<String> nombres = Arrays.asList("Misael", "Eva Judith", "Ivan", "Willian", "Eva", "One", "Juan", "María",
                "Pedro", "Ana", "Carlos", "Sofía", "Luis", "Elena",
                "Miguel", "Laura", "Javier", "Cristina", "Alejandro", "Natalia",
                "Francisco", "Gabriela", "Daniel", "Valeria", "Rafael", "Isabel");
        boolean result = nombres.stream().noneMatch((nombre) -> {
            return nombre.length() == 10;
        });
        System.out.println(result);
    }
}
