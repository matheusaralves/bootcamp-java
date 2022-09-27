package exercicio02;

public class Pereciveis extends Produto {
    int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        setNome(nome);
        setPreco(preco);
        setDiasParaVencer(diasParaVencer);
    }


    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        if (diasParaVencer == 1) {
            return (quantidadeDeProdutos * preco) / 4;
        } else if (diasParaVencer == 2) {
            return (quantidadeDeProdutos * preco) / 3;
        } else if (diasParaVencer == 3) {
            return (quantidadeDeProdutos * preco) / 2;
        } else {
            return (quantidadeDeProdutos * preco);
        }
    }
}
