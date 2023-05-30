package vetor;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double Notas[][] = new double[10][4];
		
		double soma = 0.0;
		
		double media[] = new double[10];

		for (int linha = 0; linha < 10; linha++) {
			System.out.println("Digite a nota do " + (linha + 1) + "º aluno:");
			
			for (int bimestre = 0; bimestre < 4; bimestre++) {
				Notas[linha][bimestre] = leia.nextFloat();
				
				soma += Notas[linha][bimestre];
			}
			media[linha] = soma / 4;
			soma = 0.0; 
		}
		System.out.println("\nMédias:");
		for (int linha = 0; linha < 10; linha++) {
			System.out.printf("Aluno ", (linha + 1), media[linha]);
		}
	}

}