package br.com.fiap.ddd.exercicio09;

public class Contribuinte {

	String nome;
	String cpf;
	int numeroDependentes;
	double rendaBruta;
	
	
	
	double calcularRendaLiquida() {
	
		return ( rendaBruta - (numeroDependentes * 600.0) );
	
	}
	
	
	
	String informarAliquota(){
		
		double rendaLiquida = calcularRendaLiquida();
			
		AliquotaImpostoRenda aliquota = new AliquotaImpostoRenda();
	
		return aliquota.informarAliquota(rendaLiquida);
		
	}

}
