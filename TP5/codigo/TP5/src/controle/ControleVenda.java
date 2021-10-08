package controle;

import classes.Venda;

/**
 * Auxiliar ControleDados nas interações entre view e classes quando se é relacionado a venda 
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public class ControleVenda {
	private static Venda[] a;
	private int numVenda;
	
	public ControleVenda(ControleDados d) {
		a = d.getVenda();
		numVenda = d.getNumVenda();
		
	}
	
	public String[] listaVenda() {
		String[] s = new String[numVenda];
		for(int i = 0; i < numVenda; i++) {
			s[i] = String.valueOf(a[i].getIdVenda());
		}
		
		return s;
	}
	
	public int getQtd() {
		return numVenda;
	}

	public void setQtd(int qtd) {
		this.numVenda = qtd;
	}
	public static int getID(int i) {
		int numID = a[i].getIdVenda();
		return numID;
	}
}
