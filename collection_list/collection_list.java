package collection_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class collection_list {
	
public static void main(String[] args) {

	ArrayList<String> cores = new ArrayList<String>();
	Scanner leia = new Scanner(System.in);
	
	String cor;
	
	for(int contador = 0 ; contador <5 ; contador++ ) {
		System.out.println("Digite uma Cor: ");
			cor = leia.next();
			cores.add(cor);
	}	
		
		System.out.println("Você escolheu as cores: " + cores);
		
		Collections.sort(cores);''
		System.out.println("Sua cores ordenadas são: "+ cores);
}

}