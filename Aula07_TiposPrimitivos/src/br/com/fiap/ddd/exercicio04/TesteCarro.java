package br.com.fiap.ddd.exercicio04;


public class TesteCarro {

	public static void main(String[] args) {

		Carro c = new Carro();
		
		c.modelo = "Gol";
		c.fabricante = "Volkswagen";
		c.anoFabricacao = 2012;
		c.airBag = false;
		c.abs = false;
		c.direcaoHidraulica = true;
		c.arCondicionado = true;

		c.exibirOpcionais();

	}
}
