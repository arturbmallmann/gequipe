package com.example.appandroid;
import Controle.MudarDeActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class Principal_activity extends Activity
{
	

	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal_activity);
		
		Button btAdicionarTarefa = ( Button ) findViewById( R.id.btAdicionarTarefa );
		Activity AdicionarTarefa_acitivity = new AdicionarTarefa_acitivity();
		btAdicionarTarefa.setOnClickListener( new MudarDeActivity( AdicionarTarefa_acitivity, this));
	}
}