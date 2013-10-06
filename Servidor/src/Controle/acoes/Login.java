package Controle.acoes;

import org.json.JSONObject;

import Modelo.sessao.ISessaoEquipe;

public class Login extends AcaoWrap implements IAcao {
	@Override
	public JSONObject executar(JSONObject packet,ISessaoEquipe sessao) {
	String login = wrap(packet.get("login").toString());
	String senha = wrap(packet.get("senha").toString());
	packet = new JSONObject();
	
	try{
		
		packet.put("message", "Login efetuado com sucesso!");
	}catch(Exception e){
		packet.put("message", e.getMessage());
	}
	return packet;
		return null;
	}
	
}
