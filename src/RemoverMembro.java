import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RemoverMembro extends JPanel
{
	public RemoverMembro() {
		setLayout(null);
		
		JLabel lblRemoverMembros = new JLabel("Remover Membros:");
		lblRemoverMembros.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRemoverMembros.setBounds(10, 11, 132, 14);
		add(lblRemoverMembros);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(10, 51, 46, 14);
		add(lblLogin);
		
		JTextField textField_3 = new JTextField();
		textField_3.setBounds(47, 48, 138, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(10, 111, 89, 23);
		add(btnRemover);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(120, 111, 89, 23);
		add(btnVoltar);
	}
}
