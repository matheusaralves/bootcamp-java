package wrapper;

public class MainWrapper {
    public static void main(String[] args) {
        int n = 10;
        Integer integer = 10; // autoboxing: boxing

        n = integer; // autoboxing: unboxing

        System.out.println(n);
        System.out.println(integer);

        // Passa String para inteiro
        int valor = Integer.parseInt("123");

        // Passa inteiro para String
        String texto1 = Integer.toString(123);

        // Conversão implícita para inteiro
        String texto2 = 123 + "";

        Integer n1 = 200;
        Integer n2 = 200;

        // Comparando inteiros
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
    }
}
