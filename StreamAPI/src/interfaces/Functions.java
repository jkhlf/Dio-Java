package interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Functions {
    public static void main(String[] args) {
        List <Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List <Integer> numerosDobrados = numeros.stream()
        .map(n -> n * 2)
        .toList();

        // List <Integer> numerosDobrados = numeros.stream()
        // .map(dobrar)
        // .toList();

        numerosDobrados.forEach(n -> System.out.println(n));

        numerosDobrados.forEach(System.out::println);





    }
}
