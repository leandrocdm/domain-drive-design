package br.com.fiap.ddd.exercicio09;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		
		Contribuinte contribuinte = new Contribuinte();
		
		
		
		System.out.println("**** **  Informe os dados do contribuinte  ** ****");
		
		System.out.print("Nome: ");
		contribuinte.nome = scanner.next();
		
		System.out.print("CPF: ");
		contribuinte.cpf = scanner.next();
		
		System.out.print("Numero de dependentes: ");
		contribuinte.numeroDependentes = scanner.nextInt();
		
		System.out.print("Renda Bruta Anual: ");
		contribuinte.rendaBruta = scanner.nextDouble();
		
		
		
		scanner.close();
		
		
		
		System.out.println("Alíquota do imposto de renda: " + contribuinte.informarAliquota() );
				
	}

}
