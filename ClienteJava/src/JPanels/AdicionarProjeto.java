package JPanels;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AdicionarProjeto extends JPanel
{
	public AdicionarProjeto() {
		
		setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(24, 69, 46, 14);
		add(lblNome);
		
		JTextField textField_5 = new JTextField();
		textField_5.setBounds(85, 66, 86, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(24, 117, 89, 23);
		add(btnAdicionar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(119, 117, 89, 23);
		add(btnVoltar);
		
		JLabel lblAdicionarProjeto = new JLabel("Adicionar Projeto");
		lblAdicionarProjeto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdicionarProjeto.setBounds(122, 11, 110, 14);
		add(lblAdicionarProjeto);
	}
}
