package Modelo;

public class InfoTarefa {
	private String titulo;
	private String descricao;
	private String dataInicio;
	private String dataEntrega;
	private String recurso;
	public InfoTarefa(String titulo) {
		this.titulo=titulo;
	}
	public InfoTarefa(String titulo, String descricao,String dataInicio
			,String dataEntrega,String recurso) {
		this.titulo=titulo;
		this.descricao=descricao;
		this.dataInicio=dataInicio;
		this.dataEntrega=dataEntrega;
		this.recurso=recurso;
	}
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}
	public String getDataEntrega() {
		return dataEntrega;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getRecurso() {
		return recurso;
	}
	public String getTitulo() {
		return titulo;
	}
}
