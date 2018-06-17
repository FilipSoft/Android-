package com.FilipSoft.sibenica;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class select extends Activity 
{

int met;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vyber_kategoriu);
	
		}
	
		public void play(View v){
		
			RadioGroup RG = (RadioGroup) findViewById(R.id.RadioGroup);
			int VybraneID = RG.getCheckedRadioButtonId();

			RadioButton VybraneRadio = (RadioButton) findViewById(VybraneID);

			String VybranyNazov = VybraneRadio.getText().toString();
			Toast.makeText(getApplicationContext(), "Vybraný okruh: "+VybranyNazov, Toast.LENGTH_LONG).show();

			if(VybranyNazov.equals(" Informatika"))met=1;
			if(VybranyNazov.equals(" Mestá"))met=2;
			if(VybranyNazov.equals(" Zvierata"))met=3;
			if(VybranyNazov.equals(" Autá"))met=4;

			Intent inte = new Intent(this, game.class);
			inte.putExtra("VybranaMetoda", met);
			startActivity(inte);
			finish();
		}
			
		}
