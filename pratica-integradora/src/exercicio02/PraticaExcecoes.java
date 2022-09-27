package exercicio02;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            System.out.println(b/a);
        } catch (ArithmeticException ex) {
            System.out.println("Ocorreu um erro.");
        } finally {
            System.out.println("Programa finalizado.");
        }
    }
}
