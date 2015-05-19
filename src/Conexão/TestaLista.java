package Conexão;

import java.util.List;

public class TestaLista {
	public static void main(String[] args) {

		Contato cc = new Contato();

		cc.setEmail("Nice Nice@nice.com");
		cc.setNome("Nice");

		Contato con = new Contato();
		con.setId(10);

		Contato conAtua = new Contato();

		conAtua.setNome("Chapa Nice");
		conAtua.setEmail("Nice Nice Chapa @nice.com");
		conAtua.setId(11);

		ContatoDao dao = new ContatoDao();
		// dao.adiciona(cc);
		// dao.remove(con);
		dao.altera(conAtua);

		List<Contato> contatos = dao.getLista();

		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("-----------------------------------");
		}
	}
}
