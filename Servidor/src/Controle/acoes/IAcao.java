package Controle.acoes;

import org.json.JSONObject;

import Controle.Controle;

public interface IAcao {
	public JSONObject executar(JSONObject packet,Controle controle);
}
