package Controle.acoes;

import org.json.JSONObject;

import Controle.Controle;
import Modelo.Usuario;

public class AdicionarMembro extends AcaoWrap{

	@Override
	public JSONObject executar(JSONObject packet, Controle controle) {
		String login = wrap(packet.get("login").toString());
		packet = new JSONObject();

		try {
			Usuario usuario = controle.dados.pegaUsuarios(login);
			controle.sessao.AdicionarMembro(usuario);
		} catch (Exception e) {
			packet.put("message", e.getMessage());
		}
		return packet;
	}

}
