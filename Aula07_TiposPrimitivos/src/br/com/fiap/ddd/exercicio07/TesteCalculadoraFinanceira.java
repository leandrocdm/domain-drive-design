package br.com.fiap.ddd.exercicio07;

/*
 	c) Crie uma classe para testar os metodos da classe
	CalculadoraFinanceira e exibir no console os resultados das
	operacoes desta classe 
*/
public class TesteCalculadoraFinanceira {
	
	public static void main(String[] args) {
	
		/*cria variaveis para ficar mais facil passar os mesmos valores para
		os dois metodos a serem testados */
		double capital = 1000d;// R$1.000,00
		double taxa = 0.01;// 1% ao mes
		int periodo = 5;// 5 meses
		double resultado;
		
		
		
		System.out.println("***** *** ** * Calculo de Juros simples e composto para: ");
		System.out.printf("Capital: R$%.2f" , capital);System.out.println();
		System.out.println("Taxa de juros: " + (taxa*100) + "%");
		System.out.println("Periodo: " + periodo+" meses");
				
		//instancia(cria) um objeto da classe CalculadoraFinanceira
		CalculadoraFinanceira calcFin = new CalculadoraFinanceira();
		
		System.out.println();
		
		//testa o metodo calcularJurosSimples
		resultado = calcFin.calcularJurosSimples(capital,taxa,periodo);
		System.out.printf("-> Juros simples: %.2f" , resultado);
	
		System.out.println();
		
		//testa o metodo calcularJurosCompostos
		resultado = calcFin.calcularJurosCompostos(capital,taxa,periodo);
		System.out.printf("-> Juros compostos: %.2f" , resultado);
		
	}

}
