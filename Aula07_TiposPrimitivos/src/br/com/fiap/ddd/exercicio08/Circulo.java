package br.com.fiap.ddd.exercicio08;

public class Circulo {

	double raio;
	double pi = 3.1416;//numero pi (http://pt.wikipedia.org/wiki/Pi)
		
	
	double calcularArea(){
		return pi * Math.pow(raio, 2);
	}
}
