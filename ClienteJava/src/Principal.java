import java.awt.EventQueue;
import java.awt.Rectangle;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import JPanels.Login;


public class Principal {
	
	private JFrame frmCliente;
	private PrintWriter escritor;
	private JPanel current;
	private ArrayList<JPanel> stack;
	
	public Principal(PrintWriter escritor){
		this.escritor = escritor;
		stack = new ArrayList<>();
		initialize();
		frmCliente.setVisible(true);		
	}
	
	public void initialize(){
		frmCliente = new JFrame();
		frmCliente.setTitle("Cliente");
		frmCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setConteudo(new Login(escritor));
	}
	
	public void setConteudo(JPanel panel){
		current = panel;
		stack.add(panel);
		frmCliente.getContentPane().add(current);
		frmCliente.setBounds(panel.getBounds());
	}
}
