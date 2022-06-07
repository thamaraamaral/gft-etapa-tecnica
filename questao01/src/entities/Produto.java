package entities;

public class Produto {

	private String nome;
	private double valor;
	private int tipo;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(String nome, double valor, int tipo) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + ", tipo=" + tipo + "]";
	}
	
	
}
