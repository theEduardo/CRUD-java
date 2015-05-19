package Conexão;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConexaoFactory {
	public Connection getConnection() {
        try {
            return (Connection) DriverManager.getConnection(
          "jdbc:mysql://localhost/agenda", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
