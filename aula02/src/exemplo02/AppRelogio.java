package exemplo02;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio meuRelogio = new Relogio(9, 12, 55);
        Relogio outroRelogio = new Relogio(14, 11, 33);



        meuRelogio.exibir();
        outroRelogio.exibir();

        System.out.println("Hira: " + meuRelogio.getHora());
        System.out.println("Minuto: " + meuRelogio.getMinuto());
        System.out.println("Segundo: " + meuRelogio.getSegundo());

        System.out.println("Minuto: " + outroRelogio.getMinuto());






    }
}
