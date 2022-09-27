package exemplo01;

public class Circulo extends Figura {
    public Circulo(int x, int y) {
        super(x, y);
    }

    @Override
    public void exibir() {
        System.out.println("Círculo");
    }

    @Override
    public String getName() {
        return "Círculo";
    }
}
