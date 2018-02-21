package br.com.fiap.ddd.exercicio1;

public class Funcionario {
	
	String nome;
	long matricula;
	Profissao profissao;
	double salario;
	
	
	Funcionario(){
		
	}
	
	Funcionario(long matricula){
		this.matricula = matricula;
	}

	Funcionario(long matricula, String nome){
		this(matricula);
		this.nome = nome;
	}
	
	Funcionario(long matricula, String nome, Profissao profissao){
		this(matricula, nome);
		this.profissao = profissao;
		
	}
	
	void exibirDadosFuncionarios(){
		
	}
	
	void setProfissao(Profissao profissao){
		this.profissao = profissao;
	}
	
}
