package Controle;

import java.util.HashMap;

import Modelo.Equipe;
import Modelo.Usuario;

public class Controle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IBaseDeDados dados = new DadosGambiarrrra();
		HashMap<String, Usuario> usuarios = dados.listaDeUsuarios();
		HashMap<String, Equipe> equipes = dados.listaDeEquipes();
	}

}
