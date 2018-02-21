package br.com.fiap.ddd.exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Aluno aluno = new Aluno();
		ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();

		boolean fim = true;
		double maiorNota = 0, notaAux = 0;
		String alunoMaiorNota = null;

		while(fim == true) {

			System.out.println("Nome");
			aluno.setNome(input.next());

			System.out.println("Nota 1 do "+aluno.getNome());
			aluno.setNota1(input.nextDouble());

			System.out.println("Nota 2 do "+aluno.getNome());
			aluno.setNota2(input.nextDouble());

			listaAluno.add(aluno);
			
			maiorNota =  aluno.maiorNota(aluno.getNota1(), aluno.getNota2());
			
			if(maiorNota > notaAux) {
				alunoMaiorNota = aluno.getNome();
				notaAux = maiorNota;
			}
			
			System.out.println("Adicionar mais aluno? [0 - NAO, 1 - SIM]");
			
			int resp = input.nextInt();
			if(resp == 0) {
				fim = false;
			}else{
				fim = true;	
			}
		}
		
		System.out.println("A maior nota foi: "+ notaAux + " do aluno "+ alunoMaiorNota);


	}
}
