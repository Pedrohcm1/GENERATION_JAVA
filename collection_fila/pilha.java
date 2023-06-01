package collection_fila;

import java.util.Scanner;
import java.util.Stack;

public class pilha {
	public static void main(String[] args) {
		
		
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		
		String livro;
		int opcao=0 ;
		
		System.out.println("************************************************************");
		System.out.println("\t");
		System.out.println("\t    1 - Adicionar livro a pilha");
		System.out.println("\t    2 - Listar todos os livros");
		System.out.println("\t    3 - Retirar livro da pilha");
		System.out.println("\t    4 - sair");
		System.out.println("\t");
		System.out.println("************************************************************");
			
		while(opcao!=4) {
			System.out.println("Digite a Opção Desejada\n");
			opcao = leia.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do Livro:  ");
			    livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("Livro adicionado!");
				
				
			case 2:		
					System.out.println("\n"+ pilha);
				   System.out.println("\nDigite a Opção Desejada");
				   opcao = leia.nextInt();
				
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha esta vazia! ");
				} else {
					pilha.pop();
					}
				
				
			default:
				
			}System.out.println("Programa finalizado.");
			
			
		} leia.close();

	}

}