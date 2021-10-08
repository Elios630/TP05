package view;

	
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

	/**
	 * Determina se sera para cadastrar ou editar/remover/visualizar vendas
	 * @author Pedro Henrique Elias
	 * @version 1.0 (Out 2021)
	 */
	public class TelaVenda implements ActionListener{		
		private JFrame janela;
		private JLabel titulo;
		private JButton cadastroVenda;
		private JButton editarRemoverVenda;
		private JButton listaIdVenda;
		private JList<String> listaID;
		private static ControleDados dados;
		private String[] IDS = new String[50];
		
		
		private int pos;
		
		/**
		 * Menu para determina se sera para cadastrar ou editar/remover/visualizar vendas
		 * @param d o ControleDados que será repasado para TelaDetalhePessoa e usado para lista
		 */
		public void menuVenda(ControleDados d){
			dados = d;
			
				janela = new JFrame("Vendas");
				titulo = new JLabel("Vendas");
				cadastroVenda = new JButton("Cadastrar");
				editarRemoverVenda = new JButton("Editar/Remover/visualizar");
				listaIdVenda = new JButton("Lista ID de vendas");

				titulo.setFont(new Font("Arial", Font.BOLD, 20));
				titulo.setBounds(90, 10, 250, 30);

				cadastroVenda.setBounds(30, 50, 100, 30);
				editarRemoverVenda.setBounds(131, 50, 200, 30);
				listaIdVenda.setBounds(100, 80, 200, 30);

				janela.setLayout(null);

				janela.add(titulo);
				janela.add(cadastroVenda);
				janela.add(editarRemoverVenda);
				janela.add(listaIdVenda);

				janela.setSize(400, 150);
				janela.setVisible(true);

				cadastroVenda.addActionListener(this);
				editarRemoverVenda.addActionListener(this);
				listaIdVenda.addActionListener(this);
				
			
			

		}



		/**
		 * Menu para determina se sera para cadastrar, editar/remover/visualizar ou ver lista de vendas
		 * @param e a escola de ação
		 * (cadastroVenda) Cadastra venda
		 * (editarRemoverVenda) Editar/Removervisualizar venda
		 * (listaIdVenda) Mostra lista de venda
		 */
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			
			if(src == cadastroVenda)
				new TelaDetalheVenda().inserirEditar(1, dados, 0);
			
			if(src == editarRemoverVenda) {
				
				janela = new JFrame("Lista de ID");
				IDS = new ControleVenda(dados).listaVenda();
				listaID = new JList<String> (IDS);
				listaID.setLayout(null);
				janela.setLayout(null);

				janela.add(listaID);

				listaID.setSize(400, 150);
				janela.setSize(400, 150);
				janela.setVisible(true);
				listaID.setVisible(true);
				
				String id =
						JOptionPane.showInputDialog("Incira o ID da venda");
				
				int ID = Integer.parseInt(id);
				pos = dados.pesquisaIdVenda(ID);
				new TelaDetalheVenda().inserirEditar(2, dados, pos);
				pos = dados.getNumVenda();
				
				janela.dispose();
			}
			
			if(src == listaIdVenda) {
				
				
				janela = new JFrame("Lista de ID");
				IDS = new ControleVenda(dados).listaVenda();
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
