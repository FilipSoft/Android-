package com.FilipSoft.sibenica;

import android.app.*;
import android.graphics.drawable.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.util.*;

public class game extends Activity 
{

	private String slovo = "";
	
	public int kat =0;
	private int score = 10000;
	private int multiplikator = 0;
	private String Suhadnute="";
	private String ZapocitaneChyby="";
	private int chyba = 0;
	private int dlzkaSlova=0;
	private int PocetVyskytu=0;
	private String PomDlzka="";
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
	
		AnimationDrawable animacia = new AnimationDrawable();
		ImageView logo = (ImageView) findViewById(R.id.logo);
	
		animacia.addFrame(getResources().getDrawable(R.drawable.sibenica1),250);
		animacia.addFrame(getResources().getDrawable(R.drawable.sibenica2),250);
		animacia.addFrame(getResources().getDrawable(R.drawable.sibenica3),250);
		animacia.addFrame(getResources().getDrawable(R.drawable.sibenica4),250);
		animacia.addFrame(getResources().getDrawable(R.drawable.sibenica5),250);
		animacia.addFrame(getResources().getDrawable(R.drawable.sibenica6),250);
		animacia.addFrame(getResources().getDrawable(R.drawable.sibenica7),250);
		animacia.addFrame(getResources().getDrawable(R.drawable.sibenica8),250);
		animacia.addFrame(getResources().getDrawable(R.drawable.sibenica9),250);
		animacia.addFrame(getResources().getDrawable(R.drawable.sibenica),250);
		
		logo.setBackground(animacia);
		animacia.start();
	
		}}
