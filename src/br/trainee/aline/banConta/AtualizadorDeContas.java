package br.trainee.aline.banConta;

public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;

	public void atualizadorDeContas(double selic) {
		this.selic = selic;

	}

	public void roda(Conta c) {
		saldoTotal = selic + c.getSaldo();

	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

}
