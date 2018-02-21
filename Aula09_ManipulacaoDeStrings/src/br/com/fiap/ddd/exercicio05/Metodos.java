package br.com.fiap.ddd.exercicio05;

public class Metodos {


	void metodoEquals(String palavra1, String palavra2){
		System.out.println("*********************************************************");
		System.out.println("O metodo EQUALS serve para validar se uma string é igual a outra");
		if(palavra1.equals(palavra2)){
			System.out.println("São iguais");
		}else{
			System.out.println("Não são iguais");
		}
		System.out.println("*********************************************************");		
	}

	void metodoEqualsIgnoreCase(String palavra1, String palavra2){	
		System.out.println("*********************************************************");
		System.out.println("O metodo EQUALSIGNORECASE serve para validar se uma string é igual a outra ignorando se tem caracter em caixa alta");
		if(palavra1.equalsIgnoreCase(palavra2)){
			System.out.println("São iguais");
		}else{
			System.out.println("Não são iguais");
		}
		System.out.println("*********************************************************");		
	}
	
	void metodoStartsWith(String palavra1, String frase){
		System.out.println("*********************************************************");
		System.out.println("O metodo STARTSWITH serve para validar se uma string começa com alguma string que você especifica");
		if(frase.startsWith(palavra1) == true){
			System.out.println("A sua primeira palavra começa na frase");
		}else{
			System.out.println("A sua primeira palavra não começa na frase");
		}
	}
	
	void metodoEndsWith(String palavra1, String frase){
		System.out.println("*********************************************************");
		System.out.println("O metodo ENDSWITH serve para validar se uma string começa com alguma string que você especifica");
		if(frase.endsWith(palavra1) == true){
			System.out.println("A sua primeira palavra termina na frase");
		}else{
			System.out.println("A sua primeira palavra não termina na frase");
		}
	}
	
	void metodoLength(String frase){
		System.out.println("*********************************************************");
		System.out.println("O metodo LENGTH serve para retornar o numedo de caracteres da sua string");
		System.out.println("Na sua frase contem "+frase.length()+" caracteres");
		System.out.println("*********************************************************");
	}
	
	void metodoCharAt(int num, String frase){
		System.out.println("*********************************************************");
		System.out.println("O metodo CHARAT serve para pegar um char da string");
		System.out.println("O index da sua frase de acordo com seu numero: "+frase.charAt(num));
		System.out.println("*********************************************************");   	
	}
	
	void metodoIndexOf(int num, String frase){
		System.out.println("*********************************************************");
		System.out.println("O metodo INDEXOF serve para mostrar em qual index está um certo char, o primeiro, exenplo 'a' ");
		System.out.println(frase.indexOf('a'));
		System.out.println("*********************************************************");
	}
	
	void metodoLastIndexOf(int num, String frase){
		System.out.println("*********************************************************");
		System.out.println("O metodo INDEXOF serve para mostrar em qual index está um certo char, o ultimo, exenplo 'a' ");
		System.out.println(frase.lastIndexOf('a'));
		System.out.println("*********************************************************");
	}
	
	void metodoSubstring(int num, String frase){
		System.out.println("*********************************************************");
		System.out.println("O metodo SUBSTRING serve para escolher o index que até que index você quer ver -1 char de uma derterminada String, o primeiro vai ser 0 e o segundo o seu numero");
		System.out.println(frase.substring(0,num));
		System.out.println("*********************************************************");
	}

	void metodoToLowerCase(String frase){
		System.out.println("*********************************************************");
		System.out.println("O metodo TOLOWERCASE serve para deixar a String toda em minusculo");
		System.out.println(frase.toLowerCase());
		System.out.println("*********************************************************");
	}
	void metodoToUpperCase(String frase){
		System.out.println("*********************************************************");
		System.out.println("O metodo TOUPPERCASE serve para deixar a String toda em maiuscula");
		System.out.println(frase.toUpperCase());
		System.out.println("*********************************************************");
	}
	void metodoReplace(String frase){
		System.out.println("*********************************************************");
		System.out.println("O metodo REPLACE serve para substituir um char da string, vamos usar o '*' pra substituir as vogais da frase");
		System.out.println(frase.replace('a','*').replace('e','*').replace('i','*').replace('o','*').replace('u','*'));
	}

}
