package Controle;
import org.json.JSONArray;
import org.json.JSONObject;
public class Controle
{
	private JSONArray retorno;

	public Controle()
	{
		this.retorno = new JSONArray();
		System.out.println( "CONECTANDO AO SERVIDOR VIA SOCKET" );
	}

	public void adicionarMembro( JSONArray j )
	{
		
		try
		{
			JSONArray retorno = new JSONArray();
			
			JSONArray listaM = new JSONArray();
			JSONObject um = new JSONObject();
			JSONObject dois = new JSONObject();
			JSONObject membre = new JSONObject();
			membre.put( "membro" , listaM );
			listaM.put(um);
			listaM.put(dois);
			um.put("nome", "Luiz");
			dois.put( "nome", "ele" );
			JSONArray menssagems = new JSONArray();
			JSONObject exception = new JSONObject();
			exception.put("exception", false);
			JSONObject Oretorno = new JSONObject();
			Oretorno.put("retorno","listadeMembro");
			menssagems.put(exception);
			menssagems.put(Oretorno);
			retorno.put(membre);
			retorno.put(menssagems);
			this.retorno = retorno;
		}
		catch( Exception e )
		{

		}
		/*
		 * AQUI MANDA O JSON PARA O SERVIDOR VIA SOCKET
		 * o retorno vai estar sempre no toString, voltando string obvio, mas podemos voltar a string e interpretala, ou voltar o JSONArray
		 * Fica nosso criterio, é mudar qualquer coisa
		 */
	}

	@Override
	public String toString()
	{
		/*
		 * sempre as funções vão mudar o valor o RETORNO e no template, vai ser chamado o toString. para padronizar .. ta voltando String
		 * Podemos voltar JSONArray, não precisa usar esse metodo, ai retorno fica em cada função, retornando JSONArray
		 */
		return this.retorno.toString();
	}
}