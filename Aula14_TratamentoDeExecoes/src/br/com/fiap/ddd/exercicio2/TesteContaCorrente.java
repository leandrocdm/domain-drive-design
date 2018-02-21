package br.com.fiap.ddd.exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ContaCorrente t1 = new ContaCorrente();

		try {
			System.out.println("Digite o limite diario desejado");
			t1.setValorLimiteDiario(input.nextDouble());
			
			t1.setarSaldoAutomaticamente();
			
		}catch (InputMismatchException ex) {

			System.out.println("Digite apenas numeros");

			ex.printStackTrace();

			System.exit(1);
			
		}catch(ValorNegativoException e) {
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();

			System.exit(1);
		}

		try {
			System.out.println("***********************************");
			System.out.println("Seu saldo atual: "+t1.getSaldo());
			System.out.println("***********************************");
			
			System.out.println("Digite o valor que deseja sacar");
			
			t1.sacar(input.nextDouble());


		}catch (InputMismatchException ex) {

			System.out.println("Digite apenas numeros");

			ex.printStackTrace();

			System.exit(2);
			
		}catch(ValorNegativoException e) {
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();

			System.exit(2);

		}catch(MaiorQueLimiteDiarioException ex) {
			
			System.out.println(ex.getMessage() + "(Limite diario: "+t1.getValorLimiteDiario()+")");
			
			ex.printStackTrace();

			System.exit(2);
		}

		try {
			System.out.println("***********************************");
			System.out.println("Seu saldo atual: "+t1.getSaldo());
			System.out.println("***********************************");
			
			System.out.println("Digite o valor que deseja depositar");
			
			t1.depositar(input.nextDouble());

		}catch (InputMismatchException ex) {

			System.out.println("Digite apenas numeros");

			ex.printStackTrace();

			System.exit(3);
			
		}catch(ValorNegativoException e) {
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();

			System.exit(3);

		}finally {
			System.out.println("***********************************");
			System.out.println("Seu saldo atual: "+t1.getSaldo());
			System.out.println("***********************************");
			
			System.out.println("Saindo do programa...");

			input.close();
			
			System.exit(0);
		}

	}

}
