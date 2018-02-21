package br.com.fiap.ddd.exercicio2;

public class MaiorQueLimiteDiarioException extends Exception{
	
	
	public MaiorQueLimiteDiarioException() {
		
		super("Não é possivel sacar maior que o limite diario!");
	}

}
