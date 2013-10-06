package Controle;
import org.json.JSONObject;

public class Analyzer {
	
	private Controle control;
	
	public Analyzer(Controle control){
		this.control = control;
	}
	
	public JSONObject parsePacket(JSONObject packet){
		if(packet.has("login") && packet.has("senha")){
			return efetuarLogin(packet);
		}else if(packet.has("addProj")){
			return adicionarProjeto(packet);
		}else if(packet.has("removeProj")){
			return removerProjeto(packet);
		}else if(packet.has("newTarefa")){
			return criarTarefa(packet);
		}else if(packet.has("updateTarefa")){
			return atualizarTarefa(packet);
		}else if(packet.has("addMembro")){
			return adicionarMembro(packet);
		}else if(packet.has("removeMembro")){
			return removerMembro(packet);
		}else if(packet.has("changeNivel")){
			return modificarNivel(packet);
		}else if(packet.has("desconectar")){
			return desconectar(packet);
		}else if(packet.has("listArquivos")){
			return listarArquivos(packet);
		}else if(packet.has("viewArquivo")){
			return visualizarArquivo(packet);
		}else if(packet.has("changeArquivo")){
			return modificarArquivo(packet);
		}
		return null;
	}
	
	public JSONObject efetuarLogin(JSONObject packet){
		String login = wrap(packet.get("login").toString());
		String senha = wrap(packet.get("senha").toString());
		packet = new JSONObject();
		
		try{
			control.efetuarLogin(login, senha);
			packet.put("message", "Login efetuado com sucesso!");
		}catch(Exception e){
			packet.put("message", e.getMessage());
		}
		return packet;
	}
	public JSONObject adicionarProjeto(JSONObject packet){
		return null;
	}
	public JSONObject removerProjeto(JSONObject packet){
		return null;
	}
	public JSONObject criarTarefa(JSONObject packet){
		return null;
	}
	public JSONObject atualizarTarefa(JSONObject packet){
		return null;
	}
	public JSONObject adicionarMembro(JSONObject packet){
		return null;
	}
	public JSONObject removerMembro(JSONObject packet){
		return null;
	}
	public JSONObject modificarNivel(JSONObject packet){
		return null;
	}
	public JSONObject desconectar(JSONObject packet){
		return null;
	}
	public JSONObject listarArquivos(JSONObject packet){
		return null;
	}
	public JSONObject visualizarArquivo(JSONObject packet){
		return null;
	}
	public JSONObject modificarArquivo(JSONObject packet){
		return null;
	}
	
	private String wrap(String txt){
		return txt.substring(1, txt.length()-1);
	}
}
