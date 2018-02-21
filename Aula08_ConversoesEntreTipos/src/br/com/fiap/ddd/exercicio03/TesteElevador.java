package br.com.fiap.ddd.exercicio03;

public class TesteElevador {

	public static void main(String[] args) {
		

		Elevador elevador = new Elevador();
		
		elevador.inicializa(6,10);
		System.out.println("status do elevador[pessoas,andar]:  [" + elevador.quantidadeAtualPessoas + ", " + elevador.andarAtual + "]");
				
		elevador.entra(2);
		System.out.println("status do elevador[pessoas,andar]:  [" + elevador.quantidadeAtualPessoas + ", " + elevador.andarAtual + "]");
		
		
		elevador.sobe();
		elevador.sobe();
		System.out.println("status do elevador[pessoas,andar]:  [" + elevador.quantidadeAtualPessoas + ", " + elevador.andarAtual + "]");
		
		elevador.entra(4);
		System.out.println("status do elevador[pessoas,andar]:  [" + elevador.quantidadeAtualPessoas + ", " + elevador.andarAtual + "]");
		
		
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		System.out.println("status do elevador[pessoas,andar]:  [" + elevador.quantidadeAtualPessoas + ", " + elevador.andarAtual + "]");
		
		elevador.sobe();
		elevador.sobe();
		System.out.println("status do elevador[pessoas,andar]:  [" + elevador.quantidadeAtualPessoas + ", " + elevador.andarAtual + "]");
		
		
		
		if(elevador.entra(2) < elevador.capacidade)
			System.out.println("status do elevador[pessoas,andar]:  [" + elevador.quantidadeAtualPessoas + ", " + elevador.andarAtual + "]");
		else
			System.out.println("status do elevador:  o elevador jah estah cheio");
		
		
		if(elevador.sobe())
			System.out.println("status do elevador:  o elevador subiu um andar");
		else
			System.out.println("status do elevador:  o elevador jah estah no ultimo andar");
		
		
		if(elevador.desce())
			System.out.println("status do elevador:  o elevador desceu um andar");
		else
			System.out.println("status do elevador:  o elevador jah estah no terreo (andar 0)");
		
	
		
		elevador.desce();
		elevador.desce();
		System.out.println("status do elevador[pessoas,andar]:  [" + elevador.sai(2) + ", " + elevador.andarAtual + "]");
	
		elevador.desce();
		elevador.desce();
		System.out.println("status do elevador[pessoas,andar]:  [" + elevador.sai(2) + ", " + elevador.andarAtual + "]");
		
		elevador.desce();
		elevador.desce();
		System.out.println("status do elevador[pessoas,andar]:  [" + elevador.sai(2) + ", " + elevador.andarAtual + "]");
		
		
		if(elevador.desce())
			System.out.println("status do elevador:  o elevador desceu mais um andar, andar atual: " + elevador.andarAtual);
		else
			System.out.println("status do elevador:  o elevador jah estah no terreo (andar 0)");
		
		elevador.desce();
		elevador.desce();

		
		if(elevador.desce())
			System.out.println("status do elevador:  o elevador desceu mais um andar, andar atual: " + elevador.andarAtual);
		else
			System.out.println("status do elevador:  o elevador jah estah no terreo (andar 0)");
			
		
		
		
	}

}
