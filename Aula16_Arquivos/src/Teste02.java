import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Teste02 {

	public static void main(String[] args) throws IOException {

		FileReader input = new FileReader("/home/leandrocdm/Documentos/teste.txt");
		BufferedReader arquivoEntrada = new BufferedReader(input);
		
		
		StringBuilder linha2 = new StringBuilder();
		
		linha2.append(arquivoEntrada.readLine());
		
		System.out.println(linha2);	
					
		arquivoEntrada.close();
		input.close();


	}

}
