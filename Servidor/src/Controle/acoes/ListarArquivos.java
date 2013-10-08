package Controle.acoes;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import Controle.Controle;

public class ListarArquivos extends AcaoWrap{
	@Override
	public JSONObject executar(JSONObject packet, Controle controle) {
		packet = new JSONObject();
		JSONArray array=new JSONArray();
		try {
			ArrayList<String> lista = controle.sessao.ListarArquivos();
			for(String nome:lista){
				array.put(nome);
			}
			packet.put("arquivos", array);
		} catch (Exception e) {
			packet.put("message", e.getMessage());
		}
		return packet;
	}

}
