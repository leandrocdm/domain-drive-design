package br.com.fiap.ddd.exercicio02;

public class Produto {

	String nome;
	int quantidade;
	double preco;
	double desconto;

	double calcularSubtotal() {
	
		return (quantidade * (preco - desconto));

	}

}
