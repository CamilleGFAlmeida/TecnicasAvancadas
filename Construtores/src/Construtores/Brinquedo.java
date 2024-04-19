package Construtores;

public class Brinquedo {
	private int codigo; 
	private String nome; 
	private String descricao; 
	private double preco; 
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

	

/* Primeiro programa */

 /*public class Brinquedo {
	  private int id;
	  private String name;
	  private String description;
	  private double price;
	  private String color; // Novo campo para a cor

	  public Brinquedo(int id, String name, String description, double price, String color) {
	    this.id = id;
	    this.name = name;
	    this.description = description;
	    this.price = price;
	    this.color = color;
	  }

	public void include() {
	    System.out.println("Incluindo brinquedo!");
	  }

	  public void show() {
	    System.out.println("Código: " + this.id);
	    System.out.println("Nome: " + this.name);
	    System.out.println("Descrição: " + this.description);
	    System.out.println("Preço: " + this.price);
	    System.out.println("Cor: " + this.color); // Mostrar a cor
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	  public int getId() {
	    return this.id;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getName() {
	    return this.name;
	  }

	  public void setDescription(String description) {
	    this.description = description;
	  }

	  public String getDescription() {
	    return this.name;
	  }

	  public void setPrice(double price) {
	    this.price = price;
	  }

	  public double getPrice() {
	    return this.price;
	  }
	  
	  // Métodos para manipular a cor
	    public void setColor(String color) {
	        this.color = color;
	    }

	    public String getColor() {
	        return this.color;
	    }
	  
	  /* Classe de teste - TesteBrinquedo 
	   * public class TesteBrinquedo {
	       public static void main(String[] args) throws Exception {
	        Brinquedo presente = new Brinquedo(0, "Skate Street", "O patins mais sensacional",293.80, "rosa");
	        presente.setId(20);
	        presente.show();
	        System.out.println(presente.getId());
	        
	    }
	} */ 
	   
	
