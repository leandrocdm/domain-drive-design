package br.com.fiap.ddd.exercicio2;

public class Veiculo {
	
	String placa;
	String marca;
	String modelo;
	int ano;
	
	Veiculo(){
		
	}

	Veiculo(String placa){
		this.placa = placa;
	}
	
	Veiculo(String placa, String marca){
		this(placa);
		this.marca  = marca;
	}
	
	Veiculo(String placa, String marca, String modelo){
		this(placa,marca);
		this.modelo = modelo;
	}
	
	boolean validarAno(int ano){
		if(ano >= 1900 && ano <= 2017){
			return true;
		}else{
			return false;
		}
	}
}
