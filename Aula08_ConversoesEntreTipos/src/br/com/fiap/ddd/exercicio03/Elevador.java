package br.com.fiap.ddd.exercicio03;

public class Elevador {

	int andarAtual = 0;
	int quantidadeAndar;
	int capacidade;
	int quantidadeAtualPessoas = 0;
	
	
	
	void inicializa(int novaCapacidade, int novaQuantidadeAndar) {

		capacidade = novaCapacidade;
		quantidadeAndar = novaQuantidadeAndar;

	}
	
	
	
	int entra(int quantidadePessoa) {

		if ((quantidadeAtualPessoas + quantidadePessoa) <= capacidade) {

			quantidadeAtualPessoas += quantidadePessoa;

		}

		return quantidadeAtualPessoas;

	}
	
	
	
	int sai(int quantidadePessoa) {

		if ((quantidadeAtualPessoas - quantidadePessoa) >= 0) {

			quantidadeAtualPessoas = (quantidadeAtualPessoas - quantidadePessoa);

		}

		return quantidadeAtualPessoas;

	}
	
	
	
	boolean sobe() {

		if ((andarAtual + 1) <= quantidadeAndar) {

			++andarAtual;

			return true;

		} else {

			return false;
		}

	}
	
	
	
	boolean desce() {

		if ((andarAtual - 1) >= 0) {

			--andarAtual;

			return true;

		} else {

			return false;
		}

	}

}
