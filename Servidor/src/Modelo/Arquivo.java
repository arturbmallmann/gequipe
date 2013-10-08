package Modelo;

public class Arquivo {
	private String nome;
	private InfoArquivo info;
	public Arquivo(String nome,InfoArquivo info) {
		this.nome=nome;
		this.info=info;
	}
	public void Modificar(InfoArquivo info){
		this.info = info;
	}
	public InfoArquivo Visualizar(){
		return this.info;
	}
	public String getNome() {
		return nome;
	}
}
