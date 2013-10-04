package Modelo;

public class Usuario {
	private String nome;
	private String senha;
	private String login;
	
	public Usuario(String login,String senha,String nome) {
		this.nome=nome;
		this.senha=senha;
		this.login=login;
	}
	public String getLogin() {
		return login;
	}
	public String getNome() {
		return nome;
	}
	public boolean conferirSenha(String senha){
		return this.senha==senha;
	}
}
