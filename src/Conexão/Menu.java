package Conexão;

import java.util.List;
import java.util.Scanner;

import com.mysql.fabric.xmlrpc.base.Data;

public class Menu {

	static Scanner entrada = new Scanner(System.in);
	private ProdutosDAO dao = new ProdutosDAO();
	
	public static void menu(){
		System.out.println("Escolha uma opcao");
		System.out.println("1, inserir");
		System.out.println("2, Listar");
		System.out.println("3, Altera (Atualizar)");
		System.out.println("4, deletar");
		System.out.println("0, sair");
	}
	
	public void inserir(){
		
		Produtos produtosadd = new Produtos();
		
		System.out.println("Você entrou no método Inserir.");
		System.out.println("nome do produto");
		produtosadd.setNome(entrada.nextLine());
		System.out.println("nome da descricao");
		produtosadd.setDescricao(entrada.nextLine());
		System.out.println("Quantidade do produto");
		produtosadd.setQuantidade(entrada.nextInt());
		System.out.println("Valor do produto");
		produtosadd.setValor(entrada.nextDouble());
		dao.adiciona(produtosadd);
	
	}
	
	public void alterar(){
		
		Produtos produtosAt = new Produtos();
		
		System.out.println("Você entrou no método Alterar.");
		System.out.println("Nome do produto");
		produtosAt.setNome(entrada.nextLine());
		System.out.println("Descricao do produto");
		produtosAt.setDescricao(entrada.nextLine());
		System.out.println("Quantidade do produto");
		produtosAt.setQuantidade(entrada.nextInt());
		System.out.println("Valor do produto");
		produtosAt.setValor(entrada.nextDouble());
		System.out.println("insira o id do produto que voce deseja altera");
		produtosAt.setId(entrada.nextInt());
		dao.altera(produtosAt);
	}
	
	public void deletar(){
		Produtos produtosRe = new Produtos();
		
		System.out.println("Você entrou no método Deletar.");
		System.out.println("Insira o id do produto");
		produtosRe.setId(entrada.nextInt());
		dao.remove(produtosRe);
	}
	
	public void Lista(){
		
		List<Produtos> produto = dao.getLista();

		for (Produtos produto1 : produto) {
			System.out.println("Nome: " + produto1.getNome());
			System.out.println("Descricao: " + produto1.getDescricao());
			System.out.println("Quantidade: " + produto1.getQuantidade());
			System.out.println("Valor :" + produto1.getValor());
			System.out.println("-----------------------------------");
			System.out.println();
		}
	}
	

}
