package br.com.fiap.ddd.exercicio01;

public class Salario {

	//
	//Atributos
	//
	double horasTrabalhadas;
	double valorHora;
	
	//
	//Metodos
	//
	double calcularSalario(){
		
		return (horasTrabalhadas * valorHora);
		
	}
	
}
