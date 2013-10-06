package Controle.acoes;
import java.util.HashMap;

import org.json.JSONObject;

import Controle.Controle;

public class Analyzer {
	HashMap<String, IAcao> mapaDeAcoes;
	public Analyzer(){
		mapaDeAcoes=new HashMap<String, IAcao>();
		mapaDeAcoes.put("login", new Login());
	}
	
	public IAcao parsePacket(JSONObject packet){
		if(packet.has("login") && packet.has("senha")){
			return mapaDeAcoes.get("login");
		}else if(packet.has("addProj")){
			return mapaDeAcoes.get("addProj");
		}else if(packet.has("removeProj")){
			return mapaDeAcoes.get("removeProj");
		}else if(packet.has("newTarefa")){
			return mapaDeAcoes.get("newTarefa");
		}else if(packet.has("updateTarefa")){
			return mapaDeAcoes.get("updateTarefa");
		}else if(packet.has("addMembro")){
			return mapaDeAcoes.get("addMembro");
		}else if(packet.has("removeMembro")){
			return mapaDeAcoes.get("removeMembro");
		}else if(packet.has("changeNivel")){
			return mapaDeAcoes.get("changeNivel");
		}else if(packet.has("desconectar")){
			return mapaDeAcoes.get("desconectar");
		}else if(packet.has("listArquivos")){
			return mapaDeAcoes.get("listArquivos");
		}else if(packet.has("viewArquivo")){
			return mapaDeAcoes.get("viewArquivo");
		}else if(packet.has("changeArquivo")){
			return mapaDeAcoes.get("changeArquivo");
		}
		return null;
	}
	

}
