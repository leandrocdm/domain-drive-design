package br.com.fiap.ddd.exercicio07;

public class CalculadoraFinanceira {

	/*a) Crie um metodo chamado calcularJurosSimples, com 3
	parametros de entrada e um retorno. Esses parametros serao o
	capital, a taxa de juros e o periodo. Para o calculo do juros simples
	utilize a formula: montante = capital * (1+ taxa * periodo)*/
	double calcularJurosSimples(double capital, double taxaJuros, int periodo){
		return (capital * (1 + taxaJuros * periodo));
	}
	
	/*b) Crie um metodo chamado calcularJurosCompostos, com 3
	parametros de entrada e um retorno. Esses parametros serao o
	capital, a taxa de juros e o periodo. Para o calculo do juros
	compostos utilize a formula: montante = capital * ((1+taxa) ^ periodo)*/
	double calcularJurosCompostos(double capital, double taxaJuros, int periodo){
		return ( capital * Math.pow((1 + taxaJuros), periodo) );
	}
	
}
