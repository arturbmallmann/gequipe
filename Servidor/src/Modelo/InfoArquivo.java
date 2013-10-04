package Modelo;

public class InfoArquivo {
	private String nome;
	private String texto;
	public InfoArquivo(String nome) {
		this.nome=nome;
	}
	public InfoArquivo(String nome,String texto) {
		this.nome=nome;
		this.texto=texto;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getNome() {
		return nome;
	}
}
