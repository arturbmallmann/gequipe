package Controle;

import java.util.HashMap;

import Modelo.Equipe;
import Modelo.Usuario;

public class DadosGambiarrrra implements IBaseDeDados{

	HashMap<String, Usuario> usuarios = new HashMap<String, Usuario>();
	HashMap<String, Equipe> equipes = new HashMap<String, Equipe>();
	@Override
	public HashMap<String, Usuario> listaDeUsuarios() {
		usuarios.put("artur",new Usuario("artur","123","Artur B. MAllmann"));
		usuarios.put("salsicha",new Usuario("salsicha","123","Salsichao"));
		usuarios.put("digo",new Usuario("digo","123","Rodrigo Tanto Faz"));
		usuarios.put("gilney",new Usuario("gilney","123","Gilney Mathias"));
		usuarios.put("luiz",new Usuario("luiz","123","luiz"));
		usuarios.put("erado",new Usuario("erado","vida","Lole pqp"));
		usuarios.put("admin",new Usuario("admin","admin","admin"));
		usuarios.put("admin2",new Usuario("admin2","admin","admin"));
		return usuarios;
	}

	@Override
	public HashMap<String, Equipe> listaDeEquipes() {
		Equipe eq=new Equipe("led");
		equipes.put(eq.getNome(),eq);
		eq=new Equipe("deep");
		equipes.put(eq.getNome(),eq);
		return equipes;
	}

}
