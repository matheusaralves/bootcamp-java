package exercicio01;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Anna", 32, "ABC123");
        Pessoa p3 = new Pessoa("Matheus", 31, "DEF456", 76, 1.79);

//        Pessoa p4 = new Pessoa("Zé", 25);

        p3.calcularIMC(p3.peso, p3.altura);
        System.out.println(p3.toString());


    }
}
