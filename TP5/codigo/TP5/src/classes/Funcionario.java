package classes;

/**
 * Class de Funcionario
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public class Funcionario  extends Pessoa  {
	private String funcao, CNPJ;
	private int salario, horarioTrabalho, idFuncionario;
	private Venda[] venda = new Venda[1];
	
	/**
	 * Registro/edição de Funcionario
	 * @param a nome String
	 * @param b endereço String
	 * @param c telefone int
	 * @param d cpf String
	 * @param e rg String
	 * @param id idFuncionario int ID do Funcionario
	 * @param f funcao String
	 * @param g CNPJ String
	 * @param h salario int
	 * @param i horarioTrabalho int
	 */
	public Funcionario (String a, String b, int c, String d, String e, int id, String f, String g, int h, int i){

		nome = a;
		endereço = b;
		telefone = c;
		cpf = d;
		rg = e;
		idFuncionario = id;
		funcao = f;
		CNPJ = g;
		salario = h;
		horarioTrabalho = i;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getHorarioTrabalho() {
		return horarioTrabalho;
	}

	public void setHorarioTrabalho(int horarioTrabalho) {
		this.horarioTrabalho = horarioTrabalho;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public Venda[] getVenda() {
		return venda;
	}

	public void setVenda(Venda[] venda) {
		this.venda = venda;
	}
	
	
	
	
}
