package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

/**
 * O menu principal para determinar qual objeto será escolhido
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */

public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle da loja");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton cliente = new JButton("Cliente");
	private static JButton funcionario = new JButton("Funcionario");
	private static JButton sapato = new JButton("Sapato");
	private static JButton meia = new JButton("Meia");
	private static JButton venda = new JButton("Venda");
	private static JButton loja = new JButton("Loja");
	public static ControleDados dados = new ControleDados();
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		cliente.setBounds(140, 50, 100, 30);
		funcionario.setBounds(140, 100, 100, 30);
		sapato.setBounds(140, 150, 100, 30);
		meia.setBounds(140, 200, 100, 30);
		venda.setBounds(140, 250, 100, 30);
		loja.setBounds(140, 300, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(cliente);
		janela.add(funcionario);
		janela.add(sapato);
		janela.add(meia);
		janela.add(venda);
		janela.add(loja);
		
		janela.setSize(400, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	 /**
	  * Aciona as ações escolhidas pelo menu principal
	  * @param args não é usado
	  */
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		
		cliente.addActionListener(menu);
		funcionario.addActionListener(menu);
		sapato.addActionListener(menu);
		meia.addActionListener(menu);
		venda.addActionListener(menu);
		loja.addActionListener(menu);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cliente)
			new TelaPessoa().menuPessoa(dados, 1);
		
		if(src == funcionario)
			new TelaPessoa().menuPessoa(dados, 2);
		
		if(src == sapato)
			new TelaObjetos().menuObjetos(dados, 1);
		
		if(src == meia)
			new TelaObjetos().menuObjetos(dados, 2);
		
		if(src == venda) 
			new TelaVenda().menuVenda(dados);
		
		if(src == loja)
			new TelaLoja().Editar(dados);
	}
}