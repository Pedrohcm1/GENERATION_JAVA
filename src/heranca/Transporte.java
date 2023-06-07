package heranca;

public class Transporte {

		private int capacidade;

		public Transporte(int capacidadetransporte) {
			super();
			this.capacidade = capacidadetransporte;
		}

		public int getCapacidade() {
			return capacidade;
		}

		public void setCapacidade(int capacidade) {
			this.capacidade = capacidade;
		}
		
		public void visualizar() {
			System.out.println("\n\n************************************************************");
			System.out.println("A capacidade total de passageiros é: " + this.capacidade);
			System.out.println("\n\n************************************************************");
		}
		
}
