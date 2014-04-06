package com.example.midtermassignment;

import android.R.id;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NumberCompare extends Activity {

	//Variables relevant to input
	
	//Buttons
	public Button ComputeButton;
	public Button ResetButton;
	public Button QuitButton;
	
	//User input text fields
	private EditText editText1;
	private EditText editText2;
	private EditText editText3;
	
	// Integer values of input strings
	int Field1_Int;
	int Field2_Int;
	int Field3_Int;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		 final Button computeButton = (Button) findViewById((Integer) R.id.button2);
         computeButton.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
             //CALL COMPUTATION METHOD TO FIND THE LARGEST INTEGER
            	 if(Integer.toString(R.id.editText1) != null && Integer.toString(R.id.editText2) != null && Integer.toString(R.id.editText3) != null){
            		 
            	 System.out.println("Testing 123");
            	 Compute();
            	 
            	 }
            	 else{
            		 
            		 Toast.makeText(getBaseContext(), "Please fill out all three fields!",
								Toast.LENGTH_LONG).show();
            	 }
             }
         });
         
         final Button resetButton = (Button) findViewById((Integer) R.id.button1);
         resetButton.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
             //CALL RESET METHOD TO CLEAR FIELDS
            	 Reset();
             }
         });
         
         final Button quitButton = (Button) findViewById((Integer) R.id.button3);
         quitButton.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
             //QUIT PROGRAM
            	 Quit();
             }
         });
         
         

	}
	
	

	
				
				//This method is called after Reset is pressed
						public void Reset(){
			
					}
				
				
				
				//This method is called after Quit is pressed
						public void Quit(){

							}
	
					
				
					
			public void Compute(){
				
					//Acquire user input from editText form widgets (SORRY FOR AMBIGUOUS SAMENAME, I JUST CAUGHT IT)	
					editText1 = (EditText) findViewById(R.id.editText1);
					editText2 = (EditText) findViewById(R.id.editText2);
					editText3 = (EditText) findViewById(R.id.editText3);
					
					// Assigns input to string values.
					String Field1 = editText1.getText().toString();
					
					
					String Field2 = editText2.getText().toString();
					
					
					String Field3 = editText3.getText().toString();
					
					//Protip: Make sure to refer to these variables by their given integer values and not their string values.
					
						//Checks if strings are of appropriate length and then parses them to three separate integers.
						 Field1_Int = Integer.parseInt(Field1);
						 Field2_Int = Integer.parseInt(Field2);
						 Field3_Int = Integer.parseInt(Field3);
						 
						 
							//PUT THE SORTING THING HERE
							
							//This collects the three numbers and spits them out in a toast notification.
							String TextCompilation = ("Your nums are "+Field1_Int+", "+Field2_Int+", and "+Field3_Int);
							
							Toast.makeText(getBaseContext(), TextCompilation,
									Toast.LENGTH_LONG).show();
							
		
							
						//	int LargestNumber = LARGEST NUMBER AS DETERMINED BY SORTING ALGORITHM;
							
							final TextView mTextView = (TextView) findViewById(R.id.textView4);
						mTextView.setText(String.valueOf(Field3_Int));
					
					
					
			
					
		}
		
				
	

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.number_compare, menu);
		return true;
	}
}
