package br.com.fiap.ddd.exercicio04;

public class Direcao {

	int valor1;
	int valor2;
	int valor3;

	String retornarTextoDirecao() {

		if ((valor1 == 0) && (valor2 == 0) && (valor3 == 0))
			return "Nenhum";

		else if ((valor1 == 0) && (valor2 == 0) && (valor3 == 1))
			return "Direita";

		else if ((valor1 == 0) && (valor2 == 1) && (valor3 == 0))
			return "Centro";

		else if ((valor1 == 0) && (valor2 == 1) && (valor3 == 1))
			return "Centro-Direita";

		else if ((valor1 == 1) && (valor2 == 0) && (valor3 == 0))
			return "Esquerda";

		else if ((valor1 == 1) && (valor2 == 0) && (valor3 == 1))
			return "Esquerda-Direita";

		else if ((valor1 == 1) && (valor2 == 1) && (valor3 == 0))
			return "Centro-Esquerda";

		else
			return "";

	}

}
