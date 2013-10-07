	import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import org.json.JSONObject;

import Controle.Analyzer;
import Controle.Controle;
import Controle.DadosGambiarrrra;
import Controle.IBaseDeDados;

	public class Main {
		Analyzer analyzer;
		IBaseDeDados dados = new DadosGambiarrrra();
		
		public Main(){
			analyzer = new Analyzer();
			
			ServerSocket server;
			try{
				server = new ServerSocket(5000);
				while(true){
					Socket socket = server.accept();
					new Thread(new EscutaCliente(socket)).start();
				}
			}catch(Exception e){}
		}
		
		private class EscutaCliente implements Runnable{
			
			Scanner leitor;
			PrintWriter p;
			Controle controleDaSessao;
			
			public EscutaCliente(Socket socket){
				try {
					leitor = new Scanner(socket.getInputStream());
					p = new PrintWriter(socket.getOutputStream());
					new Controle(dados);
				} catch (Exception e) {}
			}
			
			public void run() {
				try{
					String texto;
					JSONObject packet;
					while((texto = leitor.nextLine()) != null){
						try {
							packet = controleDaSessao.chamada(new JSONObject(texto),analyzer);
							
							p.println(packet.toString());
							p.flush();
						} catch(Exception e){e.printStackTrace();}
					}
				}catch(Exception e){}
			}
		}
		
		public static void main(String[] args) {
			new Main();
		}
	}