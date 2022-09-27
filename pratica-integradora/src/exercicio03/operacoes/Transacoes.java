package exercicio03.operacoes;

public interface Transacoes {
    public abstract void transacaoOk(String tipo);
    public abstract void transacaoNaoOk(String tipo);
}
