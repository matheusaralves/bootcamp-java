package exemplo07;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        String nome;
        String dadoDigitado;

        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();

        //Limpando o buffer:
        dadoDigitado = entrada.nextLine();
//        dadoDigitado = entrada.nextLine();
//        numero = Integer.parseInt(dadoDigitado);

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Você digitou: " + numero);
        System.out.println("Você digitou: " + nome);

        entrada.close();
    }

}
