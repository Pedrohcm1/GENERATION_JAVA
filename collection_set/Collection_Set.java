package collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class Collection_Set {

	public static void main(String[] args) {

		Set<Integer> tabela = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		Integer numero;
		
		for(int contador = 0 ; contador < 10 ; contador++) {
		System.out.println("Digite um número(Inteiro e não repetido): ");
			numero = leia.nextInt();
			tabela.add(numero);
	}	System.out.println("\nNotas cadastradas - Interface Iterator");

		Iterator<Integer> itabela = tabela.iterator();
	
		while(itabela.hasNext()) {
		System.out.println(itabela.next());

}
}
}