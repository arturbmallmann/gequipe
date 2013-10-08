import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MenuIntermediario extends JPanel{
	public MenuIntermediario() {
	
		setLayout(null);
		
		JButton btnListarArquivos = new JButton("Listar Arquivos");
		btnListarArquivos.setBounds(10, 52, 145, 23);
		add(btnListarArquivos);
		
		JButton btnListarProjetos = new JButton("Listar Projetos");
		btnListarProjetos.setBounds(10, 86, 145, 23);
		add(btnListarProjetos);
		
		JButton btnModificarNivel = new JButton("Modificar Nivel");
		btnModificarNivel.setBounds(197, 148, 145, 23);
		add(btnModificarNivel);
		
		JButton btnRemoverMembro = new JButton("Remover Membro");
		btnRemoverMembro.setBounds(10, 154, 145, 23);
		add(btnRemoverMembro);
		
		JButton btnRemoverProjeto = new JButton("Remover Projeto");
		btnRemoverProjeto.setBounds(10, 188, 145, 23);
		add(btnRemoverProjeto);
		
		JButton btnAdicionarMembro = new JButton("Adicionar Membro");
		btnAdicionarMembro.setBounds(197, 52, 145, 23);
		add(btnAdicionarMembro);
		
		JButton btnAdicionarProjeto = new JButton("Adicionar Projeto");
		btnAdicionarProjeto.setBounds(197, 86, 145, 23);
		add(btnAdicionarProjeto);
		
		JButton btnAbrirProjeto = new JButton("Abrir Projeto");
		btnAbrirProjeto.setBounds(197, 120, 145, 23);
		add(btnAbrirProjeto);
		
		JLabel lblMenu = new JLabel("Menu:");
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMenu.setBounds(142, 11, 46, 14);
		// TODO Auto-generated constructor stub
	}
}
