package Controle;

import java.util.ArrayList;
import java.util.HashMap;

import Modelo.Equipe;
import Modelo.Usuario;
import Modelo.sessao.Administrador;
import Modelo.sessao.ISessaoEquipe;
import Modelo.sessao.Normal;

public class DadosGambiarrrra implements IBaseDeDados {
	ArrayList<Equipe> equipes = new ArrayList<Equipe>();

	HashMap<String, Usuario> usuarios = new HashMap<String, Usuario>();
	HashMap<Usuario, Integer> nivel = new HashMap<Usuario, Integer>();

	public DadosGambiarrrra() {
		// admin 0, normal 1
		Usuario user = new Usuario("artur", "123", "Artur B. MAllmann");
		usuarios.put(user.getLogin(), user);
		nivel.put(user, 1);

		user = new Usuario("salsicha", "123", "Salsichao");
		usuarios.put(user.getLogin(), user);
		nivel.put(user, 1);

		user = new Usuario("digo", "123", "Rodrigo Tanto Faz");
		usuarios.put(user.getLogin(), user);
		nivel.put(user, 1);

		user = new Usuario("gilney", "123", "Gilney Mathias");
		usuarios.put(user.getLogin(), user);
		nivel.put(user, 1);

		user = new Usuario("luiz", "123", "luiz");
		usuarios.put(user.getLogin(), user);
		nivel.put(user, 1);

		user = new Usuario("erado", "vida", "Lole pqp");
		usuarios.put(user.getLogin(), user);
		nivel.put(user, 1);

		user = new Usuario("admin", "admin", "admin");
		usuarios.put(user.getLogin(), user);
		nivel.put(user, 0);

		user = new Usuario("admin2", "admin", "admin");
		usuarios.put(user.getLogin(), user);
		nivel.put(user, 0);

		Equipe eq = new Equipe("led");
		equipes.add(eq);
		eq = new Equipe("deep");
		equipes.add(eq);
	}

	@Override
	public Usuario pegaUsuarios(String nome) {
		return usuarios.get(nome);
	}

	@Override
	public ISessaoEquipe criarSessao(Usuario usuario) {
		ISessaoEquipe sessao = null;
		Equipe eq=null;
//		for(int i=0;i< equipes.size();i++){
//			Equipe e=equipes.get(i);
//			if(eq.isMember(usuario)){
//				eq=e;
//				break;
//			}
//		}
		for(Equipe e:equipes) {
			if(eq.isMember(usuario))
				eq=e;
		}
		if(nivel.get(usuario) == 0)
			sessao = new Administrador(eq);
		else if(nivel.get(usuario)==1)
			sessao = new Normal(eq);
		return sessao;
	}
	
	@Override
	public void setarNivel(Usuario usuario,Integer valor) {
		nivel.put(usuario, valor);
	}
}
