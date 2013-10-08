package com.example.appandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AtualizarTarefa_activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.atualizar_tarefa);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.atualizar_tarefa_activity, menu);
		return true;
	}

}
