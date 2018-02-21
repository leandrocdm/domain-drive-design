package br.com.fiap.ddd.exercicio01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Salario salario = new Salario();

		System.out.print("Entre com o numero de horas trabalhadas: ");
		salario.horasTrabalhadas = scanner.nextDouble();

		System.out.print("Entre com o valor da hora de trabalho: ");
		salario.valorHora = scanner.nextDouble();

		scanner.close();

		System.out.println("Salario: R$" + salario.calcularSalario());

	}

}
