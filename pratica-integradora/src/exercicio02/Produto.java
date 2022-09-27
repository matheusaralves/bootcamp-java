package exercicio02;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
    }

    public Produto(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcular(int quantidadeDeProdutos) {
        return quantidadeDeProdutos * preco;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
