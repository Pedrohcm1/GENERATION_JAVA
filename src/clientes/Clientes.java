package clientes;

public class Clientes {
	
	private String nome;
	private String endereco;
	private int codcliente;
	private int telefone;
	private int tipo;

	public Clientes(String nome, String endereco, int codcliente, int telefone, int tipo) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.codcliente = codcliente;
		this.telefone = telefone;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCodcliente() {
		return codcliente;
	}

	public void setCodcliente(int codcliente) {
		this.codcliente = codcliente;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void Visualizar() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Código do cliente: " + this.codcliente);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Tipo de cliente: " + this.tipo);
		
	}
}