package Conexão;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Listagem {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConexaoFactory().getConnection();
		PreparedStatement stmt = (PreparedStatement) con.prepareStatement("select * from usuarios");
		
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			  String nome = rs.getString("nome");
			  String email = rs.getString("email");

			  System.out.println(nome + " :: " + email);
			}

			stmt.close();
			con.close();

	}
}
