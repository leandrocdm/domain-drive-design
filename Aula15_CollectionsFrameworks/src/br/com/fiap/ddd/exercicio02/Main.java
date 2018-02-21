package br.com.fiap.ddd.exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite N");
		int n = input.nextInt();
		
		ArrayList<Integer> listaNum = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Numero");
			listaNum.add(input.nextInt());
		}
		
		int numAux = 0;
		for (int i = 0; i < listaNum.size(); i++) {
			if(listaNum.get(i)> numAux) {
			numAux = listaNum.get(i);
			}
		}
		
		System.out.println("Maior numero " +numAux);
	}
}
