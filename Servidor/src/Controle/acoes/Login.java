package Controle.acoes;

import org.json.JSONObject;

import Controle.Controle;
import Modelo.Usuario;

public class Login extends AcaoWrap {
	@Override
	public JSONObject executar(JSONObject packet, Controle controle) {
		String login = wrap(packet.get("login").toString());
		String senha = wrap(packet.get("senha").toString());
		packet = new JSONObject();

		try {
			Usuario usuario = controle.dados.pegaUsuarios(login);
			if (usuario.conferirSenha(senha)) {
				controle.sessao = controle.dados.criarSessao(usuario);
				packet.put("message", "Login efetuado com sucesso!");
			}
		} catch (Exception e) {
			packet.put("message", e.getMessage());
		}
		return packet;
	}

}