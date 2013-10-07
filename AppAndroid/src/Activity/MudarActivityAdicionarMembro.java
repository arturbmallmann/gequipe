package Activity;

import android.app.Activity;
import android.view.View;

public class MudarActivityAdicionarMembro extends MudarDeActivityAbstract
{
	public MudarActivityAdicionarMembro( Activity novaActivity, Activity oldActivity )
	{
		super( novaActivity, oldActivity );
	}

	@Override
	public void onClick(View v)
	{		
		super.onClick( v );
		/*
		 * AQUI VAI FICAR MODIFICAÇÕES PARA LAYOUT CASO NESSESARIO
		 */
	}
}