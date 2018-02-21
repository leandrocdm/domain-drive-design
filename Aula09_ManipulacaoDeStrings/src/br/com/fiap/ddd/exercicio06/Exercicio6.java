package br.com.fiap.ddd.exercicio06;

import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Livro l = new Livro();
	System.out.println("Digite o titulo original");
	l.tituloOriginal = input.nextLine();
	System.out.println("Digite o titulo em portugues");
	l.tituloPortugues = input.nextLine();
		
	l.metodoStatusLivro(l.tituloOriginal, l.tituloPortugues);
}
}
