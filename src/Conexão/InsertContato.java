package Conexão;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertContato {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = new ConexaoFactory().getConnection();
		
		 String sql = "insert into contatos" +
	                " (nome,email,)" +
	                " values (?,?)";
	        PreparedStatement stmt = con.prepareStatement(sql);
	        
	        stmt.setString(1, "Nice");
	        stmt.setString(2, "Nice Nice@Nice.com.br");
	        
	        stmt.execute();
	        stmt.close();

	        System.out.println("Gravado!");

	        con.close();
	        
	        Contato bd = new Contato();
	        bd.adiciona("meu nome", "meu email");
	}
}
