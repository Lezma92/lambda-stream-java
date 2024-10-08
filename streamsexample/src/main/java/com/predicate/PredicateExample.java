package com.predicate;

import java.util.function.Predicate;

public class PredicateExample {
/**
 * Predicate
 * Recibe un valor y retorna un booleano
 * 
 */

 public static void main(String[] args) {
    Predicate<String> predicate = (str)->{
        return str.equals("ok");
    };

    System.out.println("Resultado: "+predicate.test("ok"));

 }
}
