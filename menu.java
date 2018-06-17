package com.FilipSoft.sibenica;

import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;

public class menu extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }
	public void koniec(View v){
		finish();
	}

	public void score(View v){
	Intent next = new Intent(this,score.class);
	startActivity(next);
}

	public void play(View v){
		Intent next = new Intent(this,select.class);
		startActivity(next);
	}
	
}
