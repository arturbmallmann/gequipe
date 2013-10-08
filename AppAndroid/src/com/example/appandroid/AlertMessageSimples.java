package com.example.appandroid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public class AlertMessageSimples
{
	public AlertMessageSimples( Activity activity, String titulo, String mensagem )
	{
		AlertDialog.Builder builder = new AlertDialog.Builder( activity );
        builder.setTitle( titulo );
        builder.setMessage( mensagem );
        builder.setPositiveButton( "OK", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which)
			{

			}
		});
        builder.create();
        builder.show();
	}
}