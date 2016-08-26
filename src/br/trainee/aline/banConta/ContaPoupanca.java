package br.trainee.aline.banConta;

public class ContaPoupanca extends Conta {

	public void atualiza(double taxa) {
		//Super chama o método da classe mãe
		super.atualiza(taxa * 3);
	}
}
