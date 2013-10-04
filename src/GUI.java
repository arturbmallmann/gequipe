import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JTextField;
import org.json.JSONObject;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class GUI {

	private JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;
	
	private PrintWriter escritor;
	private Socket socket;
	private Scanner leitor;	

	private class EscutaServidor implements Runnable{

		public void run() {
			try{
				String texto;
				JSONObject obj;
				while((texto = leitor.nextLine()) != null){
					obj = new JSONObject(texto);
					
					if(texto.contains("\"message\":")){
						JOptionPane.showMessageDialog(null, obj.get("message"));						
					}
				}
			}catch(Exception e){}
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUI() {
		initialize();
	}

	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 236, 237);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JSONObject obj = new JSONObject();
				obj.put("login", textField.getText());
				obj.put("senha", new String(passwordField.getPassword()));
				escritor.println(obj.toString());
				escritor.flush();
			}
		});
		btnLogin.setBounds(10, 157, 89, 23);
		frmLogin.getContentPane().add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(122, 157, 89, 23);
		frmLogin.getContentPane().add(btnCancel);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblLogin.setBounds(10, 39, 46, 23);
		frmLogin.getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblSenha.setBounds(10, 89, 46, 23);
		frmLogin.getContentPane().add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(55, 42, 156, 20);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(55, 92, 156, 20);
		frmLogin.getContentPane().add(passwordField);
		
		configurarRede();
	}
	
	private void configurarRede(){
		try{
			socket = new Socket("127.0.0.1", 5000);
			escritor = new PrintWriter(socket.getOutputStream());
			leitor = new Scanner(socket.getInputStream());
			new Thread(new EscutaServidor()).start();
		}catch(Exception e){}
	}
}
