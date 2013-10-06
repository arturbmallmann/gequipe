package Controle.acoes;

import org.json.JSONObject;

import Modelo.sessao.ISessaoEquipe;

public interface IAcao {
	public JSONObject executar(JSONObject packet,ISessaoEquipe sessao);
}
