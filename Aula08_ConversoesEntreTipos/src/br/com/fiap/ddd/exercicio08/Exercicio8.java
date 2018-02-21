package br.com.fiap.ddd.exercicio08;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		//cria um objeto da classe Scanner para captura de dados
		Scanner scan = new Scanner(System.in);
		
		//cria um objeto da classe Pessoa (para guardar os dados da pessoa a ser avaliada)
		Pessoa pes = new Pessoa();
		
		//pega a altura da pessoa (e guarda no atributo altura)
		System.out.print("Entre com a altura: ");
		pes.altura = scan.nextDouble();
		
		//pega o peso da pessoa (e guarda no atributo peso)
		System.out.print("Entre com o peso: ");
		pes.peso = scan.nextDouble();
		
		//fecha o objeto da classe Scanner
		scan.close();
		
		
		
		//cria um objeto da classe IndiceMassaCorporea (para o calculo e classificacao do IMC)
		IndiceMassaCorporea imc = new IndiceMassaCorporea();
		String classificacao = imc.classificar(pes);
		
		
		
		//exibe o IMC
		System.out.print("Classificação do IMC: " + classificacao);
			
		
	}

}
