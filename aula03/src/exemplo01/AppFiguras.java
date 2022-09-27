package exemplo01;

public class AppFiguras {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(1, 2);

        Figura f = new Quadrado(2, 2);

//    Não pode ser criado objeto de uma classe abstrata
//    Figura f2 = new Figura(4, 4);

        Figura vetorFigura[] = new Figura[3];
        vetorFigura[0] = new Quadrado(1, 2);
        vetorFigura[1] = new Quadrado(1, 2);
        vetorFigura[2] = new Quadrado(1, 2);
        q.exibir();
    }


}
