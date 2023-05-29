package lacos_de_repeticao;

import java.util.Scanner;

public class Lacos_de_repeticao_for {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int  contador, n1 , n2;
		
		System.out.println("Digite um Número");
		n1 = leia.nextInt();
		
		System.out.println("Digite um número maior que o primeiro");
		n2 = leia.nextInt();
		
		if(n1>n2) {
			
			System.out.println("Número Inválido");
		
		}else {
				System.out.println("Entre o número: " + n1 + " e o número " + n2 + ":" );
			for(contador = n1 ; contador < n2 ; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0 && contador != 0) {
					System.out.println("O número " + contador + " é multiplo por 3 e 5");
				}
			
		}
	}
	}
}	