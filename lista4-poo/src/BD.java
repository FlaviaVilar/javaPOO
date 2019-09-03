

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BD {

	public Connection con;
	public PreparedStatement st;
	public ResultSet rs;

	private final String BANCO = "contato";
	private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
	private final String URL = "jdbc:sqlserver://localhost:1433;databasename=" + BANCO;
	private final String LOGIN = "sa";
	private final String SENHA = "123456789";

	public boolean getConnection() {

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, LOGIN, SENHA);
			System.out.println("Conectou");
			return true;
		}
		catch(ClassNotFoundException erro) {
			System.out.println(erro.toString());
			return false;
		}
		catch(SQLException erro) {
			System.out.println(erro.toString());
			return false;
		}

	}
	public void close() {
		try { 
			if(rs!=null)
				rs.close(); }
		catch(SQLException e) {System.out.println(e.toString());}
		try {
			if(rs!=null)
				st.close();}
		catch(SQLException e) {System.out.println(e.toString());}
		try {
			con.close();
			System.out.println("Desconectou");
		}
		catch(SQLException e) {
			System.out.println(e.toString());

		}
	}
	/*----------------------------------------Teste-------------------------------------------------*/

	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
		bd.close();

	}


}
