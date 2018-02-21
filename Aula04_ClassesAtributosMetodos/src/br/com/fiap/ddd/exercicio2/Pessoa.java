package br.com.fiap.ddd.exercicio2;

public class Pessoa{

	String nome;
	int idade;
	double altura;
	
	
	
	void alterarNome(String novoNome){
		
		nome = novoNome;
	
	}
	
	void alterarIdade(int novaIdade){
		
		idade = novaIdade;
	
	}
	
	void alterarAltura(double novaAltura){
		
		altura = novaAltura;
	
	}
	
	
	
	String retornarNome(){
		return nome;
	}
	
	int retornarIdade(){
		return idade;
	}
	
	double retornarAltura(){
		return altura;
	}
	
}