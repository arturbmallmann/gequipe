package com.example.appandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private Teste meuTeste = new Teste();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button bt = (Button) findViewById(R.id.btEntrar);
		
		bt.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				EditText meuEditi = (EditText) findViewById(R.id.etSenha);
				meuTeste.setA(meuEditi.getText().toString());
				TextView tvTitle = (TextView) findViewById( R.id.tvTitle );
				tvTitle.setText( meuTeste.getA() );
			}
		});
	}

	/*
	 * @Override public boolean onCreateOptionsMenu(Menu menu) { // Inflate the
	 * menu; this adds items to the action bar if it is present.
	 * getMenuInflater().inflate(R.menu.main, menu); return true; }
	 */

}
