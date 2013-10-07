package Modelo.sessao;

import Controle.IBaseDeDados;
import Modelo.Equipe;
import Modelo.InfoArquivo;
import Modelo.InfoTarefa;
import Modelo.Usuario;

public class Administrador extends SessaoAbstrata{
	
	public Administrador(Equipe equipe) {
		super(equipe);
	}
	public InfoArquivo VisualizarArquivo(String nome){
		 return equipe.VisualizarArquivo(nome);
	}
	@Override
	public void ModificarArquivo (String nome,InfoArquivo info){
		 equipe.ModificarArquivo(nome,info);
	}
	@Override
	public void AtualizarTarefa(InfoTarefa info,String projeto) throws Exception{
		 equipe.AtualizarTarefa(info, projeto);
	}
	@Override
	public void AdicionarTarefa(InfoTarefa info,String projeto) throws Exception{
		 equipe.AdicionarTarefa(info, projeto);
	}
	@Override
	public void AdicionarProjeto(String nome) throws Exception{
		 equipe.AdicionarProjeto(nome);
	}
	@Override
	public void AdicionarMembro(Usuario usuario) throws Exception{
		 equipe.AdicionarMembro(usuario);
	}
	@Override
	public void RemoverMembro(String login) throws Exception{
		 equipe.RemoverMembro(login);
	}
	@Override
	public void RemoverProjeto(String nome) throws Exception{
		 equipe.RemoverMembro(nome);
	}
	@Override
	public void ModificarNivel(Usuario usuario,Integer valor,IBaseDeDados dados) throws Exception{
		dados.setarNivel(usuario, valor);
	}
}
