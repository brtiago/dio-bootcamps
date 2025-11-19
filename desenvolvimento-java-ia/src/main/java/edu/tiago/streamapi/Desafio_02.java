package edu.tiago.streamapi;

import java.util.Arrays;
import java.util.List;

public class Desafio_02 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Imprima a soma dos números pares da lista");

        //List<Integer> test = numeros.stream().mapToInt();
        int test = numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(test);

    }
}
