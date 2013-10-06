package com.example.appandroid;
import Controle.MudarDeActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Principal_activity extends Activity
{	
	private Activity activityCurrent = this;
	
	@Override
	protected void onCreate( Bundle savedInstanceState )
	{	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
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
		 * user normal e user admin
		 */
		
		setContentView( R.layout.principal_activity );

		/**
		 * Muda a activity,para adicionar um tarefa
		 */

		Button btAdicionarTarefa = ( Button ) findViewById( R.id.btAdicionarTarefa );
		Activity AdicionarTarefa_acitivity = new AdicionarTarefa_acitivity();
		btAdicionarTarefa.setOnClickListener( new MudarDeActivity( AdicionarTarefa_acitivity, this));

		/**
		 Muda activity para adicionar membro
		 */

		Button btAdicionarMembro = ( Button ) findViewById( R.id.btAdicionarMembroEquipe );
		Activity adicionarMembroEquipe = new AdicionarMembro_activity();
		btAdicionarMembro.setOnClickListener( new MudarDeActivity( adicionarMembroEquipe, this));
		
		/**
		 * Muda activity para adicionar Projeto
		 */
		
		Button btAdicionarProjeto = ( Button ) findViewById( R.id.btAdicionarProjeto );
		Activity adicionarProjetoEquipe = new AdicionarProjeto_activity();
		btAdicionarProjeto.setOnClickListener( new MudarDeActivity( adicionarProjetoEquipe, this));

		/**
		 * Muda activity para Visualizar Equipe
		 */
		
		Button btVisualizarEquipe = ( Button ) findViewById( R.id.btVisualizarEquipe );
		Activity visualizarEquipe = new VisualizarEquipe_activity();
		btVisualizarEquipe.setOnClickListener( new MudarDeActivity( visualizarEquipe, this));

		/**
		 * Muda activity para Remover Projeto
		 */

		Button btRemoverProjeto = ( Button ) findViewById( R.id.btRemoverProjeto );
		Activity removerProjeto = new RemoverProjeto_activity();
		btRemoverProjeto.setOnClickListener( new MudarDeActivity( removerProjeto, this));

		/**
		 * Muda activity para Atualizar Tarefa
		 */

		Button btAtualizarTarefa = ( Button ) findViewById( R.id.btAtualizarTarefa );
		Activity atualizarTarefaEquipe = new AtualizarTarefa_activity();
		btAtualizarTarefa.setOnClickListener( new MudarDeActivity( atualizarTarefaEquipe, this));

	}
}