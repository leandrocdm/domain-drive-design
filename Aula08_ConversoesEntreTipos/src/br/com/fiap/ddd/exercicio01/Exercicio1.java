package br.com.fiap.ddd.exercicio01;

import java.util.Scanner;

public class Exercicio1 {

	
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		
		
		System.out.print("Entre com o nome da primeira pessoa: ");
		pessoa1.nome = scanner.next();

		System.out.print("Entre com o altura da primeira pessoa: ");
		pessoa1.altura = scanner.nextDouble();

		System.out.print("Entre com o peso da primeira pessoa: ");
		pessoa1.peso = scanner.nextDouble();
		
		
		
		System.out.print("Entre com o nome da segunda pessoa: ");
		pessoa2.nome = scanner.next();

		System.out.print("Entre com o altura da segunda pessoa: ");
		pessoa2.altura = scanner.nextDouble();

		System.out.print("Entre com o peso da segunda pessoa: ");
		pessoa2.peso = scanner.nextDouble();
		
		
		
		scanner.close();
		
		
				
		System.out.println("Pessoa mais pesada: " + pessoa1.retonarNomePessoaMaisPesada(pessoa2));
		
		System.out.println("Pessoa mais alta: " + pessoa1.retonarNomePessoaMaisAlta(pessoa2));
	
		
	}

}
