package com.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    /**
     * Supplier
     * No recibe ningun valor pero retorna un resultado
     * 
     */

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Aprendiendo a utilizar funciones lamda";

        System.out.println(supplier.get());
    }
}
