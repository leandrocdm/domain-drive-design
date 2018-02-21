package br.com.fiap.ddd.exercicio05;

/*c) Crie uma classe de teste para testar o funcionamento dos metodos
 somar e subtrair da classe Calculadora e imprima(exiba no
 console) os resultados destas operacoes 
 */
public class TesteCalculadora {
	
	public static void main(String[] args){
		
		Calculadora calculadora = new Calculadora();
		System.out.printf("Teste da soma (45,60 + 17,23): %.2f" , calculadora.somar(45.60, 17.23));
		System.out.println();
		System.out.printf("Teste da subtracao (23,03 - 8,03): %.2f" , calculadora.subtrair(23.03d, 8.03d));
		
	}

}
