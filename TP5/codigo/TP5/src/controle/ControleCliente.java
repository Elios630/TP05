package controle;
import classes.*;

/**
 * Auxiliar ControleDados nas interações entre view e classes quando se é relacionado a cliente 
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public class ControleCliente {
	private static Cliente[] a;
	private int numCliente;
	
	public ControleCliente(ControleDados d) {
		a = d.getCliente();
		numCliente = d.getNumCliente();
		
	}
	
	public String[] listaClienteIDS() {
		String[] s = new String[numCliente];
		for(int i = 0; i < numCliente; i++) {
			s[i] = String.valueOf(a[i].getIdCliente());
		}
		
		return s;
	}
	
	public int getQtd() {
		return numCliente;
	}

	public void setQtd(int qtd) {
		this.numCliente = qtd;
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
		String numRG = String.valueOf(a[i].getRG());
		return numRG;
	}
	
	public static int getID(int i) {
		int numID = a[i].getIdCliente();
		return numID;
	}
	
	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}
	
}