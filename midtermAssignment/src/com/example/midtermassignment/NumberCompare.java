package com.example.midtermassignment;

import android.R.id;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NumberCompare extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		 final Button computeButton = (Button) findViewById((Integer) R.id.button2);
         computeButton.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
             //CALL COMPUTATION METHOD TO FIND THE LARGEST INTEGER
            	 Num.Compute();
             }
         });
         
         final Button resetButton = (Button) findViewById((Integer) R.id.button1);
         resetButton.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
             //CALL RESET METHOD TO CLEAR FIELDS
            	 Num.Reset();
             }
         });
         
         final Button quitButton = (Button) findViewById((Integer) R.id.button3);
         quitButton.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
             //QUIT PROGRAM
            	 Num.Quit();
             }
         });

	}
	
	
	public static class Num {
		
		//This is the bitch class where the program gets laid
				public static void Compute(){
										

					
		}
		
				public static void Reset(){
			
		}
		
				public static void Quit(){
			
		}
		
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.number_compare, menu);
		return true;
	}
}
