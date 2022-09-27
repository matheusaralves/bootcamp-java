package exercicio02;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        System.out.println(dividir(b, a));

    }

    public static int dividir(int n1, int n2) throws IllegalArgumentException {
        if (n2 == 0) {
            throw new IllegalArgumentException("Não é pode ser dividido por zero");
        }
        return n1 / n2;
    }
}
