package lambda;

import java.util.Arrays;
import java.util.List;

public class ExLambda {
    public static void main(String[] args) {
        //Declarando uma lista:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Função Lambda
        numeros.forEach( n -> System.out.print(n + " ") );

        System.out.println();

        // Sem lambda
        for (int i = 0; i < numeros.size(); i++) {
            System.out.printf(numeros.get(i) + " ");;
        }

        System.out.println();

        for (Integer lista : numeros)
            System.out.printf(lista + " ");{

        }
    }
}
