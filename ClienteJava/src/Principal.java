import java.awt.EventQueue;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Principal {
	
	private JFrame frmCliente;
	private JPanel current;
	private PrintWriter escritor;
	
	public Principal(PrintWriter escritor){
		this.escritor = escritor;
		initialize();
		frmCliente.setVisible(true);		
	}
	
	public void initialize(){
		frmCliente = new JFrame();
		frmCliente.setTitle("Cliente");
		frmCliente.setBounds(100, 100, 349, 388);
		frmCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel login = new Login(escritor);
		current = login;
		
		frmCliente.getContentPane().add(login);
	}

}
