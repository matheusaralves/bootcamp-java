package exercicio03.clientes;

import exercicio03.operacoes.ConsultarSaldo;
import exercicio03.operacoes.Saque;

public class Cobradores extends Clientes implements Saque, ConsultarSaldo {
    @Override
    public String getTipo() {
        return "Cobrador";
    }
    @Override

    public void consultarSaldo() {
        System.out.println("Consultando saldo...");

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
    public void saque(double valor) {
        System.out.println("Saque de R$ " + valor);

    }
}
