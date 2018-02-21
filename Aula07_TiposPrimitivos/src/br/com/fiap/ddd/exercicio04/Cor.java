package br.com.fiap.ddd.exercicio04;


public class Cor {

	String nome;
	boolean corMetalica;
	double preco;

	/*O metodo getPreco retorna o valor do atributo preco.*/
	double getPreco() {
		return preco;
	}

	/*O metodo setPreco altera o valor do atributo preco com valor passado como parametro.*/
	void setPreco(double novoPreco) {
		preco = novoPreco;
	}
}
