package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Determina se sera para cadastrar ou editar/remover/visualizar sapatos e meias
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public class TelaObjetos implements ActionListener{		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroSapato;
	private JButton editarRemoverSapato;
	private JButton editarRemoverMeia;
	private JButton cadastroMeia;
	private JButton listaIdSapato;
	private JButton listaIdMeia;
	private JList<String> listaID;
	private static ControleDados dados;
	private String[] IDS = new String[50];
	
	
	private int pos;
	
	/**
	 * Menu para determina se sera para cadastrar ou editar/remover/visualizar sapatos e meias
	 * @param d o ControleDados que será repasado para TelaDetalhePessoa
	 * @param op int da opção do menu principal
	 * (1)Sapatos
	 * (2)Meias
	 */
	public void menuObjetos(ControleDados d, int op){
		dados = d;

		switch (op) {
		case 1:
			janela = new JFrame("Sapatos");
			titulo = new JLabel("Sapatos");
			cadastroSapato = new JButton("Cadastrar");
			editarRemoverSapato = new JButton("Editar/Remover/visualizar");
			listaIdSapato = new JButton("Lista ID de sapatos");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);

			cadastroSapato.setBounds(30, 50, 100, 30);
			editarRemoverSapato.setBounds(131, 50, 200, 30);
			listaIdSapato.setBounds(100, 80, 200, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(cadastroSapato);
			janela.add(editarRemoverSapato);
			janela.add(listaIdSapato);

			janela.setSize(400, 150);
			janela.setVisible(true);

			cadastroSapato.addActionListener(this);
			editarRemoverSapato.addActionListener(this);
			listaIdSapato.addActionListener(this);

			break;
			
		case 2:
			janela = new JFrame("Meia");
			titulo = new JLabel("Meias");
			cadastroMeia = new JButton("Cadastrar");
			editarRemoverMeia = new JButton("Editar/Remover/visualizar");
			listaIdMeia = new JButton("Lista ID de sapatos");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);


			cadastroMeia.setBounds(30, 50, 100, 30);
			editarRemoverMeia.setBounds(131, 50, 200, 30);
			listaIdMeia.setBounds(100, 80, 200, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(cadastroMeia);
			janela.add(editarRemoverMeia);
			janela.add(listaIdMeia);

			janela.setSize(400, 150);
			janela.setVisible(true);
			
			cadastroMeia.addActionListener(this);
			editarRemoverMeia.addActionListener(this);
			listaIdMeia.addActionListener(this);
			break;
		}

	}



	/**
	 * Menu para determina se sera para cadastrar ou editar/remover/visualizar sapato e meia
	 * @param e a escola de ação
	 * (cadastroSapato) Cadastra sapato
	 * (editarRemoverSapato) Editar/Remover sapato
	 * (listaIdSapato) Mostra lista de sapato
	 * (cadastroMeia) Cadastra meia
	 * (editarRemoverMeia) Editar/Remover meia
	 * (listaIdMeia) Mostra lista de meia
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cadastroSapato)
			new TelaDetalheObjetos().inserirEditar(1, dados, 0);
		
		if(src == editarRemoverSapato) {
			
			janela = new JFrame("Lista de ID");
			IDS = new ControleSapato(dados).listaSapato();
			listaID = new JList<String> (IDS);
			listaID.setLayout(null);
			janela.setLayout(null);

			janela.add(listaID);

			listaID.setSize(400, 150);
			janela.setSize(400, 150);
			janela.setVisible(true);
			listaID.setVisible(true);
			
			String id =
					JOptionPane.showInputDialog("Incira o ID do Sapato");
			
			int ID = Integer.parseInt(id);
			pos = dados.pesquisaIdSapato(ID);
			new TelaDetalheObjetos().inserirEditar(3, dados, pos);
			pos = dados.getNumCliente();
			
			janela.dispose();
		}
		
		if(src == listaIdSapato) {
			
			
			janela = new JFrame("Lista de ID");
			IDS = new ControleSapato(dados).listaSapato();
			listaID = new JList<String> (IDS);
			listaID.setLayout(null);
			janela.setLayout(null);

			janela.add(listaID);

			listaID.setSize(400, 150);
			janela.setSize(400, 150);
			janela.setVisible(true);
			listaID.setVisible(true);
			
			
		}

		if(src == cadastroMeia)
			new TelaDetalheObjetos().inserirEditar(2, dados, 0);
		
		if(src == editarRemoverMeia) {
			janela = new JFrame("Lista de ID");
			IDS = new ControleMeia(dados).listaMeia();
			listaID = new JList<String> (IDS);
			listaID.setLayout(null);
			janela.setLayout(null);

			janela.add(listaID);

			listaID.setSize(400, 150);
			janela.setSize(400, 150);
			janela.setVisible(true);
			listaID.setVisible(true);
			
			String id =
					JOptionPane.showInputDialog("Incira o ID de uma meia");
			
			int ID = Integer.parseInt(id);
			pos = dados.pesquisaIdMeia(ID);
			new TelaDetalheObjetos().inserirEditar(4, dados, pos);
			
			janela.dispose();
		}
		
		if(src == listaIdMeia) {
			
			
			janela = new JFrame("Lista de ID");
			IDS = new ControleMeia(dados).listaMeia();
			listaID = new JList<String> (IDS);
			listaID.setLayout(null);
			janela.setLayout(null);

			janela.add(listaID);

			listaID.setSize(400, 150);
			janela.setSize(400, 150);
			janela.setVisible(true);
			listaID.setVisible(true);
			
			
		}
	}
}