package br.com.fiap.ddd.exercicio02;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		// Cria um objeto do tipo Scanner para possibilitar a entrada de dados pelo usuario
		Scanner scanner = new Scanner(System.in);
		
		
		
		//
		// Produto 1
		//
		Produto produto1 = new Produto();

		System.out.print("Entre com o nome do produto[1]: ");
		produto1.nome = scanner.next() + scanner.nextLine();
		
		System.out.print("Entre com a quantidade do produto[1]: ");
		produto1.quantidade = scanner.nextInt();

		System.out.print("Entre com o preco do produto[1]: ");
		produto1.preco = scanner.nextDouble();

		System.out.print("Entre com o desconto do produto[1]: ");
		produto1.desconto = scanner.nextDouble();
		
		
				
		System.out.println();//linha vazia para separar a captura do produto anterior do proximo
		
		//
		// Produto 2
		//
		Produto produto2 = new Produto();

		System.out.print("Entre com o nome do produto[2]: ");
		produto2.nome = scanner.next() + scanner.nextLine();
		
		System.out.print("Entre com a quantidade do produto[2]: ");
		produto2.quantidade = scanner.nextInt();

		System.out.print("Entre com o preco do produto[2]: ");
		produto2.preco = scanner.nextDouble();

		System.out.print("Entre com o desconto do produto[2]: ");
		produto2.desconto = scanner.nextDouble();
		
		
				
		System.out.println();//linha vazia para separar a captura do produto anterior do proximo
		
		//
		// Produto 3
		//
		Produto produto3 = new Produto();

		System.out.print("Entre com o nome do produto[3]: ");
		produto3.nome = scanner.next() + scanner.nextLine();
		
		System.out.print("Entre com a quantidade do produto[3]: ");
		produto3.quantidade = scanner.nextInt();

		System.out.print("Entre com o preco do produto[3]: ");
		produto3.preco = scanner.nextDouble();

		System.out.print("Entre com o desconto do produto[3]: ");
		produto3.desconto = scanner.nextDouble();

		
		//fecha o Scanner
		scanner.close();
		
		
		
		//
		// calcula o valor final a ser pago
		//
		double valorFinal = produto1.calcularSubtotal()
				+ produto2.calcularSubtotal() + produto3.calcularSubtotal();

		
		//
		//exibe o valor final a ser pago
		//
		System.out.println("TOTAL: R$" + valorFinal);

	}

}
