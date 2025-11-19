package edu.tiago.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Processa a lista de inteiros removendo todos os valores ímpares.
 * <p>
 * Este método utiliza a Stream API para filtrar e remover os valores ímpares da lista original.
 * A lista resultante é então impressa no console.
 * </p>
 *
 * @implNote Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
 *
 * @param numeros a lista de números inteiros a ser processada
 */
public class Desafio_04 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Remova todos os valores ímpares");

        // Use toList() quando você precisa de uma lista imutável e não
        // deseja modificá-la posteriormente.
        var test = numeros.stream().filter(n -> n % 2 != 0).toList();

        // Use collect(Collectors.toList()) quando você precisa de uma lista mutável que
        // pode ser modificada após a criação.
        var test2 = numeros.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        System.out.println(test);
        System.out.println(test2);

    }
}
