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
 * Menu de cadastro ou edição/visualização/exclusão de sapatos e meias
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public class TelaDetalheObjetos implements ActionListener {

	private JFrame janela;
	private JLabel labelIDMeia = new JLabel("ID da meia: ");
	private JTextField valorIDMeia;
	private JLabel labelIDSapato = new JLabel("ID do sapato: ");
	private JTextField valorIDSapato;
	private JLabel labelTamanho = new JLabel("Tamanho: ");
	private JTextField valorTamanho;
	private JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
	private JLabel labelTipo = new JLabel("Tipo: ");
	private JTextField valorTipo;
	private JLabel labelPreco = new JLabel("Preço: ");
	private JTextField valorPreco;
	private JLabel labelCor = new JLabel("Cor: ");
	private JTextField valorCor;
	
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[50];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	/**
	 * Menu para cadastro ou edição/visualização/exclusão de sapato e meia
	 * @param op a opção de ação escolhida
	 * (1)Cadastro de sapato
	 * (2)Cadastro de meia
	 * (3)Edição/exclusão de sapato
	 * (4)Edição/exclusão de meia
	 * @param d o ControleDados para busca dos valores originais dos dados
	 * @param pos a posição na array que o dado está
	 */
	public void inserirEditar(int op, ControleDados d, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Sapato";
		if (op == 2) s = "Cadastro de Meia";
		if (op == 3) s = "Detalhe de Sapato";
		if (op == 4) s = "Detalhe de Meia";

		janela = new JFrame(s);

		//Preenche dados com dados do sapato clicado
		if (op == 3) {
			
			valorTamanho = new JTextField(String.valueOf(dados.getSapato()[pos].getTamanho()), 200);
			valorMarca = new JTextField(dados.getSapato()[pos].getMarca(), 200);
			valorTipo = new JTextField(dados.getSapato()[pos].getTipo(),200);
			valorPreco = new JTextField(String.valueOf(dados.getSapato()[pos].getPreco()), 200);
			valorCor = new JTextField(dados.getSapato()[pos].getCor(),200);
			
			valorIDSapato = new JTextField(String.valueOf(dados.getSapato()[pos].getIdSapato()), 200);
			
			labelIDSapato.setBounds(30, 50, 150, 25);
			valorIDSapato.setBounds(180, 50, 180, 25);
		//Preenche dados com dados da meia clicado 
		} else if (op == 4) { 
			valorTamanho = new JTextField(String.valueOf(dados.getMeia()[pos].getTamanho()), 200);
			valorMarca = new JTextField(dados.getMeia()[pos].getMarca(), 200);
			valorTipo = new JTextField(dados.getMeia()[pos].getTipo(),200);
			valorPreco = new JTextField(String.valueOf(dados.getMeia()[pos].getPreco()), 200);
			valorCor = new JTextField(dados.getMeia()[pos].getCor(),200);
			
			valorIDMeia = new JTextField(String.valueOf(dados.getMeia()[pos].getIdMeia()), 200);
			
			labelIDMeia.setBounds(30, 50, 150, 25);
			valorIDMeia.setBounds(180, 50, 180, 25);	
			

		} else {

			valorTamanho = new JTextField(200);
			valorMarca = new JTextField(200);
			valorTipo = new JTextField(200);
			valorPreco = new JTextField(200);
			valorCor = new JTextField(200);
			valorIDMeia = new JTextField(200);
			valorIDSapato = new JTextField(200);
			
			labelIDSapato.setBounds(30, 50, 180, 25);
			valorIDSapato.setBounds(180, 50, 180, 25);
			labelIDMeia.setBounds(30, 50, 150, 25);
			valorIDMeia.setBounds(180, 50, 180, 25);
			

			botaoSalvar.setBounds(245, 230, 115, 30);
		}
		
		labelTamanho.setBounds(30, 80, 150, 25);
		valorTamanho.setBounds(180, 80, 150, 25);
		labelMarca.setBounds(30, 110, 150, 25);
		valorMarca.setBounds(180, 110, 180, 25);
		labelTipo.setBounds(30, 140, 150, 25);
		valorTipo.setBounds(180, 140, 180, 25);
		labelPreco.setBounds(30, 170, 150, 25);
		valorPreco.setBounds(180, 170, 180, 25);
		labelCor.setBounds(30, 200, 150, 25);
		valorCor.setBounds(180, 200, 180, 25);
		
		
		//Coloca os campos relacionados a ID do sapato
		if (op == 1 || op == 3 ) {
			this.janela.add(labelIDSapato);
			this.janela.add(valorIDSapato);

		}

		//Coloca campos relacionados a ID da meia
		if (op == 2 || op == 4) {

			this.janela.add(labelIDMeia);
			this.janela.add(valorIDMeia);
		}

		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 230, 115, 30);
			botaoExcluir.setBounds(245, 230, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelTamanho);
		this.janela.add(valorTamanho);
		this.janela.add(labelMarca);
		this.janela.add(valorMarca);
		this.janela.add(labelTipo);
		this.janela.add(valorTipo);
		this.janela.add(labelPreco);
		this.janela.add(valorPreco);
		this.janela.add(labelCor);
		this.janela.add(valorCor);

		this.janela.add(botaoSalvar);
		
		

		this.janela.setLayout(null);

		this.janela.setSize(400, 450);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	/**
	 * Menu para cadastro/edição ou exclusão de sapatos e meias
	 * Para cadastro/edição leva todos os dados para inserirEditar em ControleDados
	 * Para exclusão passa a posição na array que o dado está para remover em ControleDados
	 * @param e a opção de ação escolhida
	 * (botaoSalvar)Cadastro/edição de sapatos e meias
	 * (botaoExcluir)Exclusão de sapatos e meias
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
				if(opcao == 1) {
					novoDado[0] = Integer.toString(dados.getNumSapato());
					
				}else if (opcao == 2) { 
					novoDado[0] = Integer.toString(dados.getNumMeia());
					
				}else { 
					novoDado[0] = Integer.toString(posicao);
				}
				novoDado[1] =  valorTamanho.getText();
				novoDado[2] =  valorMarca.getText();
				novoDado[3] =  valorTipo.getText();
				novoDado[4] =  valorPreco.getText();
				novoDado[5] =  valorCor.getText();

				if (opcao == 1 || opcao == 3) {
					novoDado[6] =  valorIDSapato.getText();
					
					dados.inserirEditarSapato(novoDado);
					janela.dispose();
				} else {
					novoDado[6] =  valorIDMeia.getText();
					dados.inserirEditarMeia(novoDado);
				}
					janela.dispose();
			}
		

		if(src == botaoExcluir) {
			if (opcao == 3) {
				dados.removerSapato(posicao);
				janela.dispose();
			}
			
			if (opcao == 4){
				dados.removerMeia(posicao);
				janela.dispose();
			}
			
		}
	}
}