package br.com.fiap.ddd.exercicio09;

public class AliquotaImpostoRenda {

	String informarAliquota(double rendaLiquida) {

		if (rendaLiquida <= 10000d) {
			return "isento";
		} else if ((rendaLiquida > 10000d) && (rendaLiquida <= 30000d)) {
			return "5%";
		} else if ((rendaLiquida > 30000d) && (rendaLiquida <= 60000d)) {
			return "10%";
		} else if ((rendaLiquida > 60000d)) {
			return "15%";
		} else
			return "";
	}
	
}
