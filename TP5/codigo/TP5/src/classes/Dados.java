package classes;

/**
 * Menu para administração de dados em classes
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public class Dados {

	private  Cliente[] cliente = new Cliente[50];
	private int numCliente = 0;
	private Funcionario[] funcionario = new Funcionario[50];
	private int numFun = 0;
	private Sapato[] sapato = new Sapato[50];
	private int numSap = 0;
	private Meia[] meia = new Meia[50];
	private int numMeia = 0;
	private Venda[] venda = new Venda[50];
	private int numVenda = 0;
	private Loja[] loja = new Loja[1];
	private int numLoja = 0;
	
	/**
	 * Adição de dados cadastrados
	 */
	public void fill() {
		loja[0] = new Loja("","","",0,0,0,0); 
		cliente[0] = new Cliente("Pedro","esquina",99334334,"322.232.345-34","2.232.323",1); 
		numCliente++;
		funcionario[0] = new Funcionario("ele","esquina",99334334,"322.232.345-34","2.232.323",1,"caixa", "80.932.485/0001-90", 500, 8); 
		numFun++;
		sapato[0] = new Sapato(40,"adidas","largo",25,"azul",10); 
		numSap++;
		meia[0] = new Meia(38,"adidas","Cano curto",25,"Branco",10); 
		numMeia++;
	}
	public Sapato[] getSapato() {
		return sapato;
	}

	public void setSapato(Sapato[] sapato) {
		this.sapato = sapato;
	}

	public int getNumSapato() {
		return numSap;
	}

	public void setNumSapato(int numSap) {
		this.numSap = numSap;
	}

	public Meia[] getMeia() {
		return meia;
	}

	public void setMeia(Meia[] meia) {
		this.meia = meia;
	}

	public int getNumMeia() {
		return numMeia;
	}

	public void setNumMeia(int numMeia) {
		this.numMeia = numMeia;
	}

	public Venda[] getVenda() {
		return venda;
	}

	public void setVenda(Venda[] venda) {
		this.venda = venda;
	}

	public int getNumVenda() {
		return numVenda;
	}

	public void setNumVenda(int numVenda) {
		this.numVenda = numVenda;
	}

	public Loja[] getLoja() {
		return loja;
	}

	public void setLoja(Loja[] loja) {
		this.loja = loja;
	}

	public int getNumLoja() {
		return numLoja;
	}

	public void setNumLoja(int numLoja) {
		this.numLoja = numLoja;
	}

	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}

	public Cliente[] getCliente() {
		return cliente;
	}
	
	public void setClientes(Cliente[] cliente) {
		this.cliente = cliente;
	}
	
	public void inserirEditarCliente(Cliente a, int pos) {
		this.cliente[pos] = a;
		if(pos == numCliente) numCliente++;
	}
	
	public int getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	
	public Funcionario[] getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario[] funcionario) {
		this.funcionario = funcionario;
	}
	
	public void inserirEditarFun(Funcionario p, int pos) {
		this.funcionario[pos] = p;
		if(pos == numFun) numFun++;
	}
	
	public int getNumFun() {
		return numFun;
	}
	public void setNumFun(int numFun) {
		this.numFun = numFun;
	}
	
	public void inserirEditarSapato(Sapato p, int pos) {
		this.sapato[pos] = p;
		if(pos == numSap) numSap++;
	}
	
	public void inserirEditarMeia(Meia p, int pos) {
		this.meia[pos] = p;
		if(pos == numMeia) numMeia++;
	}
	public void inserirEditarLoja(Loja p) {
		this.loja[0] = p;
	}
	public void inserirEditarVenda(Venda p, int pos) {
		this.venda[pos] = p;
		if(pos == numVenda) numVenda++;
	}
}
