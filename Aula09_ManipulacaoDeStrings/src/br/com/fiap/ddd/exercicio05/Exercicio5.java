package br.com.fiap.ddd.exercicio05;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		System.out.println("Digite a "+ ++i +"º palavra");
		String palavra1 = input.nextLine();
		System.out.println("Digite a "+ ++i +"º palavra");
		String palavra2 = input.nextLine();
		System.out.println("Digite uma frase");
		String frase = input.nextLine();
		System.out.println("Digite um numero");
		int num = input.nextInt();
		
		Metodos m = new Metodos();
		
		m.metodoEquals(palavra1, palavra2);
		m.metodoEqualsIgnoreCase(palavra1, palavra2);
		m.metodoStartsWith(palavra1, frase);
		m.metodoEndsWith(palavra1, frase);
		m.metodoLength(frase);
		m.metodoCharAt(num, frase);
		m.metodoIndexOf(num, frase);
		m.metodoLastIndexOf(num, frase);
		m.metodoSubstring(num, frase);
		m.metodoToLowerCase(frase);
		m.metodoToUpperCase(frase);
		m.metodoReplace(frase);
	}

}
