package edu.tiago.streamapi;

import java.util.Arrays;
import java.util.List;

public class Desafio_01 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Mostre a lista na ordem numérica");

        List<Integer> test = numeros.stream().sorted().toList();
        System.out.println(test);

        // test.forEach(e -> System.out.println(e));
    }
}
