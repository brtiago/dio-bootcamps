package edu.tiago.streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Este método utiliza a Stream API para verificar se há algum número inteiro maior que 10
 * da lista original.
 * A lista resultante é então impressa no console.
 * </p>
 *
 * @implNote Verificar se a lista contém algum número maior que 10
 *
 * @param numeros a lista de números inteiros a ser processada
 */
public class Desafio_06 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        boolean containsGreaterThanTen = numeros.stream()
                .anyMatch(n -> n > 10);

        System.out.println("Verificar se a lista contém algum número maior que 10: " + containsGreaterThanTen);

    }
}
