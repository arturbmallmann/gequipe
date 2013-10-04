import java.util.HashMap;

import Controle.DadosGambiarrrra;
import Controle.IBaseDeDados;
import Modelo.Equipe;
import Modelo.Usuario;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IBaseDeDados dados = new DadosGambiarrrra();
		HashMap<String, Usuario> usuarios = dados.listaDeUsuarios();
		HashMap<String, Equipe> equipes = dados.listaDeEquipes();
		// TODO Auto-generated method stub

	}

}
