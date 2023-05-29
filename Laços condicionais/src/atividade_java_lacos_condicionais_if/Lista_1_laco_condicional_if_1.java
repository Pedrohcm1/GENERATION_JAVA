package atividade_java_lacos_condicionais_if;

import java.util.Scanner;

public class Lista_1_laco_condicional_if_1 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
			
		System.out.println("Digite o número A");
		int numero1 = (int) leia.nextInt();
		
		System.out.println("Digite o número B");
		int numero2 = (int) leia.nextInt();

		System.out.println("Digite o número C");
		int numero3 = (int) leia.nextInt();
		
		if (numero1 + numero2 > numero3) 		{
			System.out.println("A Soma de A + B é Maior do que C");
			}
		if (numero1 + numero2 < numero3) 	{
			System.out.println("A Soma de A + B é Menor do que C");
			}
		if (numero1 + numero2 == numero3) 	{
			System.out.println("A Soma de A + B é igual a C");
			}
		}
	}