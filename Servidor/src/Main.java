import java.util.HashMap;

import Controle.DadosGambiarrrra;
import Controle.IBaseDeDados;
import Modelo.Equipe;
import Modelo.Usuario;



//public class Main {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		IBaseDeDados dados = new DadosGambiarrrra();
//		HashMap<String, Usuario> usuarios = dados.listaDeUsuarios();
//		HashMap<String, Equipe> equipes = dados.listaDeEquipes();
//		// TODO Auto-generated method stub
//
//	}

	import java.io.PrintWriter;
	import java.net.ServerSocket;
	import java.net.Socket;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;
	import org.json.JSONObject;

	import Controle.Analyzer;
	import Controle.DadosGambiarrrra;
	import Controle.IBaseDeDados;
	import Modelo.Equipe;
	import Modelo.Usuario;
	import Controle.Controle;

	public class Main {
		Controle control;
		Analyzer analyzer;
		
		public Main(){
			control = new Controle();
			analyzer = new Analyzer(control);
			
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
			
			public EscutaCliente(Socket socket){
				try {
					leitor = new Scanner(socket.getInputStream());
					p = new PrintWriter(socket.getOutputStream());
				} catch (Exception e) {}
			}
			
			public void run() {
				try{
					String texto;
					JSONObject packet;
					while((texto = leitor.nextLine()) != null){
						try {
							packet = analyzer.parsePacket(new JSONObject(texto));
							
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

	
}
