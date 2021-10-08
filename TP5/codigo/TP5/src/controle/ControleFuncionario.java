package controle;

import classes.Funcionario;

/**
 * Auxiliar ControleDados nas interações entre view e classes quando se é relacionado a funcionario 
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public class ControleFuncionario {
	private static Funcionario[] a;
	private int numFuncionario;
	
	public ControleFuncionario(ControleDados d) {
		a = d.getFuncionario();
		numFuncionario = d.getNumFun();
		
	}
	
	public String[] listaFuncionarioIDS() {
		String[] s = new String[numFuncionario];
		for(int i = 0; i < numFuncionario; i++) {
			s[i] = String.valueOf(a[i].getIdFuncionario());
		}
		
		return s;
	}
	
	public int getQtd() {
		return numFuncionario;
	}

	public void setQtd(int qtd) {
		this.numFuncionario = qtd;
	}
	
	public String getNome(int i) {		
		return a[i].getNome();
	}
	
	public String getEndereco(int i) {		
		return a[i].getEndereco();
	}	

	public String getTelefone(int i) {
		String numTelefone = String.valueOf(a[i].getTelefone());
		return numTelefone;
	}
	
	public String getCPF(int i) {
		return a[i].getCPF();
	}
	
	public String getRG(int i) {
		return a[i].getRG();
	}
	
	public static int getID(int i) {
		int numID = a[i].getIdFuncionario();
		return numID;
	}
	
	public String getFuncao(int i) {
		return a[i].getFuncao();
	}
	
	public String getCNPJ(int i) {
		return a[i].getCNPJ();
	}
	
	public String getSalario(int i) {
		String numID = String.valueOf(a[i].getSalario());
		return numID;
	}
	
	public String getHorarioTrabalho(int i) {
		String numID = String.valueOf(a[i].getHorarioTrabalho());
		return numID;
	}
	
	public void setnumFuncionario(int numFuncionario) {
		this.numFuncionario = numFuncionario;
	}
	
}
