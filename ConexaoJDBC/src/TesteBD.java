import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class TesteBD {

	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/exercicio?useTimezone=true&serverTimezone=UTC&useSSL=false","root","1234");
			PreparedStatement stmt = con.prepareStatement("SELECT NOME, SOBRENOME FROM CLIENTE");
			ResultSet rs = stmt.executeQuery();
			rs.next();
			String nomePrimeiraLinha = rs.getString("nome");
			String sobrenomePrimeiraLinha = rs.getString(2);
			
			System.out.println(nomePrimeiraLinha + " " + sobrenomePrimeiraLinha);
			
			System.out.println("Conectado!");
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
