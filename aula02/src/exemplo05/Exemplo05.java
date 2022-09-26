package exemplo05;

public class Exemplo05 {
    public static void main(String[] args) {
        int vetor[] = new int[3];

        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(vetor[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Erro: indice fora do limite");
            System.out.println(ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finalizando conexões");
        }

        System.out.println("Fim do programa");

    }

}
