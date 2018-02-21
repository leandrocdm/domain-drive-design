package br.com.fiap.ddd.exercicio08;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o nome do arquivo");
		String arquivo = input.nextLine();
		
		int extensao = arquivo.lastIndexOf('.');
		String novoExtensao = arquivo.substring(extensao).toLowerCase();
		String novoNome = arquivo.substring(0, extensao);
		System.out.println(novoNome.concat(novoExtensao).replace(' ', '_'));


	}

}
