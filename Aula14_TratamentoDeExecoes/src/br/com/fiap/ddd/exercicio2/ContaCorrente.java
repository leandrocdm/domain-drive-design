package br.com.fiap.ddd.exercicio2;

public class ContaCorrente {

	private double saldo;
	private double valorLimiteDiario;

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getValorLimiteDiario() {
		return valorLimiteDiario;
	}
	public void setValorLimiteDiario(double valorLimiteDiario) throws ValorNegativoException {

		if(valorLimiteDiario < 0) {
			throw new ValorNegativoException();
		} else {
			this.valorLimiteDiario = valorLimiteDiario;
		}
	}

	public void sacar(double valor) throws ValorNegativoException, MaiorQueLimiteDiarioException {

		if(valor < 0) { throw new ValorNegativoException();
		} else if(valor > this.valorLimiteDiario) {
			throw new MaiorQueLimiteDiarioException();
		} else {
			this.saldo = this.saldo - valor;
		}
	}

	public void depositar(double valor) throws ValorNegativoException {
		if(valor < 0) {
			throw new ValorNegativoException();
		} else {
			this.saldo = this.saldo + valor;
		}
	}
	
	public double setarSaldoAutomaticamente () {
		return this.saldo = this.valorLimiteDiario * 2;
	}
}
