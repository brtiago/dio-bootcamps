package edu.tiago.streamapi;

import java.util.Arrays;
import java.util.List;

public class Desafio_03 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Verifique se todos os números da lista são positivos");

        //List<Integer> test = numeros.stream().mapToInt();
        boolean test = numeros.stream()
                        .allMatch(n -> n > 0);

        System.out.println(test ? "Os numeros são positivos" : "Os numeros são negativos");

    }
}
