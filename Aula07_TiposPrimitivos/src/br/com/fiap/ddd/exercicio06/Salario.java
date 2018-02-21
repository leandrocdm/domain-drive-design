package br.com.fiap.ddd.exercicio06;

public class Salario {

	/*a) Crie um atributo de classe chamado valorBruto*/
	double valorBruto;
	
	/*b) Crie um metodo para atribuir valor ao atributo valorBruto, chamado
	atribuirValorBruto*/
	void atribuirValorBruto(double novoValorBruto){
		valorBruto = novoValorBruto;
	}
	
	/*c) Crie um metodo para obter o valor do atributo valorBruto, chamado
	obterValorBruto*/
	double obterValorBruto(){
		return valorBruto;
	}
	
	/*d) Crie um metodo chamado calcularINSS, que fara o calculo do INSS,
	com base no salario bruto armazenado no atributo valorBruto, e
	retornara o valor do INSS. Para calcular o INSS utilize a formula:
	descontoINSS = (valorBruto*20)/100*/
	double calcularINSS(){
		return ((valorBruto*20)/100);
	}
	
	/*e) Crie um metodo chamado obterValorLiquido, que com base no
	salario bruto armazenado no atributo valorBruto, retornara o valor
	liquido do salario. Para calcular o salario liquido utilize a formula:
	salarioLiquido = valorBruto � descontoINSS*/
	double obterValorLiquido(){
		return (valorBruto - calcularINSS());
	}
}
