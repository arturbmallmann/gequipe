package JPanels;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AdicionarMembro extends JPanel
{
	public AdicionarMembro() {

		setLayout(null);
		
		JLabel lblAdicionarMembro = new JLabel("Adicionar Membro");
		lblAdicionarMembro.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblAdicionarMembro.setBounds(128, 11, 121, 14);
		add(lblAdicionarMembro);
		
		JLabel lblNome = new JLabel("Login:");
		lblNome.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNome.setBounds(21, 52, 44, 17);
		add(lblNome);
		
		JTextField textField_6 = new JTextField();
		textField_6.setBounds(75, 49, 86, 20);
		Container panel;
		add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(10, 97, 89, 23);
		add(btnAdicionar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(108, 97, 89, 23);
		add(btnVoltar);
	}
}
