package br.com.fiap.ddd.exercicio02;

import java.util.Scanner;

public class Exercicio2 {

	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int countEleitorObrigatorio = 0;
		
		
		
		Eleitor eleitor1 = new Eleitor();
		Eleitor eleitor2 = new Eleitor();
		Eleitor eleitor3 = new Eleitor();
		
		
		
		//pega a idade do eleitor
		System.out.print("Entre com a idade da Pessoa 1: ");
		eleitor1.idade = teclado.nextInt();
	
		//analisa e adiciona(caso seja eleitor obrigatorio) ao total de eleitores obrigatorios
		if(eleitor1.isEleitorObrigatorio() == true)
			++countEleitorObrigatorio;
		
		//exibe o tipo de eleitor
		System.out.println(eleitor1.tipoEleitor);
		
		
		
		System.out.print("Entre com a idade da Pessoa 2: ");
		eleitor2.idade = teclado.nextInt();
		
		if(eleitor2.isEleitorObrigatorio())
			++countEleitorObrigatorio;
		
		System.out.println(eleitor2.tipoEleitor);
		
		
				
		System.out.print("Entre com a idade da Pessoa 3: ");
		eleitor3.idade = teclado.nextInt();

		if(eleitor3.isEleitorObrigatorio())
			++countEleitorObrigatorio;
				
		System.out.println(eleitor3.tipoEleitor);
		
		
		
		teclado.close();
		
		
		
		//exibe o total de eleitores obrigatorio
		System.out.println("TOTAL DE ELEITORES OBRIGATORIOS: " + countEleitorObrigatorio);
		
	}

}
