

import java.util.ArrayList;

public class Teste01 {

	public static void main(String[] args) {

		Cliente cliente01 = new Cliente();

		cliente01.setNome("leandro2s");
		cliente01.setIdade(10);

		Cliente cliente02 = new Cliente();

		cliente02.setNome("sd");
		cliente02.setIdade(10);

		Cliente cliente03 = new Cliente();

		cliente03.setNome("sasdasds");
		cliente03.setIdade(10);


		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		lista.add(cliente01);
		lista.add(cliente02);
		lista.add(cliente03);


		for (int i = 0; i < lista.size(); i++) {
			
		System.out.println(lista.get(i).getNome());

		}

	}

}
