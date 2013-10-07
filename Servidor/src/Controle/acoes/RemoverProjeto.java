package Controle.acoes;

import org.json.JSONObject;

import Controle.Controle;

public class RemoverProjeto extends AcaoWrap {
	@Override
	public JSONObject executar(JSONObject packet, Controle controle) {
		String nome = wrap(packet.get("nome").toString());
		packet = new JSONObject();

		try {
			controle.sessao.RemoverProjeto(nome);
		} catch (Exception e) {
			packet.put("message", e.getMessage());
		}
		return packet;
	}

}
