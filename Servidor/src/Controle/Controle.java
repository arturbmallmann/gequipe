package Controle;

import org.json.JSONObject;

import Controle.acoes.IAcao;
import Modelo.sessao.ISessaoEquipe;

public class Controle {

	/**
	 * @param args
	 */
		
		public IBaseDeDados dados;
		public ISessaoEquipe sessao;
		public Controle(IBaseDeDados dados){
			this.dados = dados;
		}
		public JSONObject chamada(JSONObject packet, Analyzer analyzer){
			IAcao acao = analyzer.parsePacket(packet);
			return acao.executar(packet,this);//passsar o controle ao invez de sessao
		}
}
