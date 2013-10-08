package JPanels;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.json.JSONObject;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.PrintWriter;
import javax.swing.JPasswordField;


public class Login extends JPanel  implements ActionListener {

	private JTextField textField;
	private PrintWriter escritor;
	private JPasswordField passwordField;

	public Login(PrintWriter escritor) {
		this.escritor = escritor;
		
		setLayout(null);
		setBounds(0, 0, 220, 220);
		
		textField = new JTextField();
		textField.setBounds(60, 67, 122, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(10, 70, 46, 14);
		add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 101, 46, 14);
		add(lblSenha);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(this);
		btnLogar.setBounds(10, 151, 81, 23);
		add(btnLogar);
		
		JButton btnCancelar = new JButton("Sair");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(103, 151, 89, 23);
		add(btnCancelar);
		
		JLabel lblLogar = new JLabel("Logar");
		lblLogar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogar.setBounds(10, 21, 46, 20);
		add(lblLogar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(60, 98, 122, 20);
		add(passwordField);
	}
	
	public void actionPerformed(ActionEvent arg0) {		
		if(arg0.getActionCommand().equals("Logar")){
			JSONObject packet = new JSONObject();
			packet.put("login", textField.getText());
			packet.put("senha", new String(passwordField.getPassword()));
			
			escritor.println(packet.toString());
			escritor.flush();
		}else{
			System.exit(0);
		}
	}
}
