package br.com.fiap.ddd.exercicio06;

/*
 	f) Crie uma classe - classe de teste - para testar os metodos
	atribuirValorBruto, calcularINSS e obterValorLiquido
	exibindo no console o valor do salario bruto, o desconto de INSS e o
	valor liquido 
  */
public class TesteSalario {

	public static void main(String[] args) {

		Salario salario = new Salario();
		
		salario.atribuirValorBruto(4500.00);
		
		System.out.println("Valor bruto:         R$" + salario.valorBruto);
		System.out.println("Desconto do INSS:   -R$" + salario.calcularINSS());
		System.out.println("                   -------------");
		System.out.println("Valor liquido:       R$" + salario.obterValorLiquido());
		
	}

}
