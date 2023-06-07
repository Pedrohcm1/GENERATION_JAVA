package clientes;

public class Testa_Cliente {

	public static void main(String[] args) {
		

		Clientes cliente1 = new Clientes("Antonio", "rua", 1, 93939393, 2);
		cliente1.Visualizar();

		Clientes cliente2 = new Clientes("Andressa", "Rua 2", 2, 988885555, 1);
		cliente2.Visualizar();
		
	}
	
}
