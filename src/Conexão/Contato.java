package Conexão;

import java.sql.PreparedStatement;

public class Contato {

	private int id;
	private String nome;
	private String email;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String novo) {
		this.nome = novo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String novo) {
		this.email = novo;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int string) {
		this.id = string;
	}

	public void adiciona(String string, String string2) {
		// TODO Auto-generated method stub

	}

}
