package br.com.fiap.ddd.exercicio4;

public class TesteSalario {

	public static void main(String[] args) {
		
		Empregado e1 = new Empregado("João","Analista de Sistemas",5400);
		System.out.println("Funcionario: "+e1.getNome()+" Salario: "+e1.getSalario());
		System.out.println("Com aumento...");
		e1.aumentarSalario(600);
		System.out.println("Funcionario: "+e1.getNome()+" Salario: "+e1.getSalario());
	}
}
