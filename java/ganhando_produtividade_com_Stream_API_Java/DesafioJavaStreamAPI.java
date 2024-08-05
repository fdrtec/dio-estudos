import java.util.Arrays;
import java.util.List;

public class DesafioJavaStreamAPI {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        new Desafio1(numeros);
    }

}

class Desafio1 {
    private String enunciado = new StringBuffer("Desafio 1 - Mostre a lista na ordem numérica:/n")
            .append("Crie um programa que utilize a Stream API para ordenar a/n")
            .append("lista de números em ordem crescente e a exiba no console.").toString();

    Desafio1(List<Integer> numeros) {
        System.out.println(enunciado);
        numeros.stream().sorted().forEach(System.out::println);
    }
}