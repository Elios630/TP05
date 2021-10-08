package classes;

/**
 * Class de Loja
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public class Loja {
	
	private String Nome, endereco, cnpj;
	private int quantidadeFuncionarios, horarioFuncionamento, estoqueSapato, estoqueMeia ;
	private Sapato sapato;
	private Meia meia;
	
	/**
	 * Registro/edição de Loja (usado apenas para edição)
	 * @param m Nome String
	 * @param t endereco String
	 * @param p cnpj String
	 * @param c quantidadeFuncionarios int
	 * @param h horarioFuncionamento int
	 * @param s estoqueSapato int
	 * @param meia estoqueMeia int
	 */
	public Loja (String m, String t,  String p,int c,int h, int s, int meia){

		Nome = m;
		endereco = t;
		cnpj = p;
		quantidadeFuncionarios = c;
		horarioFuncionamento = h;
		estoqueSapato = s;
		estoqueMeia= meia;
		
	}
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}
	public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}
	public int getHorarioFuncionamento() {
		return horarioFuncionamento;
	}
	public void setHorarioFuncionamento(int horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}
	public int getEstoqueMeia() {
		return estoqueMeia;
	}
	public void setEstoqueMeia(int estoqueMeia) {
		this.estoqueMeia = estoqueMeia;
	}
	public int getEstoqueSapato() {
		return estoqueSapato;
	}
	public void setEstoqueSapato(int estoqueSapato) {
		this.estoqueSapato = estoqueSapato;
	}
	public Sapato getSapato() {
		return sapato;
	}
	public void setSapato(Sapato sapato) {
		this.sapato = sapato;
	}
	public Meia getMeia() {
		return meia;
	}
	public void setMeia(Meia meia) {
		this.meia = meia;
	}
	
	
	
	

}
