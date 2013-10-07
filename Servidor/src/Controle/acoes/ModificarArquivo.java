package Controle.acoes;

import org.json.JSONObject;

import Controle.Controle;
import Modelo.InfoArquivo;

public class ModificarArquivo extends AcaoWrap {

	@Override
	public JSONObject executar(JSONObject packet, Controle controle) {
		String nome = wrap(packet.get("nome").toString());
		String conteudo = wrap(packet.get("conteudo").toString());
		packet = new JSONObject();

		try {
			controle.sessao.ModificarArquivo(nome,new InfoArquivo(conteudo));
		} catch (Exception e) {
			packet.put("message", e.getMessage());
		}
		return packet;
	}

}
