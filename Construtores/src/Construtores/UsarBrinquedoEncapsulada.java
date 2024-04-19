package Construtores;

	
	public class UsarBrinquedoEncapsulada {
		public static void main (String[] args) {
			Brinquedo brinquedo1 = new Brinquedo(); 
			brinquedo1.setCodigo(20);
			System.out.println(brinquedo1.getCodigo());
		}
}

