package Activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public abstract class MudarDeActivityAbstract implements OnClickListener
{
	protected Activity novaActivity;
	protected Activity oldActivity;
	
	public MudarDeActivityAbstract( Activity novaActivity, Activity oldActivity )
	{
		this.novaActivity = novaActivity;
		this.oldActivity = oldActivity;
	}

	@Override
	public void onClick( View v )
	{
		Intent myIntent = new Intent( v.getContext(), this.novaActivity.getClass() );  
        this.oldActivity.startActivity( myIntent ); 
	}
}