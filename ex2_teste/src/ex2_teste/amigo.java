package ex2_teste;

public class amigo {
		String nome;
		int idade;
		String telefone;

		public amigo(String nome, int idade, String telefone) {
			this.nome = nome;
			this.idade = idade;
			this.telefone = telefone;
		}

		public void aniversario() {
			this.idade++;
		}

		int idadeEmMeses() {
			return this.idade * 12;
		}

		void setIdade(int idade) {
			this.idade = idade;
		}

		int getIdade() {
			return this.idade;
		}

		void setNome(String nome) {
			this.nome = nome;
		}

		String getNome() {
			return this.nome;
		}

		void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		String getTelefone() {
			return this.telefone;
		
	}

}
