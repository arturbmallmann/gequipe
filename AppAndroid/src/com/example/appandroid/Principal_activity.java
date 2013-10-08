package com.example.appandroid;
import org.json.JSONArray;
import org.json.JSONObject;

import Activity.MudarActivityAdicionarMembro;
import Controle.Controle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Principal_activity extends Activity
{	
	protected Activity activityCurrent = this;
	protected Controle conexaoServidor;
	
	@Override
	protected void onCreate( Bundle savedInstanceState )
	{	
		super.onCreate(savedInstanceState);
		conexaoServidor = new Controle();
		conexaoServidor.adicionarMembro(new JSONArray());
		setContentView(R.layout.login);
		
		/**JSON COM USUARIO E SENHA**/
		
		JSONObject login = new JSONObject();
		JSONObject password = new JSONObject();
		
		JSONArray infoLogin = new JSONArray();
		
		infoLogin.put( login );
		infoLogin.put( password );
		
		try
		{
			login.put( "login", "admin" );
			password.put( "password", "admin" );
			
			/*
			 * não sei quebrar o JSON ARRAY kk se alguem saber..
			 */
			
		}
		catch( Exception e )
		{
			System.out.println( "ERRO JSON" );
		}
		
		/****JSN COM USUARIO E SENHA****/
		
		Button btLogar = ( Button )findViewById( R.id.btLogar );
		btLogar.setOnClickListener( new OnClickListener( )
		{
			@Override
			public void onClick( View v )
			{	
				EditText etLogin = ( EditText )findViewById( R.id.etLogin );
				EditText etPassword = ( EditText )findViewById( R.id.etPassword );
				if( etLogin.getText().toString().equals( "admin" ) && etPassword.getText().toString().equals( "admin" ) )
				{
					criaInterfaceUsuario();
				}
				else
				{						
					new AlertMessageSimples( activityCurrent, "LOGIN", "USUÁIO/SENHA INCORRETO");					
				}
			}
		});
	}
	
	private void criaInterfaceUsuario()
	{
		/*
		 * Apos termos como saber se ele é admin ou não. Tens que dvidir os layout, em layout para
		 * user normal, e user admin
		 */

		setContentView( R.layout.principal_activity );

		/**
		 * Muda a activity,para adicionar um membro
		 */

		Button btAdicionarMembro = ( Button ) findViewById( R.id.btAdicionarMembro );
		btAdicionarMembro.setOnClickListener( (OnClickListener) new MudarActivityAdicionarMembro( new AdicionarMembro_activity(), this ) );

	}
}