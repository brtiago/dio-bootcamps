package edu.tiago.streamapi;

import java.util.*;
import java.util.stream.Collectors;

// https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md
public class PraticaStream {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 1 - Mostre a lista na ordem numérica:
            System.out.println("Desafio 1 - Mostre a lista na ordem numérica");
            System.out.println(numeros.stream().sorted().toList());
            numeros.stream().sorted().toList().forEach(e -> System.out.println(e));

        // Desafio 2 - Imprima a soma dos números pares da lista:
            System.out.println("Desafio 2 - Imprima a soma dos números pares da lista:");
            int sum2 = numeros.stream()
                    .filter(e -> e % 2 == 0)
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println(sum2);

        // Desafio 3 - Verifique se todos os números da lista são positivos:
            System.out.println("Desafio 3 - Verifique se todos os números da lista são positivos:");
            boolean todosPositivos = numeros.stream().allMatch(n -> n > 0);
            if (todosPositivos) {
                System.out.println("Todos os números são positivos");
            } else {
                System.out.println("Todos os números são negativos");
            }

        // Desafio 4 - Remova todos os valores ímpares
            System.out.println("Desafio 4 - Remova todos os valores ímpares");
            List<Integer> novaLista = numeros.stream()
                    .filter(e -> e % 2 == 0)
                    .collect(Collectors.toList());

            System.out.println("Lista original: " + numeros);
            System.out.println("Lista sem pares: " + novaLista);

        // Desafio 5 - Calcule a média dos números maiores que 5
            System.out.println("Desafio 5 - Calcule a média dos números maiores que 5");
            OptionalDouble med = numeros.stream().filter(e -> e > 5).mapToInt(n -> n).average();
            System.out.println("Média: " + med.getAsDouble());



        System.out.println("===========");
        // numeros.forEach(System.out::println);
        // numeros.stream().forEach(e -> System.out.println(e));
    }
}
