package Construtores;

public class Brinquedo4Construtores {
	private int codigo; 
	private String nome; 
	private String descricao; 
	private double preco; 
	public Brinquedo4Construtores () {
	}
	
	public Brinquedo4Construtores (int codigo) {
		this.codigo = codigo; 
	}
	
	public Brinquedo4Construtores (String nome) {
		this.nome = nome; 
	}
	
	public Brinquedo4Construtores (int codigo, String nome, String descricao, double preco) {
		this.codigo = codigo; 
		this.nome = nome; 
		this.descricao = descricao; 
		this.preco = preco; 
	}
	
	public void incluir() {
		System.out.println("Incluindo brinquedo!");
	}
	
	public void mostrar() {
		System.out.println("Código: " + codigo + "\nNome: " + nome + "\nDescrição: " +descricao + "\nPreço: " +preco); ;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo; 
	}
	
	public int getCodigo() {
		return codigo; 
	}
}
