package atividade_java_lacos_condicionais_switch;

import java.util.Scanner;

public class Lista_2_laco_condicional_switch_1 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int	total;
	
		System.out.println("Digite o código do produto de 1 a 6 ");
		int codigo = (int) leia.nextInt();
		
		System.out.println("Digite a quantidade desejada");
		int quantidade = (int) leia.nextInt();
		
		
		switch(codigo) {
		
			case 1:
		
				total = quantidade * 10;
				System.out.println("O Seu Cachorro quente ficou por " + total + " Reais");
				
				break;
		
			case 2:
				
				total = quantidade * 15;
				System.out.println("O Seu X-Salada ficou por " + total + " Reais");
					
				break;
				
			case 3:
				
				total = quantidade * 18;
				System.out.println("O Seu X-Bacon ficou por " + total + " Reais");
				
				break;
		
			case 4:
				
				total = quantidade * 12;
				System.out.println("O Seu Bauru ficou por " + total + " Reais");
					
				break;
				
			case 5:
				
				total = quantidade * 8;
				System.out.println("O Seu Refrigerante ficou por " + total + " Reais");
				
				break;
		
			case 6:
				
				total = quantidade * 13;
				System.out.println("O Seu Suco de Laranja ficou por " + total + " Reais");
					
				break;
			default:
				System.out.println("");
	}
	}

}
