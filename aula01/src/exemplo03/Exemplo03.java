package exemplo03;

public class Exemplo03 {
    public static void main(String[] args) {
        // estruturas de repetição
        int contador = 1;

        while(contador <= 10) {
            System.out.print(contador + " ");
            contador++;
        }

        System.out.println();

        for(contador = 10; contador >=1; contador--) {
            System.out.print(contador + " ");
        }

//        for (int a = 1, b = 2; a < 10 && b < 10; a++, b++) {
//            System.out.println(a);
//            System.out.println(b);
//        }


    }
}
