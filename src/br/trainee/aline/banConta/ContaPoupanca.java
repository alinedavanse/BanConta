package br.trainee.aline.banConta;

public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {
		this.saldo = taxa * 3;
		
	}

	/*
	public void atualiza(double taxa) {
		//Super chama o método da classe mãe
		super.atualiza(taxa * 3);
	}
	
	*/
	
	
	
}
