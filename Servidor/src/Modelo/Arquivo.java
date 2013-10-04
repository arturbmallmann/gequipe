package Modelo;

public class Arquivo {
	private InfoArquivo info;
	public Arquivo(InfoArquivo info) {
		this.info=info;
	}
	public void Modificar(InfoArquivo info){
		this.info = info;
	}
	public InfoArquivo Visualizar(){
		return this.info;
	}
}
