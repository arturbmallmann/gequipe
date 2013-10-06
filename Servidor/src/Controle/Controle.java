package Controle;

import java.util.HashMap;

import org.json.JSONObject;

import Controle.acoes.Analyzer;
import Controle.acoes.IAcao;
import Modelo.Equipe;
import Modelo.Usuario;
import Modelo.sessao.ISessaoEquipe;

public class Controle {

	/**
	 * @param args
	 */
		
//		private IBaseDeDados dados;
//		private HashMap<String, Usuario> usuarios;
//		private HashMap<String, Equipe> equipes;
		ISessaoEquipe sessao;
		public Controle(){
//			dados = new DadosGambiarrrra();
//			usuarios = dados.listaDeUsuarios();
//			equipes = dados.listaDeEquipes();
		}
		public JSONObject chamada(JSONObject packet, Analyzer analyzer){
			IAcao acao = analyzer.parsePacket(packet);
			return acao.executar(packet,sessao);//passsar o controle ao invez de sessao
		}
}
