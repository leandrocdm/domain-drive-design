package br.com.fiap.ddd.exercicio08;

public class IndiceMassaCorporea {

	String classificar(Pessoa pessoa) {

		//IMC = peso/altura^2
		double imc = (pessoa.peso / Math.pow(pessoa.altura, 2));

		if (imc <= 18.5)
			return "Abaixo do Peso";
		else if ((imc >= 18.6) && (imc <= 24.9))
			return "Saud�vel";
		else if ((imc >= 25.0) && (imc <= 29.9))
			return "Sobrepeso";
		else if ((imc >= 30.0) && (imc <= 34.9))
			return "Obesidade Grau I";
		else if ((imc >= 35.0) && (imc <= 39.9))
			return "Obesidade Grau II (severa)";
		else if (imc >= 40.0)
			return "Obesidade Grau III (m�rbida)";
		else
			return "";
	}

}
