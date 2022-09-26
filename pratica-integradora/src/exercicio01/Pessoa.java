package exercicio01;

public class Pessoa {
    String nome;
    int idade;
    String id;
    double peso, altura;
    double imc;

    public Pessoa() {}

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC(double peso, double altura) {
       imc = peso/ Math.pow(altura, 2);
       if (imc < 20) {
           return -1;
       } else if (imc >= 20 && imc <= 25) {
           return 0;
       } else {
           return 1;
       }
    }

    public boolean ehMaiorIdade(int idade) {
        return idade >= 18;
    }

    public String toString() {
        if (imc < 20) {
            return "Nome: " + nome + "\nIdade: " + idade + "\nID: " + id + "\nPeso: " + peso + "" +
                    "\nAltura: " + altura + "\nIMC: " + imc + "\nAbaixo do peso.";
        } else if (imc >= 20 && imc <= 25) {
            return "Nome: " + nome + "\nIdade: " + idade + "\nID: " + id + "\nPeso: " + peso + "" +
                    "\nAltura: " + altura + "\nIMC: " + imc + "\nPeso Saudável.";
        } else {
            return "Nome: " + nome + "\nIdade: " + idade + "\nID: " + id + "\nPeso: " + peso + "" +
                    "\nAltura: " + altura + "\nIMC: " + imc + "\n Sobrepeso.";
        }
    }
}
