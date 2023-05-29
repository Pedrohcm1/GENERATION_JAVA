package lacos_de_repeticao;

import java.util.Scanner;

public class Laco_de_repeticao_while {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0 , maior = 0 , menor = 0;
		
		while(idade >= 0) {
			
			System.out.println("Digite um idade: ");
			idade = leia.nextInt();
			
			if(idade<21) {
				menor++;
			
			}else if(idade>50) {
				maior++;
			}
		}
			System.out.println("Pessoas menor de 21: " + menor);
			System.out.println("Pessoas maior de 50: " + maior);
	}

}
