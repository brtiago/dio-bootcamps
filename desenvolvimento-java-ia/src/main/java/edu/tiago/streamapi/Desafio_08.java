package edu.tiago.streamapi;

import java.util.Arrays;
import java.util.List;

/**
c * <p>
 * Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e
 * exiba o resultado no console.
 * </p>
 *
 * @implNote Somar os dígitos de todos os números da lista
 *
 * @param numeros a lista de números inteiros a ser processada
 */
public class Desafio_08 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Somar os dígitos de todos os números da lista");


        var somaDosDigitos = numeros.stream()
                .flatMap(n -> String.valueOf(n).chars().mapToObj(Character::getNumericValue))
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(somaDosDigitos);

    }
}
