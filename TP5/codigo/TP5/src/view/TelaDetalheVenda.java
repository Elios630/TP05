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
	 * Menu de cadastro ou edição/visualização/exclusão de venda
	 * @author Pedro Henrique Elias
	 * @version 1.0 (Out 2021)
	 */
	public class TelaDetalheVenda implements ActionListener {

		private JFrame janela;
		private JLabel labelIDVenda = new JLabel("ID da Venda: ");
		private JTextField valorIDVenda;
		private JLabel labelSapato = new JLabel("Quantidade de sapato: ");
		private JTextField valorSapato;
		private JLabel labelMeia = new JLabel("Quantidade de meias: ");
		private JTextField valorMeia;
		private JLabel labelPreco = new JLabel("Preco total:");
		private JTextField valorPreco;
		private JLabel labelCliente = new JLabel("ID do cliente:");
		private JTextField valorCliente;
		private JLabel labelFun = new JLabel("ID do funcionario: ");
		private JTextField valorFun;
		
		private JButton botaoExcluir = new JButton("Excluir");
		private JButton botaoSalvar = new JButton("Salvar");
		private String[] novoDado = new String[50];
		private static ControleDados dados;
		private int posicao;
		private int posicaoCF;
		private int opcao;
		private String s;

		/**
		 * Menu para cadastro ou edição/visualização/exclusão de venda
		 * @param op a opção de ação escolhida
		 * (1)Cadastro de venda
		 * (2)Edição/exclusão de venda
		 * @param d o ControleDados para busca dos valores originais dos dados
		 * @param pos a posição na array que o dado está
		 */
		public void inserirEditar(int op, ControleDados d, int pos) {

			opcao = op;
			posicao = pos;
			dados = d;

			if (op == 1) s = "Cadastro de Venda";
			if (op == 2) s = "Detalhe de Venda";

			janela = new JFrame(s);

			//Preenche dados com dados do sapato clicado
			if (op == 2) {
				
				valorIDVenda = new JTextField(String.valueOf(dados.getVenda()[pos].getIdVenda()), 200);
				valorSapato = new JTextField(String.valueOf(dados.getVenda()[pos].getQuantidadeSapato()), 200);
				valorMeia = new JTextField(String.valueOf(dados.getVenda()[pos].getQuantidadeMeias()),200);
				valorPreco = new JTextField(String.valueOf(dados.getVenda()[pos].getPrecoTotal()), 200);
				valorCliente = new JTextField(String.valueOf(dados.getVenda()[pos].getCliente().getIdCliente()),200);
				valorFun = new JTextField(String.valueOf(dados.getVenda()[pos].getFuncionario().getIdFuncionario()), 200);
				
				labelIDVenda.setBounds(30, 50, 150, 25);
				valorIDVenda.setBounds(180, 50, 180, 25);
				

			} else {

				valorIDVenda = new JTextField(200);
				valorSapato = new JTextField(200);
				valorMeia = new JTextField(200);
				valorPreco = new JTextField(200);
				valorCliente = new JTextField(200);
				valorFun = new JTextField(200);
				
				labelIDVenda.setBounds(30, 50, 180, 25);
				valorIDVenda.setBounds(180, 50, 180, 25);
				

				botaoSalvar.setBounds(245, 230, 115, 30);
			}
			
			labelSapato.setBounds(30, 80, 150, 25);
			valorSapato.setBounds(180, 80, 150, 25);
			labelMeia.setBounds(30, 110, 150, 25);
			valorMeia.setBounds(180, 110, 180, 25);
			labelPreco.setBounds(30, 140, 150, 25);
			valorPreco.setBounds(180, 140, 180, 25);
			labelCliente.setBounds(30, 170, 150, 25);
			valorCliente.setBounds(180, 170, 180, 25);
			labelFun.setBounds(30, 200, 150, 25);
			valorFun.setBounds(180, 200, 180, 25);
			
			if (op == 2) {
				botaoSalvar.setBounds(120, 230, 115, 30);
				botaoExcluir.setBounds(245, 230, 115, 30);
				this.janela.add(botaoExcluir);
			}

			this.janela.add(labelIDVenda);
			this.janela.add(valorIDVenda);
			this.janela.add(labelSapato);
			this.janela.add(valorSapato);
			this.janela.add(labelMeia);
			this.janela.add(valorMeia);
			this.janela.add(labelPreco);
			this.janela.add(valorPreco);
			this.janela.add(labelCliente);
			this.janela.add(valorCliente);
			this.janela.add(labelFun);
			this.janela.add(valorFun);
			this.janela.add(botaoSalvar);
			this.janela.setLayout(null);
			this.janela.setSize(400, 450);
			this.janela.setVisible(true);
			botaoSalvar.addActionListener(this);
			botaoExcluir.addActionListener(this);
		}

		/**
		 * Menu para cadastro/edição ou exclusão de venda
		 * Para cadastro/edição leva todos os dados para inserirEditar em ControleDados
		 * Para exclusão passa a posição na array que o dado está para remover em ControleDados
		 * @param e a opção de ação escolhida
		 * (botaoSalvar)Cadastro/edição de venda
		 * (botaoExcluir)Exclusão de venda
		 */
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			if(src == botaoSalvar) {
					if(opcao == 1) {
						novoDado[0] = Integer.toString(dados.getNumVenda());
						
					}else { 
						novoDado[0] = Integer.toString(posicao);
					}
					novoDado[1] =  valorIDVenda.getText();
					novoDado[2] =  valorSapato.getText();
					novoDado[3] =  valorMeia.getText();
					novoDado[4] =  valorPreco.getText();
					
					String cli= valorCliente.getText();
					posicaoCF = Integer.parseInt(cli);
					posicaoCF = dados.pesquisaIdCliente(posicaoCF);
					novoDado[5] =  String.valueOf(posicaoCF);
					
					String fun= valorFun.getText();
					posicaoCF = Integer.parseInt(fun);
					posicaoCF = dados.pesquisaIdFun(posicaoCF);
					novoDado[6] =  String.valueOf(posicaoCF);
						
					dados.inserirEditarVenda(novoDado, opcao);
						janela.dispose();
				}

			if(src == botaoExcluir) {
				if (opcao == 3) {
					//dados.removerVenda(posicao);
					janela.dispose();
				}
				
			}
		}
	}
