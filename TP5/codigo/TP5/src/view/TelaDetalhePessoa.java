package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

/**
 * Menu de cadastro ou edição/visualização/exclusão de clientes e funcionários
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public class TelaDetalhePessoa implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelIDFun = new JLabel("ID Funcionario(Max:10 num): ");
	private JTextField valorIDFun;
	private JLabel labelIDCliente = new JLabel("ID Cliente(Max:10 num): ");
	private JTextField valorIDCliente;
	private JLabel labelCPF = new JLabel("CPF (###.###.###-##): ");
	private JTextField valorCPF;
	private JLabel labelRG = new JLabel("RG (#.###.###): ");
	private JTextField valorRG;
	private JLabel labelTelefone = new JLabel("Telefone: (61)");
	private JTextField valorTelefone;
	private JLabel labelEnd = new JLabel("Endereco: ");
	private JTextField valorEnd;
	private JLabel labelFuncao = new JLabel("Função: ");
	private JTextField valorFuncao;
	private JLabel labelSal = new JLabel("Salario: ");
	private JTextField valorSal;
	private JLabel labelCNPJ = new JLabel("CNPJ (##.###.###/####-##): ");
	private JTextField valorCNPJ;
	private JLabel labelHT = new JLabel("Horario de Trabalho: ");
	private JTextField valorHT;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[50];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	/**
	 * Menu para cadastro ou edição/visualização/exclusão de clientes e funcionários
	 * @param op a opção de ação escolhida
	 * (1)Cadastro de cliente
	 * (2)Cadastro de Funcionario
	 * (3)Edição/exclusão de cliente
	 * (4)Edição/exclusão de Funcionario
	 * @param d o ControleDados para busca dos valores originais dos dados
	 * @param pos a posição na array que o dado está
	 */
	public void inserirEditar(int op, ControleDados d, TelaPessoa p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de cliente";
		if (op == 2) s = "Cadastro de Funcionario";
		if (op == 3) s = "Detalhe de Cliente";
		if (op == 4) s = "Detalhe de Funcionario";

		janela = new JFrame(s);

		//Preenche dados com dados do clientes clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getCliente()[pos].getNome(), 200);
			valorEnd = new JTextField(dados.getCliente()[pos].getEndereco(),200);
			valorCPF = new JTextField(dados.getCliente()[pos].getCPF(), 200);
			valorRG = new JTextField(dados.getCliente()[pos].getRG(), 200);
			
			valorIDCliente = new JTextField(String.valueOf(dados.getCliente()[pos].getIdCliente()), 200);
			valorTelefone = new JTextField(String.valueOf(dados.getCliente()[pos].getTelefone()), 12);
			
			labelIDCliente.setBounds(30, 50, 180, 25);
			valorIDCliente.setBounds(180, 50, 180, 25);
		//Preenche dados com dados do funcionario clicado 
		} else if (op == 4) { 
			valorNome = new JTextField(dados.getFuncionario()[pos].getNome(), 200);
			valorEnd = new JTextField(dados.getFuncionario()[pos].getEndereco(),200);
			valorCPF = new JTextField(dados.getFuncionario()[pos].getCPF(), 200);
			valorRG = new JTextField(dados.getFuncionario()[pos].getRG(), 200);
			valorTelefone = new JTextField(String.valueOf(dados.getFuncionario()[pos].getTelefone()), 12);
			
			valorIDFun = new JTextField(String.valueOf(dados.getFuncionario()[pos].getIdFuncionario()), 200);
			valorFuncao = new JTextField(String.valueOf(dados.getFuncionario()[pos].getFuncao()), 200);
			valorSal = new JTextField(String.valueOf(dados.getFuncionario()[pos].getSalario()), 200);
			valorCNPJ = new JTextField(String.valueOf(dados.getFuncionario()[pos].getCNPJ()), 200);
			valorHT = new JTextField(String.valueOf(dados.getFuncionario()[pos].getHorarioTrabalho()), 200);
			
			labelIDFun.setBounds(5, 50, 170, 25);
			valorIDFun.setBounds(180, 50, 180, 25);	
			labelFuncao.setBounds(30, 200, 180, 25);
			valorFuncao.setBounds(180, 200, 180, 25);		
			labelSal.setBounds(30, 230, 150, 25);
			valorSal.setBounds(180, 230, 180, 25);
			labelCNPJ.setBounds(10, 260, 180, 25);
			valorCNPJ.setBounds(180, 260, 180, 25);
			labelHT.setBounds(30, 290, 150, 25);
			valorHT.setBounds(180, 290, 180, 25);

		} else {

			valorNome = new JTextField(200);
			valorEnd = new JTextField(200);
			valorIDFun = new JTextField(200);
			valorCPF = new JTextField(200);
			valorRG = new JTextField(200);
			valorIDCliente = new JTextField(200);
			valorTelefone = new JTextField(12);
			valorFuncao = new JTextField(200);
			valorSal = new JTextField(200);
			valorCNPJ = new JTextField(200);
			valorHT = new JTextField(200);
			
			labelIDFun.setBounds(10, 50, 180, 25);
			valorIDFun.setBounds(180, 50, 180, 25);
			labelIDCliente.setBounds(10, 50, 150, 25);
			valorIDCliente.setBounds(180, 50, 180, 25);
			labelFuncao.setBounds(30, 200, 180, 25);
			valorFuncao.setBounds(180, 200, 180, 25);		
			labelSal.setBounds(30, 230, 150, 25);
			valorSal.setBounds(180, 230, 180, 25);
			labelCNPJ.setBounds(10, 260, 180, 25);
			valorCNPJ.setBounds(180, 260, 180, 25);
			labelHT.setBounds(30, 290, 150, 25);
			valorHT.setBounds(180, 290, 180, 25);

			botaoSalvar.setBounds(245, 350, 115, 30);
		}
		
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		
		labelCPF.setBounds(30, 80, 150, 25);
		valorCPF.setBounds(180, 80, 180, 25);
		labelRG.setBounds(30, 110, 150, 25);
		valorRG.setBounds(180, 110, 150, 25);
		labelEnd.setBounds(30, 140, 150, 25);
		valorEnd.setBounds(180, 140, 180, 25);
		labelTelefone.setBounds(30, 170, 150, 25);
		valorTelefone.setBounds(180, 170, 150, 25);
		
		
		//Coloca os campos relacionados a ID do cliente
		if (op == 1 || op == 3 ) {
			this.janela.add(labelIDCliente);
			this.janela.add(valorIDCliente);

		}

		//Coloca campos relacionados a funcionario
		if (op == 2 || op == 4) {

			this.janela.add(labelIDFun);
			this.janela.add(valorIDFun);
			this.janela.add(labelFuncao);
			this.janela.add(valorFuncao);
			this.janela.add(labelSal);
			this.janela.add(valorSal);
			this.janela.add(labelCNPJ);
			this.janela.add(valorCNPJ);
			this.janela.add(labelHT);
			this.janela.add(valorHT);
		}

		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 315, 115, 30);
			botaoExcluir.setBounds(245, 315, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelEnd);
		this.janela.add(valorEnd);
		this.janela.add(labelTelefone);
		this.janela.add(valorTelefone);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelRG);
		this.janela.add(valorRG);

		this.janela.add(botaoSalvar);
		
		

		this.janela.setLayout(null);

		this.janela.setSize(450, 450);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	/**
	 * Menu para cadastro/edição ou exclusão de clientes e funcionários
	 * Para cadastro/edição leva todos os dados para inserirEditar em ControleDados
	 * Para exclusão passa a posição na array que o dado está para remover em ControleDados
	 * @param e a opção de ação escolhida
	 * (botaoSalvar)Cadastro/edição de cliente e funcionario
	 * (botaoExcluir)Exclusão de cliente e funcionario
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			
				
				if(opcao == 1) {
					novoDado[0] = Integer.toString(dados.getNumCliente());
					
				}else if (opcao == 2) { 
					novoDado[0] = Integer.toString(dados.getNumFun());
					
				}else { 
					novoDado[0] = Integer.toString(posicao);
				}
				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorEnd.getText();
				novoDado[3] =  valorTelefone.getText();
				novoDado[4] =  valorCPF.getText();
				novoDado[5] =  valorRG.getText();

				if (opcao == 1 || opcao == 3) {
					novoDado[6] =  valorIDCliente.getText();
					
					dados.inserirEditarCliente(novoDado);
					janela.dispose();
				} else {
					novoDado[6] =  valorIDFun.getText();
					novoDado[7] =  valorFuncao.getText();
					novoDado[8] =  valorCNPJ.getText();
					novoDado[9] =  valorSal.getText();
					novoDado[10] =  valorHT.getText();
					dados.inserirEditarFun(novoDado);
				}
					janela.dispose();
			}
		

		if(src == botaoExcluir) {
			if (opcao == 3) {
				dados.removerCliente(posicao);
				janela.dispose();
			}
			
			if (opcao == 4){
				dados.removerFuncionario(posicao);
				janela.dispose();
			}
			
		}
	}
}