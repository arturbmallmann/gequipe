package Controle.acoes;

import org.json.JSONObject;

import Controle.Controle;

public class RemoverMembro extends AcaoWrap {

	@Override
	public JSONObject executar(JSONObject packet, Controle controle) {
		String login = wrap(packet.get("login").toString());
		packet = new JSONObject();

		try {
			controle.sessao.RemoverMembro(login);
		} catch (Exception e) {
			packet.put("message", e.getMessage());
		}
		return packet;
	}

}
