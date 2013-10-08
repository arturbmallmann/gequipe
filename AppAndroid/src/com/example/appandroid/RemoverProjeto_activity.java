package com.example.appandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RemoverProjeto_activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.remover_projeto);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.remover_projeto_activity, menu);
		return true;
	}

}
