package classes;

/**
 * Abstract Class de Pessoa
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public abstract class Pessoa {

	protected String nome, endere�o, cpf, rg;
	
	protected int telefone;
	
		public String getRG() {
			return rg;
		}
		public void setRG(String rg) {
			this.rg = rg;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndereco() {
			return endere�o;
		}
		public void setEndere�o(String endereco) {
			this.endere�o = endereco;
		}
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		
		public String getCPF() {
			return cpf;
		}
		public void setCPF(String cpf) {
			this.cpf = cpf;

		}
		public String getEndere�o() {
			return endere�o;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
}

