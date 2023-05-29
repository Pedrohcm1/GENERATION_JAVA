package lacos_de_repeticao;

import java.util.Scanner;

public class Laco_de_repeticao_do_while {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int soma = 0 , n;
		
		do{
			
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			
			 soma = soma + n;
	
		}while(n != 0);
			System.out.println("A soma dos números digitados é: " + soma);
	}

}
