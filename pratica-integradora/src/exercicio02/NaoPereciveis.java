package exercicio02;

public class NaoPereciveis extends Produto {
    String tipo;

    public NaoPereciveis(String nome, double preco, String tipo) {
        setNome(nome);
        setPreco(preco);
        setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
