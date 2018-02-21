package br.com.fiap.ddd.exercicio03;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Palavra:");
		String word = input.nextLine();
		System.out.println(word.substring(0,1).toUpperCase()+word.substring(1, word.length()).toLowerCase());
	}

}
