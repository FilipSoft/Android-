package com.FilipSoft.sibenica;

import android.app.*;
import android.content.*;
import android.content.pm.*;
import android.os.*;
import android.view.animation.*;
import android.widget.*;

public class welcome extends Activity 
{
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
		
		
        // Nastavíme a spustíme animaci pro logo školy
        ImageView Imgvw_spsoa= (ImageView)findViewById(R.id.ImageView);
        Animation Anim_spsoalogo = AnimationUtils.loadAnimation(welcome.this, R.anim.welcome_sc);
        /* Animace se „aplikuje“ na imageView, což je ID našeho loga školy.
		 Veškeré potřebné nastavení pro samotnou animaci je v souboru welcome_sc */
        Imgvw_spsoa.startAnimation(Anim_spsoalogo); // spuštění samotné animace

        // Vytvoření druhého vlákna s časovačem, po uplynutí limitu je spuštěna další aktivita
        Thread Thrd_wlcmscrndelay = new Thread() {
			public void run() {
				try {
					sleep(3500);
					startActivity(new Intent(getApplicationContext(), menu.class));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				finally {
					finish();
				}
			}
        };
        Thrd_wlcmscrndelay.start();

	}
}
