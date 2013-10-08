package Modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class Equipe {
	private String nome;
	
	ArrayList<String> chavesArquivos;
	ArrayList<String> chavesProjetos;
	HashMap<String,Arquivo> arquivos;
	HashMap<String,Projeto> projetos;
	
	HashMap<String,Usuario> membros;
	HashMap<Usuario,Integer> permissao;
	public Equipe(String nome) {
		this.nome=nome;
		chavesArquivos=new ArrayList<String>();
		chavesProjetos=new ArrayList<String>();
		arquivos = new HashMap<String, Arquivo>();
		projetos = new HashMap<String, Projeto>();
		membros = new HashMap<String, Usuario>();
	}
	
	public ArrayList<String> ListarArquivos(){
		return chavesArquivos;
	}

	public ArrayList<String> ListarProjetos(){
		return chavesProjetos;
	}

	public ArrayList<String> ListarTarefas(String projeto){
		Projeto proj = projetos.get(projeto);
		return proj.listarTarefas();
	}
	
	public InfoArquivo VisualizarArquivo(String nome) {
		Arquivo arq = arquivos.get(nome);
		return arq.Visualizar();
	}
	
	public InfoTarefa VisualizarTarefa(String titulo, String projeto) {
		Projeto proj = projetos.get(projeto);
		return proj.visualizarTarefa(titulo);
	}

	public void ModificarArquivo(String nome,InfoArquivo info) {
		Arquivo arq = arquivos.get(nome);
		arq.Modificar(info);
	}

	public void AtualizarTarefa(InfoTarefa info, String projeto) {
		Projeto proj = projetos.get(projeto);
		proj.atualizarTarefa(info, info.getTitulo());
	}

	public void AdicionarTarefa(InfoTarefa info, String projeto) throws Exception {
		Projeto proj = projetos.get(projeto);
		proj.adicionarTarefa(info);
	}

	public void AdicionarProjeto(String nome)throws Exception {
		if(!projetos.containsKey(nome)){
			chavesProjetos.add(nome);
			projetos.put(nome, new Projeto());
			}
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
	
	public boolean isMember(Usuario usuario){
		return membros.containsKey(usuario);
	}
	
	public String getNome() {
		return nome;
	}

}
