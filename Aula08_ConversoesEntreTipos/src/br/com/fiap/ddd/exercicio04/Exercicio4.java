package br.com.fiap.ddd.exercicio04;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Direcao direcao = new Direcao();

		System.out.print("Entre com o valor 1: ");
		direcao.valor1 = scan.nextInt();

		System.out.print("Entre com o valor 2: ");
		direcao.valor2 = scan.nextInt();

		System.out.print("Entre com o valor 3: ");
		direcao.valor3 = scan.nextInt();
		
		scan.close();

		System.out.println(direcao.retornarTextoDirecao());

	}

}
