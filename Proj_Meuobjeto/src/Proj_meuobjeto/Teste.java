package Proj_meuobjeto;

public class Teste {
    public static void main(String[] args) {
        // Criando um objeto da classe MeuObjeto
        MeuObjeto amigo = new MeuObjeto();

        // Definindo os valores dos atributos do objeto
        amigo.nome = "Maria";
        amigo.idade = 25;
        amigo.telefone = "555556666";

        // Exibindo as informações do objeto
        System.out.println("Informações do amigo:");
        amigo.mostrarInformacoes();

        // Realizando um aniversário
        amigo.aniversario();

        // Exibindo as informações atualizadas do objeto
        System.out.println("\nApós o aniversário:");
        amigo.mostrarInformacoes();
        
        
    }
}



