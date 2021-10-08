package classes;

/**
 * Class de Meia
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public class Meia {
	
	private String marca, tipo, cor;
	private int preco,idMeia,tamanho, numMeia=0;
	private Cliente cliente;
	private Loja loja;
	
	/**
	 * Registro/edição de Meia
	 * @param tam tamanho int
	 * @param m marca String
	 * @param t tipo String
	 * @param p preço int
	 * @param c cor String
	 * @param id idMeia int ID da Meia
	 */
	public Meia (int tam, String m, String t, int p, String c, int id){
		
		tamanho = tam;
		marca = m;
		tipo = t;
		preco = p;
		cor = c;
		idMeia = id;
		
	}
	
	
	
	public int getTamanho() {
		return tamanho;
	}



	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}



	public String toString() {	
		return "Marca da meia: " + marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getIdMeia() {
		return idMeia;
	}

	public void setIdMeia(int idMeia) {
		this.idMeia = idMeia;
	}

	public int getNumMeia() {
		return numMeia;
	}

	public void setNumMeia(int numMeia) {
		this.numMeia = numMeia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	
	
}
