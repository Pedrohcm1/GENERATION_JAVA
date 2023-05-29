package atividadepraticaJava;

import java.util.Scanner;

public class Atividade_pratica_java_2 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float mediafinal;
		
		System.out.println("Digite a 1ª nota");
		float nota1 = (float) leia.nextFloat();
		 
		System.out.println("Digitea 2ª nota");
		float nota2 = (float) leia.nextFloat();
		
		System.out.println("Digite a 3ª nota");
		float nota3 = (float) leia.nextFloat();
		 
		System.out.println("Digitea 4ª nota");
		float nota4 = (float) leia.nextFloat();
		
		mediafinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Sua média final é " + mediafinal +".");
		
	}

}
