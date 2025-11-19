package edu.tiago.streamapi;

import java.util.Arrays;
import java.util.List;

public class PraticaStream2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Lista inicial: " + numeros);
        System.out.println();



        for(int i = 0; i < numeros.size(); i++) {
            System.out.println(i + " -> " + numeros.get(i));
        }

        System.out.println("===========");
        // numeros.forEach(System.out::println);
        // numeros.stream().forEach(e -> System.out.println(e));

        numeros.stream().
                // skip(2). //operações intermediaria
                // limit(2).
                // distinct().
                // filter(e -> e % 2 == 0).
                        map(e -> e * 2).
                forEach(e -> System.out.println(e));
    }
}
