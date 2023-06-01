package collection_fila;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Fila {

	public static void main(String[] args) {
		
		
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		
		String escolha;
		int opcao=0 ;
		
		System.out.println("************************************************************");
		System.out.println("\t");
		System.out.println("\t    1 - Adicionar clientes a  fila");
		System.out.println("\t    2 - Listar todos os clientes");
		System.out.println("\t    3 - Retirar Clientes da fila");
		System.out.println("\t    4 - sair");
		System.out.println("\t");
		System.out.println("************************************************************");
			
		while(opcao!=4) {
			System.out.println("Digite a Opção Desejada");
			opcao = leia.nextInt();
			
			if(opcao == 1) {
				System.out.println("\nDigite o nome do cliente: " );
				escolha = leia.next();
				fila.add(escolha);
				System.out.println("\nCliente adicionado(a): \n" );
	
			}if(opcao == 2){
				System.out.println("\n"+ fila);
					   System.out.println("\nDigite a Opção Desejada");
					   opcao = leia.nextInt();
										
			}if(opcao==3) {fila.poll();
			
		}
		}System.out.println("Programa Finalizado");
		
		leia.close();
	} 
}

