package Construtores;

public class BrinquedoTestaConstrutor {
	public static void main(String[] args) {
		Brinquedo4Construtores brinquedo1 = new Brinquedo4Construtores (); 
		Brinquedo4Construtores brinquedo2 = new Brinquedo4Construtores (110); 
		Brinquedo4Construtores brinquedo3 = new Brinquedo4Construtores ("Skate"); 
		Brinquedo4Construtores brinquedo4 = new Brinquedo4Construtores (110, "Skate", "O melhor skate de todos", 294.8); 

		brinquedo1.mostrar();
		brinquedo2.mostrar();
		brinquedo3.mostrar();
		brinquedo4.mostrar();
	}
}
