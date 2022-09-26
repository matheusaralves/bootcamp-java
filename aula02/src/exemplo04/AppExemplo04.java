package exemplo04;

public class AppExemplo04 {
    public static void main(String[] args) {
        Relogio r1 = new Relogio(12, 15, 55);
        Relogio r2 = new Relogio(13, 26, 12);

        Relogio.setMarca("Rolex");

        r1.exibir();
        r2.exibir();

        System.out.println(r1.show());
    }

}
