package br.com.fiap.ddd.exercicio2;

public class ValorNegativoException  extends Exception{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	public ValorNegativoException() {
		
		super("Não é possivel realizar essa operação com valor negativo!");
	}
}
