import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Teste01 {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter outputStream = new FileWriter("/home/leandrocdm/Documentos/teste.txt");
		PrintWriter arquivoSaida = new PrintWriter(outputStream);
		
		arquivoSaida.print("Leandrinhowns");	
		arquivoSaida.close();

	}

}
