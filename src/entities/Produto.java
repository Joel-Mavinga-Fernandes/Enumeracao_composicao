package entities;

public class Produto {
	
	private String nomeP;
	private Double preco;
	
	@Override
	public String toString() {
		return nomeP;
	}
	public Produto() {
		
	}

	public Produto(String nome, Double preco) {
		this.nomeP = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nomeP;
	}

	public void setNome(String nome) {
		this.nomeP = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
	
	
	

}
