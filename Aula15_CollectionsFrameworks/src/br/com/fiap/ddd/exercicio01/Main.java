package br.com.fiap.ddd.exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Qtd de produtos:");
		int qtd = input.nextInt();

		Produto produto = new Produto();

		ArrayList<Produto> listaProduto = new ArrayList<Produto>();
		
		double valorTotal = 0;


		for (int i = 0; i < qtd; i++) {


			System.out.println("Nome do Produto");
			produto.setNome(input.next());
			
			System.out.println("Quantidade do "+produto.getNome());
			produto.setQtd(input.nextInt());
			
			System.out.println("Preco do "+produto.getNome());
			produto.setPreco(input.nextDouble());
			
			System.out.println("Desconto do "+produto.getNome());
			produto.setDesconto(input.nextDouble());
			
			listaProduto.add(produto);
			
			valorTotal += produto.valorTotalProduto(produto.getQtd(), produto.getPreco(), produto.getDesconto());
			

		}
		
		System.out.println("TOTAL: "+valorTotal);
		
		

	}
}
