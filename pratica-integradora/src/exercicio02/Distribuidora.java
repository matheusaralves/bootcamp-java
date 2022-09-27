package exercicio02;

public class Distribuidora {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 9);
        Pereciveis p2 = new Pereciveis("Banana",  3.50, 3);
        NaoPereciveis p3 = new NaoPereciveis("Sabonete", 1.50, "Limpeza");

        System.out.println(p1.getNome() + " -> R$ " + p1.getPreco());
        System.out.println(p1.calcular(2));

        System.out.println(p2.calcular(3));

        System.out.println(p3.calcular(8));
    }
}
