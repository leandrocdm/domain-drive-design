

import java.util.HashMap;

public class Teste02 {
	
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
		
		HashMap<Integer, Cliente> map = new HashMap<Integer, Cliente>();
		
		map.put(0,cliente01);
		map.put(1, cliente02);
		map.put(2, cliente02);
		map.put(3, cliente03);
		
		
		for (int i = 0; i < map.size(); i++) {
			
			System.out.println(map.get(i).getNome());
		}
		
		
	}

}
