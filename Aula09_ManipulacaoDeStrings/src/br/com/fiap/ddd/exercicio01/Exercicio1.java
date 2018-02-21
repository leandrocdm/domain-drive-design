package br.com.fiap.ddd.exercicio01;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Palavra:");
		String word = input.nextLine();
		System.out.println(word.toUpperCase());
	}

}
