package controle;

import javax.swing.JOptionPane;

import classes.*;

/**
* Controla as interações entre view e classes para alteração de dados
* @author Pedro Henrique Elias
* @version 1.0 (Out 2021)
*/
public class ControleDados {
	private Dados d = new Dados();
	
	public ControleDados() {
		d.fill();
	}
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}

	public Cliente[] getCliente() {
		return this.d.getCliente();
	}
	
	public Funcionario[] getFuncionario() {
		return this.d.getFuncionario();
		
	}
	
	public Sapato[] getSapato() {
		return this.d.getSapato();
	}
	
	public Meia[] getMeia() {
		return this.d.getMeia();
		
	}
	public Loja[] getLoja() {
		return this.d.getLoja();
		
	}
	public Venda[] getVenda() {
		return this.d.getVenda();
	}
	/**
	 * Procura a posição de um cliente utilizando seu id para comparar com todos os clientes na array, como não a mais de
	 * um id por cliente, não é necessário passar mais de uma posição
	 * @param id um numero do id do cliente que sera usado para achar sua posição compararando 
	 * com todos os clientes na array
	 * @return fim um numero que indica a posição na array do cliente procurado
	 */
	public int pesquisaIdCliente(int id) {
		int fim=-10;
		for (int j = 0; j < getNumCliente(); j++) {
			if (id == ControleCliente.getID(j)) {
				fim = j;
			}
		}
		return fim;
	}
	
	/**
	 * Procura a posição de um funcionario utilizando seu id para comparar com todos os funcionarios na array, como não a mais de
	 * um id por funcionario, não é necessário passar mais de uma posição
	 * @param id um numero do id do funcionario que sera usado para achar sua posição compararando 
	 * com todos os funcionarios na array
	 * @return fim um numero que indica a posição na array do funcionario procurado
	 */
	public int pesquisaIdFun(int id) {
		int fim=-10;
		for (int j = 0; j < getNumFun(); j++) {
			if (id == ControleFuncionario.getID(j)) {
				fim = j;
			}
		}
		return fim;
	}
	
	/**
	 * Procura a posição de um sapato utilizando seu id para comparar com todos os sapatos na array, como não a mais de
	 * um id por sapato, não é necessário passar mais de uma posição
	 * @param id um numero do id do sapato que sera usado para achar sua posição compararando 
	 * com todos os sapatos na array
	 * @return fim um numero que indica a posição na array do sapato procurado
	 */
	public int pesquisaIdSapato(int id) {
		int fim=-10;
		for (int j = 0; j < getNumSapato(); j++) {
			if (id == ControleSapato.getID(j)) {
				fim = j;
			}
		}
		return fim;
	}
	
	/**
	 * Procura a posição de uma meia utilizando seu id para comparar com todos as meias na array, como não a mais de
	 * um id por meia, não é necessário passar mais de uma posição
	 * @param id um numero do id da meia que sera usado para achar sua posição compararando 
	 * com todas as meias na array
	 * @return fim um numero que indica a posição na array da meia procurada
	 */
	public int pesquisaIdMeia(int id) {
		int fim=-20;
		for (int j = 0; j < getNumMeia(); j++) {
			if (id == ControleMeia.getID(j)) {
				fim = j;
			}
		}
		return fim;
	}
	
	/**
	 * Procura a posição de uma venda utilizando seu id para comparar com todos as meias na array, como não a mais de
	 * um id por venda, não é necessário passar mais de uma posição
	 * @param id um numero do id da Venda que sera usado para achar sua posição compararando 
	 * com todas as vendas na array
	 * @return fim um numero que indica a posição na array da venda procurada
	 */
	public int pesquisaIdVenda(int id) {
		int fim=-20;
		for (int j = 0; j < getNumVenda(); j++) {
			if (id == ControleVenda.getID(j)) {
				fim = j;
			}
		}
		return fim;
	}
	
	public int getNumCliente() {
		return this.d.getNumCliente();
	}
	public int getNumVenda() {
		return this.d.getNumVenda();
	}
	
	public int getNumFun() {
		return this.d.getNumFun();
	}
	
	public int getNumSapato() {
		return this.d.getNumSapato();
	}
	
	public int getNumMeia() {
		return this.d.getNumMeia();
	}
	
	/**
	 * Insere ou edita o cliente na possição da array indicada
	 * @param dadosClinte uma String array com os dados a serem passados
	 * novoDado[0] =  Posição na array
	 * novoDado[1] =  Nome
	 * novoDado[2] =  Endereço
	 * novoDado[3] =  Telefone
	 * novoDado[4] =  CPF
	 * novoDado[5] =  RG
	 * novoDado[6] =  ID do Cliente
	 * @return verdadeiro ou falso, verdadeiro se os dados passados sejam aceitos e falso se não forem
	 */
	public boolean inserirEditarCliente(String[] dadosClinte) {
		if(!dadosClinte[3].matches("[0-9]+") || dadosClinte[4].length() != 14 || dadosClinte[5].length() != 9 ||
				!dadosClinte[6].matches("[0-9]+")) {
			
			JOptionPane.showMessageDialog(null,"Dados não salvos, letras no lugar de numero ou CPF e RG incorretos", null, 
					JOptionPane.ERROR_MESSAGE);
			return false;
		}else {
			Cliente c = new Cliente(dadosClinte[1], dadosClinte[2], Integer.parseInt(dadosClinte[3]), 
				dadosClinte[4],dadosClinte[5],
							Integer.parseInt(dadosClinte[6]));
			d.inserirEditarCliente(c, Integer.parseInt(dadosClinte[0]));
			return true;
		}
	}
	
	/**
	 * Insere ou edita o funcionario na possição da array indicada
	 * @param dadosFun uma String array com os dados a serem passados
	 * novoDado[0] =  Posição na array
	 * novoDado[1] =  Nome
	 * novoDado[2] =  Endereço
	 * novoDado[3] =  Telefone
	 * novoDado[4] =  CPF
	 * novoDado[5] =  RG
	 * novoDado[6] =  ID do funcionario
	 * novoDado[7] =  Funçao
	 * novoDado[8] =  CNPJ
	 * novoDado[9] =  Salalio
	 * novoDado[10] =  Horario de Trabalho
	 */
	public void inserirEditarFun(String[] dadosFun) {
		if(!dadosFun[3].matches("[0-9]+") || dadosFun[4].length() != 14 || dadosFun[5].length() != 9 ||
				dadosFun[8].length() != 18){
			JOptionPane.showMessageDialog(null,"Dados não salvos, letras no lugar de numero ou CPF, RG e CNPJ incorretos", null, 
					JOptionPane.ERROR_MESSAGE);
		}else {
			Funcionario f = new Funcionario(dadosFun[1], dadosFun[2], 
					Integer.parseInt(dadosFun[3]), dadosFun[4],dadosFun[5],
					Integer.parseInt(dadosFun[6]), dadosFun[7], 
					dadosFun[8], Integer.parseInt(dadosFun[9]), Integer.parseInt(dadosFun[10]));
			d.inserirEditarFun(f, Integer.parseInt(dadosFun[0]));
		}
	}
	
	/**
	 * Insere ou edita o sapato na possição da array indicada
	 * @param dadosSapato uma String array com os dados a serem passados
	 * novoDado[0] =  Posição na array
	 * novoDado[1] =  Tamanho
	 * novoDado[2] =  Marca
	 * novoDado[3] =  Tipo
	 * novoDado[4] =  Preco
	 * novoDado[5] =  Cor
	 * novoDado[6] =  ID do sapato
	 * @return verdadeiro ou falso, verdadeiro se os dados passados sejam aceitos e falso se não forem
	 */
	public boolean inserirEditarSapato(String[] dadosSapato) {
		if(!dadosSapato[1].matches("[0-9]+") || !dadosSapato[4].matches("[0-9]+") || !dadosSapato[6].matches("[0-9]+")) {
			JOptionPane.showMessageDialog(null,"Dados não salvos, letras no lugar de numero", null, 
					JOptionPane.ERROR_MESSAGE);
			return false;
			
		} else {
			Sapato s = new Sapato(Integer.parseInt(dadosSapato[1]), dadosSapato[2], dadosSapato[3], 
					Integer.parseInt(dadosSapato[4]), dadosSapato[5], Integer.parseInt(dadosSapato[6]));
			d.inserirEditarSapato(s, Integer.parseInt(dadosSapato[0]));
			return true;
		}
	}
	
	/**
	 * Insere ou edita a meia na possição da array indicada
	 * @param dadosMeia uma String array com os dados a serem passados
	 * novoDado[0] =  Posição na array
	 * novoDado[1] =  Tamanho
	 * novoDado[2] =  Marca
	 * novoDado[3] =  Tipo
	 * novoDado[4] =  Preco
	 * novoDado[5] =  Cor
	 * novoDado[6] =  ID do meia
	 */
	public void inserirEditarMeia(String[] dadosMeia) {
		if(!dadosMeia[1].matches("[0-9]+") || !dadosMeia[4].matches("[0-9]+") || !dadosMeia[6].matches("[0-9]+")) {
			JOptionPane.showMessageDialog(null,"Dados não salvos, letras no lugar de numero", null, 
					JOptionPane.ERROR_MESSAGE);
			
		}else {
			Meia m = new Meia(Integer.parseInt(dadosMeia[1]), dadosMeia[2], dadosMeia[3], 
					Integer.parseInt(dadosMeia[4]), dadosMeia[5], Integer.parseInt(dadosMeia[6]));
			d.inserirEditarMeia(m, Integer.parseInt(dadosMeia[0]));
		}
	}
	
	/**
	 * Edita a loja
	 * @param dadosLoja uma String array com os dados a serem passados
	 * novoDado[1] =  Nome
	 * novoDado[2] =  Endereço
	 * novoDado[3] =  CNPJ
	 * novoDado[4] =  Numero de funcionario
	 * novoDado[5] =  Horario de funcionamento
  	 * novoDado[6] =  Estoque de sapato
	 * novoDado[7] =  Estoque de meia
	 * @return verdadeiro ou falso, verdadeiro se os dados passados sejam aceitos e falso se não forem
	 */
	public boolean inserirEditarLoja(String[] dadosLoja) {
		if(!dadosLoja[4].matches("[0-9]+") || !dadosLoja[5].matches("[0-9]+") || !dadosLoja[6].matches("[0-9]+")|| 
				!dadosLoja[7].matches("[0-9]+") || dadosLoja[3].length() != 18 ) {
			JOptionPane.showMessageDialog(null,"Dados não salvos, letras no lugar de numero ou CNPJ incorreto", null, 
					JOptionPane.ERROR_MESSAGE);
			return false;
			
		}else {
			Loja l = new Loja(dadosLoja[1], dadosLoja[2], dadosLoja[3], 
				Integer.parseInt(dadosLoja[4]), Integer.parseInt(dadosLoja[5]), Integer.parseInt(dadosLoja[6]),
				Integer.parseInt(dadosLoja[7]));
			d.inserirEditarLoja(l);
		return true;
		}
	}
	

	/**
	 * Insere ou edita a venda na possição da array indicada
	 * @param dadosVenda uma String array com os dados a serem passados
	 * novoDado[0] =  Posição na array
	 * novoDado[1] =  ID da venda
	 * novoDado[2] =  Quantidade de sapatos
	 * novoDado[3] =  Quantidade de meias
	 * novoDado[4] =  Preco total
	 * novoDado[5] =  Cliente (possição na array)
	 * novoDado[6] =  Funcionario (possição na array)
	 */
	
	public void inserirEditarVenda(String[] dadosVenda, int pos) {
		if(!dadosVenda[1].matches("[0-9]+") || !dadosVenda[2].matches("[0-9]+") || !dadosVenda[3].matches("[0-9]+")
				|| !dadosVenda[4].matches("[0-9]+") || !dadosVenda[5].matches("[0-9]+")|| !dadosVenda[6].matches("[0-9]+")
				|| d.getCliente()[Integer.parseInt(dadosVenda[5])] ==null 
				|| d.getFuncionario()[Integer.parseInt(dadosVenda[6])] ==null) {
			JOptionPane.showMessageDialog(null,"Dados não salvos, letras no lugar de numero ou cliente não existe ou "
					+ "funcionario não existe", null, JOptionPane.ERROR_MESSAGE);
			
		}else {
			Cliente c = d.getCliente()[Integer.parseInt(dadosVenda[5])];
			Funcionario f = d.getFuncionario()[Integer.parseInt(dadosVenda[6])];
			Venda m = new Venda(Integer.parseInt(dadosVenda[1]), Integer.parseInt(dadosVenda[2]), Integer.parseInt(dadosVenda[3]), 
					Integer.parseInt(dadosVenda[4]),c,f);
			d.inserirEditarVenda(m, Integer.parseInt(dadosVenda[0]));
			if(pos==1) {
			Loja l = new Loja(getLoja()[0].getNome(), getLoja()[0].getEndereco(), getLoja()[0].getCnpj(),
					d.getNumSapato(), getLoja()[0].getHorarioFuncionamento(), 
					 getLoja()[0].getEstoqueSapato()- Integer.parseInt(dadosVenda[2]), 
					getLoja()[0].getEstoqueMeia() - Integer.parseInt(dadosVenda[3]));
				d.inserirEditarLoja(l);
			}
		}
	}
	
	/**
	 * Remove o cliente na possição da array indicada
	 * @param i numero da possição da array
	 */
	public void removerCliente(int i) {

		d.getCliente()[i] = null;
		d.getCliente()[i] = d.getCliente()[i+1];
		d.getCliente()[d.getNumCliente()] = null;
		d.setNumCliente(d.getNumCliente() - 1);
		
	}
	
	/**
	 * Remove o funcionario na possição da array indicada
	 * @param i numero da possição da array
	 */
	public void removerFuncionario(int i) {
		
		d.getFuncionario()[i] = null;
		d.getFuncionario()[i] = d.getFuncionario()[i+1];
		d.getFuncionario()[d.getNumFun()] = null;
		d.setNumFun(d.getNumFun() - 1);
	}
	
	/**
	 * Remove o sapato na possição da array indicada
	 * @param i numero da possição da array
	 */
	public void removerSapato(int i) {

		d.getSapato()[i] = null;
		d.getSapato()[i] = d.getSapato()[i+1];
		d.getSapato()[d.getNumSapato()] = null;
		d.setNumSapato(d.getNumSapato() - 1);
	}
	
	/**
	 * Remove o meia na possição da array indicada
	 * @param i numero da possição da array
	 */
	public void removerMeia(int i) {
		
		d.getMeia()[i] = null;
		d.getMeia()[i] = d.getMeia()[i+1];
		d.getMeia()[d.getNumMeia()] = null;
		d.setNumMeia(d.getNumMeia() - 1);
	}
	
	/**
	 * Remove a venda na possição da array indicada
	 * @param i numero da possição da array
	 */
	public void removerVenda(int i) {
		
		d.getVenda()[i] = null;
		d.getVenda()[i] = d.getVenda()[i+1];
		d.getVenda()[d.getNumVenda()] = null;
		d.setNumVenda(d.getNumVenda() - 1);
	}
}