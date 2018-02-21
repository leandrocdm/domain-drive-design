package br.com.fiap.ddd.exercicio09;

public class Disciplina {
	
	double nota1;
	double nota2;
	double nota3;
	
	double obterMedia(){
		return ((nota1 + nota2 + nota3)/3);
	}
	
}
