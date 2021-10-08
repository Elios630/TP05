package controle;

import classes.Sapato;

/**
 * Auxiliar ControleDados nas interações entre view e classes quando se é relacionado a sapato 
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public class ControleSapato {
	private static Sapato[] a;
	private int numSapato;
	
	public ControleSapato(ControleDados d) {
		a = d.getSapato();
		numSapato = d.getNumSapato();
		
	}
	
	public String[] listaSapato() {
		String[] s = new String[numSapato];
		for(int i = 0; i < numSapato; i++) {
			s[i] = String.valueOf(a[i].getIdSapato());
		}
		
		return s;
	}
	public static int getID(int i) {
		int numID = a[i].getIdSapato();
		return numID;
	}
}