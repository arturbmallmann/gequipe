package Controle;

import java.util.HashMap;

import Modelo.Equipe;
import Modelo.Usuario;

public interface IBaseDeDados {
	public HashMap<String, Usuario> listaDeUsuarios();
	public HashMap<String, Equipe> listaDeEquipes();
}
