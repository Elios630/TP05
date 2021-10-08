package classes;

/**
 * Class de venda
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public class Venda {

	private int idVenda, quantidadeSapato, quantidadeMeias, precoTotal;
	private Funcionario funcionario;
	private Cliente cliente;
	private Sapato sapato;
	private Meia meia;
	
	/**
	 * Registro/edição de vendas
	 * @param id ID da Venda int ID da venda
	 * @param quaS quantidadeSapato int
	 * @param quaM quantidadeMeias int
	 * @param pec precoTotal int
	 * @param cli cliente Cliente
	 * @param fun funcionario Funcionario
	 */
	public Venda (int id, int quaS, int quaM, int pec, Cliente cli, Funcionario fun){

		idVenda = id;
		quantidadeSapato = quaS;
		quantidadeMeias = quaM;
		precoTotal = pec;
		cliente = cli;
		funcionario = fun;
	}
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public int getQuantidadeSapato() {
		return quantidadeSapato;
	}
	public void setQuantidadeSapato(int quantidadeSapato) {
		this.quantidadeSapato = quantidadeSapato;
	}
	public int getQuantidadeMeias() {
		return quantidadeMeias;
	}
	public void setQuantidadeMeias(int quantidadeMeias) {
		this.quantidadeMeias = quantidadeMeias;
	}
	public int getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(int precoTotal) {
		this.precoTotal = precoTotal;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
