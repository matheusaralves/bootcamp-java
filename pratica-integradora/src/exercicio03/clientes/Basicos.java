package exercicio03.clientes;

import exercicio03.operacoes.ConsultarSaldo;
import exercicio03.operacoes.PgtoServico;
import exercicio03.operacoes.Saque;

public class Basicos extends Clientes implements ConsultarSaldo, PgtoServico, Saque {

    @Override
    public String getTipo() {
        return "Básico";
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Consultando saldo...");

    }

    @Override
    public void pgtoServico(String tipo) {
        System.out.println("Pagando serviço: " + tipo);
    }

    @Override
    public void saque(double valor) {
        System.out.println("Saque de R$ " + valor);

    }

    @Override
    public void transacaoOk(String tipo) {
        System.out.println(tipo + " realizado corretamente");
    }

    @Override
    public void transacaoNaoOk(String tipo) {
        System.out.println("A transação " + tipo +  " não pode ser concluída");

    }
}
