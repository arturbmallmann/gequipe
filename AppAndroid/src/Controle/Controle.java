package Controle;
import org.json.JSONArray;
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