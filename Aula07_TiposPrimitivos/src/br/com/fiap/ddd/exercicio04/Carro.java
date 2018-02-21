package br.com.fiap.ddd.exercicio04;


public class Carro {

	String modelo;
	String fabricante;
	int anoFabricacao;
	Cor cor;
	boolean airBag;
	boolean abs;
	boolean direcaoHidraulica;
	boolean arCondicionado;

	/*O metodo exibirOpcionais exibe no console os opcionais do carro. Ou seja, se o carro possui AirBag,
	ABS, Direcao Hidraulica e Ar Condicionado*/
	void exibirOpcionais() {
	
		System.out.println("Possui AirBag: " + airBag);
		System.out.println("Possui ABS: " + abs);
		System.out.println("Possui Direcao Hidraulica: " + direcaoHidraulica);
		System.out.println("Possui Ar Condicionado: " +arCondicionado);

	}
}
