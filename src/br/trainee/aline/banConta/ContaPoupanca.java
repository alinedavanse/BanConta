package br.trainee.aline.banConta;

public class ContaPoupanca extends Conta {

	public void atualiza(double taxa) {
		//Super chama o m�todo da classe m�e
		super.atualiza(taxa * 3);
	}
}
