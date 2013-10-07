package Controle;
import java.util.HashMap;

import org.json.JSONObject;

import com.sun.org.apache.regexp.internal.RE;

import Controle.acoes.AdicionarProjeto;
import Controle.acoes.AdicionarTarefa;
import Controle.acoes.IAcao;
import Controle.acoes.Login;
import Controle.acoes.RemoverProjeto;

public class Analyzer {
	HashMap<String, IAcao> mapaDeAcoes;
	public Analyzer(){
		mapaDeAcoes=new HashMap<String, IAcao>();
		mapaDeAcoes.put("login", new Login());
		mapaDeAcoes.put("addProj", new AdicionarProjeto());
		mapaDeAcoes.put("removeProj", new RemoverProjeto());
		mapaDeAcoes.put("newTarefa", new AdicionarTarefa());
		mapaDeAcoes.put("updateTarefa", new Login());
		mapaDeAcoes.put("addMembro", new Login());
		mapaDeAcoes.put("removeMembro", new Login());
		mapaDeAcoes.put("changeNivel", new Login());
		mapaDeAcoes.put("desconectar", new Login());
		mapaDeAcoes.put("listarArquivos", new Login());
		mapaDeAcoes.put("listarProjetos", new Login());
		mapaDeAcoes.put("listarTarefas", new Login());
		mapaDeAcoes.put("viewArquivo", new Login());
		mapaDeAcoes.put("changeArquivo", new Login());
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
			return mapaDeAcoes.get("listarArquivos");
		}else if(packet.has("listarProjetos")){
			return mapaDeAcoes.get("listarProjetos");
		}else if(packet.has("listarTarefas")){
			return mapaDeAcoes.get("listarTarefas");
		}else if(packet.has("viewArquivo")){
			return mapaDeAcoes.get("viewArquivo");
		}else if(packet.has("changeArquivo")){
			return mapaDeAcoes.get("changeArquivo");
		}
		return null;
	}
	

}
