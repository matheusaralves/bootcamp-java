package exercicio03.clientes;

import exercicio03.operacoes.Deposito;
import exercicio03.operacoes.Transferencia;

public class Executivos extends Clientes implements Deposito, Transferencia {
    @Override
    public String getTipo() {
        return "Executivo";
    }


    @Override
    public void transacaoOk(String tipo) {
        System.out.println(tipo + " realizado corretamente");
    }

    @Override
    public void transacaoNaoOk(String tipo) {
        System.out.println("A transação " + tipo +  " não pode ser concluída");

    }

    @Override
    public void fazerDeposito(double valor) {
        System.out.println("Fazendo Depósito de R$ " + valor);
    }

    @Override
    public void fazerTransferencia(double valor) {
        System.out.println("Fazendo Transferencia de R$ " + valor);
    }
}
