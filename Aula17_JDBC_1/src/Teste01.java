import java.sql.SQLException;

public class Teste01 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ConnectionManager con = new ConnectionManager();
		
		con.conn();
		System.out.println("Conectado!");
			
		
	}

}
