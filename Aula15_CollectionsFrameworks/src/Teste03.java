

import java.util.ArrayList;
import java.util.Scanner;

public class Teste03 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2= new Cliente();
		Cliente cliente3 = new Cliente();
		
			System.out.println("nome");
			cliente1.setNome(input.next());
			
			System.out.println("nome");
			cliente2.setNome(input.next());
			
			System.out.println("nome");
			cliente3.setNome(input.next());
			
	
		
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		
		listaCliente.add(cliente1);
		listaCliente.add(cliente2);
		listaCliente.add(cliente3);
		
		
		
		
	}

}
