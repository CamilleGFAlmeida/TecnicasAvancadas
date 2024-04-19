package Proj_meuobjeto; 


public class MeuObjeto {
    String nome;
    int idade;
    String telefone;

    // Método para aumentar a idade em 1
    public void aniversario() {
        idade = idade + 1;
    }
    
    int IdadeEmMeses() {
    	return (idade * 12);
    }
    
    void alteraIdade (int nova_idade) {
    	idade = nova_idade; 
    }

    // Método para exibir informações sobre o objeto
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Telefone: " + telefone);
    }

    public void Objeto() { /*  public static void main(String[] args) */ 
        // Criando um objeto da classe MeuObjeto
        MeuObjeto amigo = new MeuObjeto();

        // Definindo os valores dos atributos do objeto
        amigo.nome = "Joao";
        amigo.idade = 33;
        amigo.telefone = "333334444";

        // Exibindo a idade antiga e aumentando a idade em 1
        System.out.println("Idade Antiga: " + amigo.idade);
        amigo.aniversario();
        System.out.println("Idade Nova: " + amigo.idade);
        amigo.idade = amigo.IdadeEmMeses(); 
        System.out.println("Idade em Meses: " + amigo.idade);
        amigo.alteraIdade(36); 
        System.out.println("Idade atualizada: " + amigo.idade);
        
        // Exibindo todas as informações do objeto
        amigo.mostrarInformacoes();
    }
    
   
}  



	

