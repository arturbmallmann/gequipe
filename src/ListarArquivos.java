import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class ListarArquivos extends JPanel
{
	public ListarArquivos() {

		setLayout(null);
		
		JList list = new JList();
		
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 45, 186, 166);
		add(scrollPane);
		
		JLabel lblListaDeArquivos = new JLabel("Lista de Arquivos:");
		lblListaDeArquivos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblListaDeArquivos.setBounds(10, 11, 121, 23);
		add(lblListaDeArquivos);
		
		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.setBounds(10, 222, 89, 23);
		add(btnAbrir);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(109, 222, 89, 23);
		add(btnVoltar);
	}
}
