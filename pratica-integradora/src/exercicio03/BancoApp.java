package exercicio03;

import exercicio03.clientes.Basicos;
import exercicio03.clientes.Clientes;
import exercicio03.clientes.Cobradores;
import exercicio03.clientes.Executivos;

public class BancoApp {
    public static void main(String[] args) {
        System.out.println("-------------Executivo--------------");
        Executivos executivo = new Executivos();

        executivo.fazerDeposito(1000.0);
        //Simulando uma transação Ok
        executivo.transacaoOk("Depósito");

        executivo.fazerTransferencia(500.0);
        //Simulando uma transação não Ok
        executivo.transacaoNaoOk("Transferência");

        System.out.println("\n\n-------------Cobrador--------------");
        Cobradores cobrador = new Cobradores();

        cobrador.saque(2000.0);
        //Simulando uma transação Ok
        executivo.transacaoOk("Saque");

        cobrador.consultarSaldo();
        //Simulando uma transação não Ok
        executivo.transacaoNaoOk("Consultar Saldo");



        System.out.println("\n\n-------------Básico--------------");
        Basicos basico = new Basicos();

        basico.consultarSaldo();
        //Simulando uma transação Ok
        basico.transacaoOk("Consultar Saldo");

        basico.saque(8000.0);
        //Simulando uma transação não Ok
        basico.transacaoNaoOk("Saque");

        basico.pgtoServico("Conta de Luz");
        //Simulando uma transação não Ok
        basico.transacaoNaoOk("Pagar Servço ");


    }
}