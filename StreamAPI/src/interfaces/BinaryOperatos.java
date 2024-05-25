package interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatos {
    public static void main(String[] args) {
        List <Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somar = (num1 , num2) -> num1 + num2;

        // BinaryOperator<Integer> somar = Integer::sum;


        int resultado = numeros.stream()
        .reduce(0, somar);

        // int resultados = numeros.stream()
        // .reduce(0, (n1,n2)-> n1 + n2);

        int resultados = numeros.stream()
        .reduce(10, Integer::sum);


        System.out.println("A soma dos numero é: " + resultado + " " + resultados);









    }
}
