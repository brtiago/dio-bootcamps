package edu.tiago.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * Processa a lista de inteiros removendo todos os valores ímpares.
 * <p>
 * Este método utiliza a Stream API para calcular a média dos números maiores que 5 da lista original.
 * A lista resultante é então impressa no console.
 * </p>
 *
 * @implNote Calcule a média dos números maiores que 5
 *
 * @param numeros a lista de números inteiros a ser processada
 */
public class Desafio_05 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Calcule a média dos números maiores que 5");


        var test = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average();

        // numeros.stream().filter(e -> e > 5).mapToInt(n -> n).average(); // similar

        System.out.println(test.getAsDouble());

    }
}
