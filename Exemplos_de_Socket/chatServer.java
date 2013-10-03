package Redes;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class chatServer {

	List<PrintWriter> escritores = new ArrayList<>();
	
	public chatServer(){
		ServerSocket server;
		try{
			server = new ServerSocket(5000);
			while(true){
				Socket socket = server.accept();
				new Thread(new EscutaCliente(socket)).start();
				PrintWriter p = new PrintWriter(socket.getOutputStream());
				escritores.add(p);
			}
		}catch(Exception e){}
	}
	
	private void encaminharParaTodos(String texto){
		for(PrintWriter w : escritores){
			try{
				w.println(texto);
				w.flush();
			}catch(Exception e){}
		}
	}
	
	private class EscutaCliente implements Runnable{
		
		Scanner leitor;
		public EscutaCliente(Socket socket){
			try {
				leitor = new Scanner(socket.getInputStream());
			} catch (Exception e) {}
		}
		
		public void run() {
			try{
				String texto;
				while((texto = leitor.nextLine()) != null){
					System.out.println(texto);
					encaminharParaTodos(texto);
				}
			}catch(Exception e){}
		}
	}
	
	public static void main(String[] args) {
		new chatServer();
	}

}
