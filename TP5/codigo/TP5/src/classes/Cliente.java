package classes;

/**
 * Class de Cliente
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public class Cliente extends Pessoa {
	
	private int idCliente;
	private Venda[] venda = new Venda[1];
	
	/**
	 * Registro/edição de Cliente
	 * @param n nome String
	 * @param e endereço String
	 * @param t telefone int
	 * @param c cpf String
	 * @param r rg String
	 * @param id idCliente int ID do cliente
	 */
	public Cliente (String n, String e, int t, String c, String r,int id){

		nome = n;
		endereço = e;
		telefone = t;
		cpf = c;
		rg = r;
		idCliente = id;
	}
	
	public  Cliente() {
	
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Venda[] getVenda() {
		return venda;
	}

	public void setVenda(Venda[] venda) {
		this.venda = venda;
	}
	
	
}
