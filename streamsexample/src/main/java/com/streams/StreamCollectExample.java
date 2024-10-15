package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectExample {
    public static void main(String[] args) {
        // collect(): Ayuda para almacenar los datos en una coleccion
        List<String> nombres = Arrays.asList("Misael", "Eva Judith", "Ivan", "Willian", "Eva", "One", "Juan", "María",
                "Pedro", "Ana", "Carlos", "Sofía", "Luis", "Elena",
                "Miguel", "Laura", "Javier", "Cristina", "Alejandro", "Natalia",
                "Francisco", "Gabriela", "Daniel", "Valeria", "Rafael", "Isabel");

        List<String> nuevoNombres = nombres.stream().map((nombre) -> nombre.toUpperCase()).toList();

        nuevoNombres.stream().forEach((nvo)->{
            System.out.println(nvo);
        });
    }
}
