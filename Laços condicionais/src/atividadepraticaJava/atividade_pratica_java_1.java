package atividadepraticaJava;

import java.util.Scanner;

public class atividade_pratica_java_1 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int novosalario;
		
		System.out.println("Digite seu salário atual");
		int salario = (int) leia.nextFloat();
		 
		System.out.println("Digite o abono salarial");
		int abonosalarial = (int) leia.nextFloat();
		
		novosalario = salario + abonosalarial;
		
		System.out.println("Seu Salário atual é " + novosalario + " Reais");
		}

}