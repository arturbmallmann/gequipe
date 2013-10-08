package Controle;

import Modelo.Usuario;
import Modelo.sessao.ISessaoEquipe;

public interface IBaseDeDados {
	public Usuario pegaUsuarios(String nome);
	public ISessaoEquipe criarSessao(Usuario usuario);
	public void setarNivel(Usuario usuario,Integer valor);
}
