package br.trainee.aline.banConta;

public class ContaCorrente extends Conta {

	/*
	public void atualiza(double taxa) {
		//Super chama o m�todo da classe m�e
		super.atualiza(taxa * 2);
	}
	
	*/
	
	
	
	public void deposita(double valor){
		this.saldo += valor - 0.10;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo = taxa * 2;
		
	}

}

