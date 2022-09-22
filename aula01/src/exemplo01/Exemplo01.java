package exemplo01;

public class Exemplo01 {
    public static void main(String[] args) {
        // [TIPO] NOME;
        int numeroInteiro = 67;
        double numeroDouble = 4.5;
        String palavra = "Cruzeiro";

        // numeroDouble = numeroInteiro;
        numeroInteiro = (int) numeroDouble; // casting

        System.out.println("Resposta = " + numeroInteiro);
        System.out.println(numeroDouble);
        System.out.println(palavra);

        numeroDouble = (3 + 5) * 2;
        System.out.println(numeroDouble);

    }

}
