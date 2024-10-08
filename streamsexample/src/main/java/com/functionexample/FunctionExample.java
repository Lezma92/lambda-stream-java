package com.functionexample;

import java.util.function.Function;

public class FunctionExample {

    /*
     * Fuction
     * Recibe un valor y retorna un resultado
     * 
     */
    public static void main(String[] args) {
    
        Function<String, String[]> function = (param) -> {
            String[] valores = new String[param.length()];
            for(int i = 0; i < valores.length; i++){
                valores[i] = String.valueOf(param.charAt(i));
            }
            return valores;
        };

        String[] data = function.apply("Misael lEZMA MESINO");
        for(String info : data){
            System.out.println(info);
        }
    }
}
