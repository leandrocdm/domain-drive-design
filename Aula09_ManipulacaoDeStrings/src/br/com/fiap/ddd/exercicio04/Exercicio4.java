package br.com.fiap.ddd.exercicio04;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Palavra:");
		String word = input.nextLine();
		System.out.println(word.replace('a', '*').replace('e', '*').replace('i', '*').replace('o', '*').replace('u', '*'));
	}
}
