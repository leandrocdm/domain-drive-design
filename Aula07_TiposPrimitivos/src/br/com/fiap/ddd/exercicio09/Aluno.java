package br.com.fiap.ddd.exercicio09;

public class Aluno {

	Disciplina disciplina;
	String nome;
	
	void atribuirNotas(double nota1, double nota2, double nota3){
		
		disciplina.nota1 = nota1;
		disciplina.nota2 = nota2;
		disciplina.nota3 = nota3;
		
	}
	
	double obterMedia(){
		return disciplina.obterMedia();
	}
}
