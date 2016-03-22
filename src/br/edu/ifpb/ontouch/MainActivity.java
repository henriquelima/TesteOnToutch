package br.edu.ifpb.ontouch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnTouchListener{
	
	TextView txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txt = (TextView) findViewById(R.id.textID);
		txt.setOnTouchListener(this);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		switch(event.getAction()){
		
			//Primeiro Movimento 
			case MotionEvent.ACTION_DOWN:{	
				txt.setText("Ativando um envento Touch!");
				Toast toast = Toast.makeText(this,"Ativando um envento Touch!",Toast.LENGTH_SHORT);
				toast.show();
				break;
			}
				
			
			//Deslizando o dedo sobre a tela
			case MotionEvent.ACTION_MOVE:{
				txt.setText("Deslizando!");
				Toast toast = Toast.makeText(this,"Deslizando!",Toast.LENGTH_SHORT);
				toast.show();	
				break;
			}		
				
			
			//Retirando o dedo da tela
			case MotionEvent.ACTION_UP:{
				txt.setText("Retirando o dedo da tela!");
				Toast toast = Toast.makeText(this,"Retirando o dedo da tela!",Toast.LENGTH_SHORT);
				toast.show();
				break;
			}
		}
	
		return true;
	}

	
}
