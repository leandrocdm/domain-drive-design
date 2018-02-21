package br.com.fiap.ddd.exercicio01;

public class Pessoa {
	String nome;
	double altura;
	double peso;

	
	String retonarNomePessoaMaisPesada(Pessoa outraPessoa){
		
		if(peso > outraPessoa.peso)
			return nome;
		else if(outraPessoa.peso > peso)
			return outraPessoa.nome;
		else
			return "mesmo peso";
		
	}
	
	
	String retonarNomePessoaMaisAlta(Pessoa outraPessoa){
		
		if(altura > outraPessoa.altura)
			return nome;
		else if(outraPessoa.altura > altura)
			return outraPessoa.nome;
		else
			return "mesma altura";
		
	}
	
}
