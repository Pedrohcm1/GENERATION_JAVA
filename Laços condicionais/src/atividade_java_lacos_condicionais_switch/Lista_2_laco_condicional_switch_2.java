package atividade_java_lacos_condicionais_switch;

import java.util.Scanner;

public class Lista_2_laco_condicional_switch_2 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float novosalario;
	
		System.out.println("Digite o nome do colaborador");
		String nome = leia.nextLine();
		
		System.out.println("Digite o salário do colaborador ");
		float salario = leia.nextFloat();
		
		System.out.println("Digite o código do cargo de 1 a 6 ");
		int codigo = leia.nextInt();
		
		switch(codigo) {
		
		case 1:
	
			novosalario = (salario * 1.1f);
			
			
			System.out.println(nome + " o seu cargo é de gerente e o seu novo salário é de " + novosalario);
			
			break;
			
		case 2:
			
			novosalario = (salario * 1.07f);
			
			
			System.out.println(nome + " o seu cargo é de vendedor e o seu novo salário é de " + novosalario);
			
			break;
			
		case 3:
			
			novosalario = (salario * 1.09f);
			
			System.out.println(nome + " o seu cargo é de supervisor e o seu novo salário é de " + novosalario);
			
			break;
			
		case 4:
			
			novosalario = (salario * 1.06f);
	
			System.out.println(nome + " o seu cargo é de motorista e o seu novo salário é de " + novosalario);
			
			break;
			
		case 5:
			
			novosalario = (salario * 1.05f);
			
			System.out.println(nome + " o seu cargo é de estoquista e o seu novo salário é de " + novosalario);
			
			break;
			
		case 6:
			
			novosalario = (salario * 1.08f);
			
			System.out.println(nome + " o seu cargo é de técnico de TI e o seu novo salário é de " + novosalario);
			
			break;
		default: System.out.println("Opção invalida");
		
		}
	}	
}