package exemplo01;

public class Quadrado extends Figura {

    public Quadrado(int x, int y) {
        super(x, y);
    }

    @Override
    public void exibir() {
        System.out.println("Quadrado");
    }
}
