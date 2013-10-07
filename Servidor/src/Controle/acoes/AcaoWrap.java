package Controle.acoes;

public abstract class AcaoWrap implements IAcao{

	protected String wrap(String txt){
		if(txt.startsWith("\""))
			return txt.substring(1, txt.length()-1);
		return txt;
	}
}
