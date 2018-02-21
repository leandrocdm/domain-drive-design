package br.com.fiap.ddd.exercicio06;

public class Livro {

	int isbn;
	String tituloOriginal;
	String tituloPortugues;
	String autor;
	int qtdPaginas;
	String edicao;
	int dataPublicacao;
	String status;
	
	
	void metodoStatusLivro(String tituloOriginal, String tituloPortugues){
		this.status = status.concat("Titulo: ").concat(this.tituloOriginal).concat("Titulo em portugues: ").concat(this.tituloPortugues);
		System.out.println(status);
	}
}
