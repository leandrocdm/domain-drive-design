package br.com.fiap.ddd.exercicio01;

public class Produto {

	private String nome;
	private int qtd;
	private double preco;
	private double desconto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double valorTotalProduto(int qtd, double preco, double desconto) {
		return (qtd*preco) - desconto;
	}


}
