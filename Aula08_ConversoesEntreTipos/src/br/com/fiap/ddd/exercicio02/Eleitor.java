package br.com.fiap.ddd.exercicio02;

public class Eleitor {

	int idade;
	String tipoEleitor;
	
	
	boolean isEleitorObrigatorio(){
		
		if(idade < 16){
			tipoEleitor = "nao eh eleitor";
			return false;			
		}
		else if( (idade >= 18) && ( idade <= 65)){
			tipoEleitor = "eleitor obrigatorio";
			return true;			
		}
		else if( (idade == 16) || (idade == 17) || (idade > 65) ){
			tipoEleitor = "eleitor facultativo";
			return false;
		}
		else
			return false;
	}
	
}
