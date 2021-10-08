package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Determina se sera para cadastrar ou editar/remover/visualizar cliente e funcionario
 * @author Pedro Henrique Elias
 * @version 1.0 (Out 2021)
 */
public class TelaPessoa implements ActionListener{		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroClientes;
	private JButton editarRemoverClientes;
	private JButton editarRemoverFuncionario;
	private JButton cadastroFun;
	private JButton listaIdCliente;
	private JButton listaIdFun;
	private JList<String> listaID;
	private static ControleDados dados;
	private String[] IDS = new String[50];
	
	private int pos;
	
	/**
	 * Menu para determina se sera para cadastrar ou editar/remover/visualizar cliente e funcionario ou para listar IDs
	 * @param d o ControleDados para listar IDs de cliente e funcionario
	 * @param op int da opção do menu principal
	 * (1)Clientes
	 * (2)Funcionarios
	 */
	public void menuPessoa(ControleDados d, int op){
		dados = d;

		switch (op) {
		case 1:
			
			janela = new JFrame("Clientes");
			titulo = new JLabel("Clientes");
			cadastroClientes = new JButton("Cadastrar");
			editarRemoverClientes = new JButton("Editar/Remover/Visualizar");
			listaIdCliente = new JButton("Lista ID de clientes");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(150, 10, 250, 30);

			cadastroClientes.setBounds(30, 50, 100, 30);
			editarRemoverClientes.setBounds(131, 50, 200, 30);
			listaIdCliente.setBounds(100, 80, 200, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(cadastroClientes);
			janela.add(editarRemoverClientes);
			janela.add(listaIdCliente);

			janela.setSize(400, 150);
			janela.setVisible(true);

			cadastroClientes.addActionListener(this);
			editarRemoverClientes.addActionListener(this);
			listaIdCliente.addActionListener(this);

			break;
			
		case 2:
			
			janela = new JFrame("Funcionario");
			titulo = new JLabel("Funcionarios");
			cadastroFun = new JButton("Cadastrar");
			editarRemoverFuncionario = new JButton("Editar/Remover/visualizar");
			listaIdFun = new JButton("Lista ID de funcionarios");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(100, 10, 250, 30);


			cadastroFun.setBounds(30, 50, 100, 30);
			editarRemoverFuncionario.setBounds(131, 50, 200, 30);
			listaIdFun.setBounds(100, 80, 200, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(cadastroFun);
			janela.add(editarRemoverFuncionario);
			janela.add(listaIdFun);

			janela.setSize(400, 150);
			janela.setVisible(true);
			
			cadastroFun.addActionListener(this);
			editarRemoverFuncionario.addActionListener(this);
			listaIdFun.addActionListener(this);
			break;
		}

	}



	/**
	 * Menu para determina se sera para cadastrar ou editar/remover/visualizar cliente e funcionario
	 * @param e a escola de ação
	 * (cadastroClientes) Cadastra Cliente
	 * (editarRemoverClientes) Editar/Remover Cliente
	 * (listaIdCliente) Mostra lista de Clientes
	 * (cadastroFun) Cadastra funcionarios
	 * (editarRemoverFuncionario) Editar/Remover Funcionarios
	 * (listaIdFun) Mostra lista de Funcionarios
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cadastroClientes)
			new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);
		
		if(src == editarRemoverClientes) {
			IDS = new ControleCliente(dados).listaClienteIDS();
			janela = new JFrame("Lista de ID");
			IDS = new ControleCliente(dados).listaClienteIDS();
			listaID = new JList<String> (IDS);
			listaID.setLayout(null);
			janela.setLayout(null);

			janela.add(listaID);

			listaID.setSize(400, 150);
			janela.setSize(400, 150);
			janela.setVisible(true);
			listaID.setVisible(true);
			
			String id =
					JOptionPane.showInputDialog("Incira o ID de um cliente");
			
			int ID = Integer.parseInt(id);
			pos = dados.pesquisaIdCliente(ID);
			new TelaDetalhePessoa().inserirEditar(3, dados, this, pos);
			janela.dispose();
		}
		
		if(src == listaIdCliente) {
			
			
			janela = new JFrame("Lista de ID");
			IDS = new ControleCliente(dados).listaClienteIDS();
			listaID = new JList<String> (IDS);
			listaID.setLayout(null);
			janela.setLayout(null);

			janela.add(listaID);

			listaID.setSize(400, 150);
			janela.setSize(400, 150);
			janela.setVisible(true);
			listaID.setVisible(true);
			
			
		}

		if(src == cadastroFun)
			new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);
		
		if(src == editarRemoverFuncionario) {
			IDS = new ControleFuncionario(dados).listaFuncionarioIDS();
			janela = new JFrame("Lista de ID");
			listaID = new JList<String> (IDS);
			listaID.setLayout(null);
			janela.setLayout(null);

			janela.add(listaID);

			listaID.setSize(400, 150);
			janela.setSize(400, 150);
			janela.setVisible(true);
			listaID.setVisible(true);
			
			String id =
					JOptionPane.showInputDialog("Incira o ID de um funcionário");
			
			int ID = Integer.parseInt(id);
			pos = dados.pesquisaIdFun(ID);
			new TelaDetalhePessoa().inserirEditar(4, dados, this, pos);
			janela.dispose();
		}
		
		if(src == listaIdFun) {
			janela = new JFrame("Lista de ID");
			IDS = new ControleFuncionario(dados).listaFuncionarioIDS();
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