package br.trainee.aline.banConta.teste;

import br.trainee.aline.banConta.AtualizadorDeContas;
import br.trainee.aline.banConta.Banco;
import br.trainee.aline.banConta.Conta;
import br.trainee.aline.banConta.ContaCorrente;
import br.trainee.aline.banConta.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {

		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		c.deposita(1000.0);
		cc.deposita(1000.0);
		cp.deposita(1000.0);

		AtualizadorDeContas adc = new AtualizadorDeContas();
		adc.atualizadorDeContas(0.01);

		// adc.roda(c);
		// adc.roda(cc);
		//adc.roda(cp);

		//System.out.println("Saldo anterior: " + c.getSaldo());
		//System.out.println("Saldo total: " + adc.getSaldoTotal());

		// System.out.println("Conta: " + c.getSaldo());
		// System.out.println("Conta corrente: " + cc.getSaldo());
		// System.out.println("Conta poupança: " + cp.getSaldo());

		Banco banco = new Banco(3);
		banco.adiciona(c);
		banco.adiciona(cc);
		banco.adiciona(cp);

		for (int i = 0; i < banco.pegaTotalDeContas(); i++) {
			System.out.println("\nFuncionário de número: " + (i + 1));
			System.out.printf("Saldo: %.2f\n", banco.pegaConta(i).getSaldo());
			adc.roda(banco.pegaConta(i));
		}

		System.out.printf("\nSaldo total: %.2f\n", adc.getSaldoTotal());

	}

}
