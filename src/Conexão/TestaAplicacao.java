package Conexão;

import java.util.List;
import java.util.Scanner;

public class TestaAplicacao {
	public static void main(String[] args) { // Método
		
		Menu m = new Menu();  // Cria um objeto m do tp menu
		int opcao;	//Uma variável
		
		Scanner entrada = new Scanner(System.in); 	//Ler o teclado
		
		do{	//Inicia um laço
			m.menu();	//Chama a classe menu
			opcao = entrada.nextInt();	// opacao = numero que eu for digitar
			switch(opcao){	//manipula as cases
				case 1:	
				m.inserir();
				
                break;
                
				case 2:
					m.Lista();
		        break;
		                
		        case 3:
		            m.alterar(); 
		        break;
		        
		        case 4:
		        	m.deletar();
		        break;
			}
		}while(opcao != 0);
		
	}
}
	