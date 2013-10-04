package Modelo;

public class Arquivo {
	private InfoArquivo informacao;
	public Arquivo() {
		// TODO Auto-generated constructor stub
	}
	public void Modificar(InfoArquivo info){
		informacao = info;
	}
	public InfoArquivo Visualizar(){
		return informacao;
	}
}
