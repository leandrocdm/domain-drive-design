package br.com.fiap.ddd.exercicio03;


public class ContaCorrente {

	String titular;
	int agenciaContaCorrente;
	String numeroContaCorrente;
	double saldo;

	/*O metodo deposito deve adicionar ao atributo saldo o valor
	passado como parametro e retornar o saldo atualizado.*/
	double deposito(double valor) {
		saldo += valor;//ou saldo = saldo + valor;
		return saldo;
	}

	/*O metodo saque deve subtrair do atributo saldo o valor passado
	como parametro e retornar o saldo atualizado.*/
	double saque(double valor) {
		saldo = saldo - valor;//ou saldo -= valor;
		return saldo;
	}

	/*O metodo getSaldo deve retornar o valor do atributo saldo.*/
	double getSaldo() {
		return saldo;
	}

	/*O metodo exibirSaldo deve exibir a seguinte mensagem no
	console:
	Ola <titular>, o seu saldo eh: R$<saldo>*/
	void exibirSaldo() {

		System.out.println("Ola " + titular + ", o seu saldo eh: R$" + saldo);
	}
}
