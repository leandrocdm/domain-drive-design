package br.com.fiap.ddd.exercicio08;

public class CalculaArea {

	public static void main(String[] args) {

		//
		//cria objetos das classes Circulo e Quadrado para representar as figuras exibidas no exercicio
		//
		Quadrado quadrado = new Quadrado();
		quadrado.lado = 10;
		
		Circulo circulo = new Circulo();
		circulo.raio = 5;
		
		
		
		//
		//calcula a area
		//
		double area = (quadrado.calcularArea() - circulo.calcularArea());
		
		
		
		//
		//exibe a area da figura
		//
		System.out.println("A area da figura eh: " + area);
			
	}

}
