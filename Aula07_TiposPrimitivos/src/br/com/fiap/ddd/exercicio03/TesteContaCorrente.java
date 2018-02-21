package br.com.fiap.ddd.exercicio03;


public class TesteContaCorrente {

	/*Implemente em Java uma classe chamada TesteContaCorrente e tambem o metodo main nesta classe.*/
	public static void main(String args[]) {

		/*Depois elabore um codigo no metodo main de forma que todos os metodos da classe ContaCorrente sejam testados.*/
		ContaCorrente conta = new ContaCorrente();
		conta.titular = "Ronaldo";
		conta.deposito(100);
		System.out.println("saldo: " + conta.getSaldo());
		conta.saque(20);
		conta.exibirSaldo();
		
	}
}
