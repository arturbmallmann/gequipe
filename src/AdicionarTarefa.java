import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class AdicionarTarefa extends JPanel{
	public AdicionarTarefa() {

		setLayout(null);
		
		JLabel lblAdicionarTarefa = new JLabel("Adicionar Tarefa:");
		lblAdicionarTarefa.setFont(new Font("Tahoma", Font.PLAIN, 14));  //adicionar tarefa
		lblAdicionarTarefa.setBounds(10, 11, 116, 14);
		add(lblAdicionarTarefa);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(10, 48, 46, 14);
		add(lblTitulo);
		
		JLabel lblDescricao = new JLabel("Descricao:");
		lblDescricao.setBounds(10, 216, 80, 14);
		add(lblDescricao);
		
		JLabel lblDataDeInicio = new JLabel("Data de Inicio:");
		lblDataDeInicio.setBounds(10, 73, 80, 14);
		add(lblDataDeInicio);
		
		JLabel lblDataDeEntrega = new JLabel("Data de Entrega:");
		lblDataDeEntrega.setBounds(10, 98, 101, 14);
		add(lblDataDeEntrega);
		
		JLabel lblRecurso = new JLabel("Recurso:");
		lblRecurso.setBounds(10, 123, 80, 14);
		add(lblRecurso);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(109, 45, 168, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(109, 70, 167, 20);
		add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(110, 95, 168, 20);
		add(formattedTextField_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(109, 127, 209, 74);
		add(scrollPane);
		
		JEditorPane editorPane = new JEditorPane();
		scrollPane.setViewportView(editorPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(109, 216, 209, 85);
		add(scrollPane_1);
		
		JEditorPane editorPane_1 = new JEditorPane();
		scrollPane_1.setViewportView(editorPane_1);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(22, 316, 89, 23);
		add(btnEnviar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(119, 316, 89, 23);
		add(btnVoltar);
	}		
}
