package com.example.appandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AdicionarMembro_activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adicionar_membro);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.adicionar_membro_activity, menu);
		return true;
	}

}
