package vetor;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int contador, soma = 0;
		double media;

		for (contador = 0; contador < vetor.length; contador++) {
			System.out.println("Digite um número inteiro: ");
			vetor[contador] = leia.nextInt();
		}

		System.out.println("\nImpares:");

		for (contador = 0; contador < vetor.length; contador = contador + 2) {

			System.out.println(vetor[contador]);
		}

		System.out.println("\nPares: ");

		for (contador = 0; contador < vetor.length; contador++) {
			if (vetor[contador] % 2 == 0) {
				System.out.println(vetor[contador]);
			}
		}
		for (contador = 0; contador < vetor.length; contador++) {
			soma = contador + soma;
		}

		System.out.println("\nSoma: " + soma);

		media = soma / 10;

		System.out.println("\nMédia: " + media);
	}
}
