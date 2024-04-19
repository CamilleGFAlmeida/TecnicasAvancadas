package ex2_teste;

public class testeamigo {
    public static void main(String[] args) {
    	System.out.println("Testando o 2º programa ! - Mostrar amigo \n ");
       
    	
    	amigo amigop = new amigo("Luana Torres", 27, "99999-8888 \n");
        
    	System.out.println("Nome: " + amigop.nome);
    	
    	System.out.println("Idade Antiga: " + amigop.idade);
        
        System.out.println("Telefone: " + amigop.telefone);
        
        System.out.println("Idade em meses: " + amigop.idadeEmMeses());
        amigop.aniversario();
        
        System.out.println("Nova idade: " + amigop.getIdade());
       
    }
}