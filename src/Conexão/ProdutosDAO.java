package Conexão;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutosDAO {
	private Connection connection;

	public ProdutosDAO() {
		this.connection = new ConexaoFactory().getConnection();

	}

	public void adiciona(Produtos produtos) {
		
		String sql = "insert into produtos " + "(nome, descricao,quantidade,valor)"
				+ " values (?,?,?,?)";
		try {

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, produtos.getNome());
			stmt.setString(2, produtos.getDescricao());
			stmt.setInt(3, produtos.getQuantidade());
			stmt.setDouble(4, produtos.getValor());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
	  }

	}
		
	public List<Produtos> getLista() {
		try {
			List<Produtos> produtos = new ArrayList<Produtos>();
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from produtos");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {

				Produtos produto = new Produtos();
				produto.setId(rs.getInt("id"));
				produto.setNome(rs.getString("nome"));
				produto.setDescricao(rs.getString("descricao"));
				produto.setQuantidade(rs.getInt("quantidade"));
				produto.setValor(rs.getDouble("valor"));

				produtos.add(produto);
			}
			rs.close();
			stmt.close();
			return produtos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void altera(Produtos produtos){
		String sql = "update produtos set nome=?, descricao=?, quantidade=?, valor=?" + "where id=?";
		
		try {//é um objeto que envia instruções SQL pra um banco de dados
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produtos.getNome());
			stmt.setString(2, produtos.getDescricao() );
			stmt.setInt(3, produtos.getQuantidade());
			stmt.setDouble(4,produtos.getValor() );
			stmt.setInt(5, produtos.getId());
			
			stmt.execute();
			stmt.close();
			
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Produtos produtos) {
		try {
			PreparedStatement stmt = connection
					.prepareStatement("delete from produtos where id=?");
			stmt.setInt(1, produtos.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
