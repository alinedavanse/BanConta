package br.trainee.aline.banConta;

public abstract class Conta {

    double saldo;

	public void deposita(double valor) {
		this.saldo += valor;

	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void atualiza(double taxa);

}
