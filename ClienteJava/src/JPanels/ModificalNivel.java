package JPanels;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ModificalNivel extends JPanel{
	public ModificalNivel() {


		setLayout(null);
		
		JLabel lblModificarNivel = new JLabel("Modificar Nivel:");
		lblModificarNivel.setFont(new Font("Tahoma", Font.PLAIN, 14));  //modificar nivel
		lblModificarNivel.setBounds(10, 11, 105, 14);
		add(lblModificarNivel);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(10, 51, 46, 14);
		add(lblLogin);
		
		JLabel lblNivel = new JLabel("Nivel:");
		lblNivel.setBounds(10, 76, 46, 14);
		add(lblNivel);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(59, 48, 128, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("0 - ADM");
		comboBox.addItem("1 - Normal");
		comboBox.setBounds(59, 73, 128, 20);
		add(comboBox);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(10, 118, 89, 23);
		add(btnConfirmar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(120, 118, 89, 23);
	}		
}
