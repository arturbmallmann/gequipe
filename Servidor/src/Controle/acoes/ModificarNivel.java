package Controle.acoes;

import org.json.JSONObject;

import Controle.Controle;
import Modelo.Usuario;

public class ModificarNivel extends AcaoWrap {

	@Override
	public JSONObject executar(JSONObject packet, Controle controle) {
		String login = wrap(packet.get("login").toString());
		Integer valor = Integer.parseInt(wrap(packet.get("valor").toString()));
		packet = new JSONObject();

		try {
			Usuario usuario=controle.dados.pegaUsuarios(login);
			controle.sessao.ModificarNivel(usuario, valor,controle.dados);
		} catch (Exception e) {
			packet.put("message", e.getMessage());
		}
		return packet;
	}

}
