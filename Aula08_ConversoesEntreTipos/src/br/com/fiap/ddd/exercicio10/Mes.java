package br.com.fiap.ddd.exercicio10;

public class Mes {

	boolean mesValido(int numeroMes){
		
		if( (numeroMes >= 1) && (numeroMes <= 12))
			return true;
		else
			return false;
		
	}
	
	
	String retornarNome(int numeroMes) {

		String mes = null;

		switch (numeroMes) {
			case 1: {
				mes = "Janeiro";
				break;
			}
			case 2: {
				mes = "Fevereiro";
				break;
			}
			case 3: {
				mes = "Mar�o";
				break;
			}
			case 4: {
				mes = "Abril";
				break;
			}
			case 5: {
				mes = "Maio";
				break;
			}
			case 6: {
				mes = "Junho";
				break;
			}
			case 7: {
				mes = "Julho";
				break;
			}
			case 8: {
				mes = "Agosto";
				break;
			}
			case 9: {
				mes = "Setembro";
				break;
			}
			case 10: {
				mes = "Outubro";
				break;
			}
			case 11: {
				mes = "Novembro";
				break;
			}
			case 12: {
				mes = "Dezembro";
				break;
			}
		}

		return mes;

	}
	
}
