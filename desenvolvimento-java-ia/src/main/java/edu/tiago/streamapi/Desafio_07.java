package edu.tiago.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <p>
 * Com a ajuda da Stream API, encontre o segundo número maior da lista
 * e exiba o resultado no console.
 * </p>
 *
 * @implNote Encontrar o segundo número maior da lista
 *
 * @param numeros a lista de números inteiros a ser processada
 */
public class Desafio_07 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Encontrar o segundo número maior da lista");
        var segundoMaior = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();


        segundoMaior.ifPresent(n -> System.out.println("O segundo maior número é: " + n));

    }
}
