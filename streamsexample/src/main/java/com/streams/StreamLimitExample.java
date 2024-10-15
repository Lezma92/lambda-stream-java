package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamLimitExample {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Misael", "Eva Judith", "Ivan", "Willian", "Eva", "One", "Juan", "María",
                "Pedro", "Ana", "Carlos", "Sofía", "Luis", "Elena",
                "Miguel", "Laura", "Javier", "Cristina", "Alejandro", "Natalia",
                "Francisco", "Gabriela", "Daniel", "Valeria", "Rafael", "Isabel", "Isabel", "Isabel");
        // limit(): Limita el numero de elementos procesados

        nombres.stream().limit(3).forEach((nombre) -> {
            System.out.println(nombre);
        });
    }
}
