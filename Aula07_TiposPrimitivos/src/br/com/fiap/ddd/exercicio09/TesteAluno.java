package br.com.fiap.ddd.exercicio09;

public class TesteAluno {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		Disciplina dbdp = new Disciplina();
		
		aluno1.nome = "Mario Sergio Cortella";
		aluno1.disciplina = dbdp;
		aluno1.atribuirNotas(5.0, 7.5, 9.0);
		
		System.out.println("O aluno " + aluno1.nome + " obteve media "+ aluno1.obterMedia() +".");
		//ou...
		//System.out.printf("O aluno " + aluno1.nome + " obteve media %.1f.", aluno1.obterMedia());

		
	}

}
