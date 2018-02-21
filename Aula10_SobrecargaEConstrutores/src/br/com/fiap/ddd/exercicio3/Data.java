package br.com.fiap.ddd.exercicio3;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		this.dia = 0;
		this.mes = 0;
		this.ano = 0;
	}

	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String returnarFormato(int dia, int mes, int ano){
		String data;
		return data = dia+"/"+mes+"/"+ano;
	}

	void validarDia(int dia){
		if(dia >= 1 && dia <= 31){
			this.dia = dia;
		}else{
			this.dia = 1;
		}
	}

	void validarMes(int mes){
		if(mes >= 1 && mes <= 12){
			this.mes = mes;
		}else{
			this.mes = 1;
		}
	}
	
	void validarAno(int ano){
		if(ano < 0){
			this.ano = ano;
		}else{
			this.ano = 2017;
		}
	}
	
	void nomeMes(String mes){
		if(mes == "1"){
			System.out.println("Janeiro");
		}
		if(mes == "2"){
			System.out.println("Fevereiro");
		}
		if(mes == "3"){
			System.out.println("Marco");
		}
		if(mes == "4"){
			System.out.println("Abril");
		}
		if(mes == "5"){
			System.out.println("Maio");
		}
		if(mes == "6"){
			System.out.println("Junho");
		}
		if(mes == "7"){
			System.out.println("Julho");
		}
		if(mes == "8"){
			System.out.println("Agosto");
		}
		if(mes == "9"){
			System.out.println("Setembro");
		}
		if(mes == "10"){
			System.out.println("Outubro");
		}
		if(mes == "11"){
			System.out.println("Novembro");
		}
		if(mes == "12"){
			System.out.println("Dezembro");
		}
	}
}

