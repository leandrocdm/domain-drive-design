package br.com.fiap.ddd.exercicio07;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma palavra terminada com 'ar'");
		String palavra = input.nextLine();
		
		if(palavra.endsWith("ar") == true){
			int a = palavra.lastIndexOf('a');
			int r = palavra.lastIndexOf('r');
			String palavraNovaA = palavra.substring(a,r).replace('a', 'o');
			String palavraNovaR = palavra.substring(r,palavra.length()).replace('r','u');
			System.out.println(palavra.substring(0,a)+palavraNovaA + palavraNovaR);
		}else{
			System.out.println("Favor fornecer uma palavra que termine com 'ar'.");
		}
	}

}
