import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.json.JSONObject;


public class Servidor {
	
	private Map<String, String> contas;

	public Servidor(){
		ServerSocket server;
		contas = new HashMap<>();
		try{
			server = new ServerSocket(5000);
			while(true){
				Socket socket = server.accept();
				new Thread(new EscutaCliente(socket, contas)).start();
			}
		}catch(Exception e){}
	}
	
	private class EscutaCliente implements Runnable{
		
		Scanner leitor;
		PrintWriter p;
		Map<String, String> contas;
		
		public EscutaCliente(Socket socket, Map<String, String> contas){
			try {
				leitor = new Scanner(socket.getInputStream());
				p = new PrintWriter(socket.getOutputStream());
				this.contas = contas;
			} catch (Exception e) {}
		}
		
		public void run() {
			try{
				String texto;
				JSONObject obj, ret;
				while((texto = leitor.nextLine()) != null){
					try {
						obj = new JSONObject(texto);
						ret = new JSONObject();
							ret.put("message", "Erro: Operacao nao reconhecida!");
						
						if(texto.contains("\"login\":") && texto.contains("\"senha\":")){
							String login = wrap(obj.get("login").toString());
							String senha = wrap(obj.get("senha").toString());
							
							if(contas.containsKey(login) && contas.get(login).equals(senha)){
								ret.put("message", "Login concluido!(1)");
							}else if(!contas.containsKey(login)){
								contas.put(login, senha);
								ret.put("message", "Login Concluido!(2)");
							}else{
								ret.put("message", "Erro: Senha incorreta!");
							}
						}
						p.println(ret.toString());
						p.flush();
					} catch(Exception e){e.printStackTrace();}
				}
			}catch(Exception e){}
		}
		
		public String wrap(String txt){
			if(txt.contains("["))
				return txt.substring(2, txt.length()-2);
			return txt.substring(1, txt.length()-1);
		}
	}
	
	public static void main(String[] args) {
		new Servidor();
	}
}
