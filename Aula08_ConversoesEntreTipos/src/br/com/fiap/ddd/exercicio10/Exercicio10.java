package br.com.fiap.ddd.exercicio10;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.print("Entre com o m�s[um valor entre 1..12]: ");
		int numeroMes = scanner.nextInt();
		scanner.close();
		
		
		
		Mes mes = new Mes();
				
		if( mes.mesValido(numeroMes) ){
			
			System.out.println("M�s lido: " + mes.retornarNome(numeroMes));
		
		}else{
			System.out.println("O valor informado estah incorreto, entre com um numero entre 1..12!");
		}
		
		
		
	}

}
