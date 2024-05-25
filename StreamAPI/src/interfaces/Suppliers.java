package interfaces;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Suppliers {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá";
    
    List<String> listaSaudacoes = Stream.generate(() -> "Olá")
    .limit(5)
    .toList();


    // List<String> listaSaudacoes = Stream.generate(saudacao)
    // .limit(5)
    // .toList();

    listaSaudacoes.forEach(System.out::println);
    
    }
}
