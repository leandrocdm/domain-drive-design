import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private final String rm = "RM77327";
	private final String senha = "140297";


	public Connection conn() throws SQLException {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver não encontrado");
		}
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",rm,senha);
	}

}
