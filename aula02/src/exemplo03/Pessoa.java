package exemplo03;

public class Pessoa {
    private String nome;

    // construtor default
    public Pessoa(){}


    // construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // getter
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
