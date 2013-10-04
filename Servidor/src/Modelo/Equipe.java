package Modelo;

import java.util.HashMap;

public class Equipe {
	private String nome;
	HashMap<String,Arquivo> arquivos;
	HashMap<String,Projeto> projetos;
	HashMap<String,Usuario> membros;
	HashMap<Usuario,Integer> permissao;
	public Equipe(String nome) {
		this.nome=nome;
		arquivos = new HashMap<String, Arquivo>();
		projetos = new HashMap<String, Projeto>();
		membros = new HashMap<String, Usuario>();
	}
	public InfoArquivo VisualizarArquivo(String nome) {
		Arquivo arq = arquivos.get(nome);
		return arq.Visualizar();
	}

	public void ModificarArquivo(InfoArquivo info) {
		Arquivo arq = arquivos.get(info.getNome());
		arq.Modificar(info);
	}

	public void AtualizarTarefa(InfoTarefa info, String projeto) {
		Projeto proj = projetos.get(projeto);
		proj.atualizarTarefa(info, info.getTitulo());
	}

	public void AdicionarTarefa(InfoTarefa info, String projeto) {
		Projeto proj = projetos.get(projeto);
		proj.adicionarTarefa(info);
	}

	public void AdicionarProjeto(String nome)throws Exception {
		if(!projetos.containsKey(nome))
			projetos.put(nome, new Projeto());
		else
			throw new Exception("projeto já existe");
	}

	public void AdicionarMembro(Usuario usuario) throws Exception {
		if(!membros.containsKey(usuario.getLogin()))
			membros.put(usuario.getLogin(), usuario);
		else
			throw new Exception("Usuário já esta cadastrado");
	}

	public void RemoverMembro(String login) throws Exception {
		if(membros.containsKey(login))
			membros.remove(login);
		else
			throw new Exception("Usuário não existente");
	}

	public void RemoverProjeto(String nome)throws Exception  {
		if(projetos.containsKey(nome))
			projetos.remove(nome);
		else
			throw new Exception("projeto não existe");		
	}
	
	public String getNome() {
		return nome;
	}

}
