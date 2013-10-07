package Controle.acoes;

import org.json.JSONObject;

import Controle.Controle;

public class AdicionarTarefa extends AcaoWrap{
	@Override
	public JSONObject executar(JSONObject packet, Controle controle) {
		String nome = wrap(packet.get("nome").toString());
		packet = new JSONObject();

		try {
			//controle.sessao.AdicionarTarefa(info, projeto)(nome);
		} catch (Exception e) {
			packet.put("message", e.getMessage());
		}
		return packet;
	}

}
