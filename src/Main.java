import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import org.json.JSONObject;


public class Main {
	
	private PrintWriter escritor;
	private Socket socket;
	private Scanner leitor;
	
	public Main(){
		configurarRede();
	}
	
	private void configurarRede(){
		try{
			socket = new Socket("127.0.0.1", 5000);
			escritor = new PrintWriter(socket.getOutputStream());
			leitor = new Scanner(socket.getInputStream());
			new Thread(new EscutaServidor()).start();
		}catch(Exception e){e.printStackTrace();}
	}
	
	private class EscutaServidor implements Runnable{

		public void run() {
			try{
				String texto;
				while((texto = leitor.nextLine()) != null){
					System.out.println(texto);
				}
			}catch(Exception e){}
		}
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		new Principal(m.escritor);
	}

}
