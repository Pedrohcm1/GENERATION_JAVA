package atividade_java_lacos_condicionais_if;

import java.util.Scanner;

public class Lista_1_laco_condicional_if_2 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Digite um número ");
		int numero = (int) leia.nextInt();

		boolean positivo = (numero > 0);
		boolean negativo = (numero < 0);
		boolean par   = (0 == (numero % 2));
		boolean impar = (0 != (numero % 2));
		
		if (positivo && par ) 		{
			System.out.println("O Número " + numero + " é par e positivo!");
			}
		if (positivo && impar ) 		{
			System.out.println("O Número " + numero + " é impar e positivo!");
			}
		if (negativo && par ) 		{
			System.out.println("O Número " + numero + " é par e negativo!");
			}
		if (negativo && impar ) 		{
			System.out.println("O Número " + numero + " é impar e negativo!");
			} 
			else {System.out.println("0 é um número neutro");
	
			}
	}
}
