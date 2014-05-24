package com.example.finalprogrammingassignment;



import com.example.finalprogrammingassignment.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;




public class SimpleCalc extends Activity {
	//For debugging, if you couldn't tell. 
	public final boolean DEBUG = false;
	
	//Output string
		//This variable is not final or constant because it is very much relevant to the entire program,
		//it is changed throughout the program,
		//and thus it's scope is global to the program. 
		//Excuse me while I beg the gods of good programming practices for forgiveness. 
	public String textOut = "";
	
	//For resetting the output string.
	public boolean isCalculated=false;
	
	//History list (list of output field strings after '=' is pressed). 
		//It is implemented as an array list.
	public ArrayList<String> historyList = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		//Final variables relevant to input and output. 
		
		//This is the object that is manipulated when the '=' button is pressed
		final CalculationEngine calcEng = new CalculationEngine();
		
		//Output field
		final TextView outputField = (TextView) findViewById((Integer)R.id.outputField);
		
		
		
		//File name for saving historyList 
		final String historyFileName = "history.list";
		
		//Buttons
		final Button buttonZero = (Button) findViewById((Integer) R.id.buttonZero);
		final Button buttonDecimal = (Button) findViewById((Integer)R.id.buttonDecimal);
		final Button buttonEquals = (Button) findViewById((Integer)R.id.buttonEquals);
		final Button buttonDivide = (Button) findViewById((Integer)R.id.buttonDivide);
		
		final Button buttonOne = (Button) findViewById((Integer)R.id.buttonOne);
	    final Button buttonTwo = (Button) findViewById((Integer)R.id.buttonTwo);
		final Button buttonThree = (Button) findViewById((Integer)R.id.buttonThree);
		final Button buttonMultiply = (Button) findViewById((Integer)R.id.buttonMultiply);
		
		final Button buttonFour = (Button) findViewById((Integer)R.id.buttonFour);
		final Button buttonFive = (Button) findViewById((Integer)R.id.buttonFive);
		final Button buttonSix = (Button) findViewById((Integer)R.id.buttonSix);
		final Button buttonSubtract = (Button) findViewById((Integer)R.id.buttonSubtract);
		
		final Button buttonSeven = (Button) findViewById((Integer)R.id.buttonSeven);
		final Button buttonEight = (Button) findViewById((Integer)R.id.buttonEight);
		final Button buttonNine = (Button) findViewById((Integer)R.id.buttonNine);
		final Button buttonAdd = (Button) findViewById((Integer)R.id.buttonAdd);
		
		final Button buttonReset = (Button) findViewById((Integer)R.id.buttonReset);
		final Button buttonDelete = (Button) findViewById((Integer)R.id.buttonDelete);
		
		//READS FILE CONTENTS INTO ARRAYLIST historyList
		try{ 
			FileInputStream fin = openFileInput(historyFileName);
			Scanner s = new Scanner(fin);
			historyList.clear();
			
			while (s.hasNext()){
			    historyList.add(s.next());
			    if(DEBUG)
					System.out.println(s.next());
			}
			s.close();
	    }catch(Exception e){
	    	System.out.println("File read exception.");
	    }//End try/catch 
		
		
		
		
		
		
		buttonZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	
            	checkIfCalculated();
            	// Append a '0' to the string //
            	textOut+='0';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonDecimal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	checkIfCalculated();
            	
            	// Append a '.' to the string //
            	textOut+='.';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonEquals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	// Call the calculation method of the calcEng object //     	
            	textOut = calcEng.doCalc(textOut);
            	
            	isCalculated = true;
           		outputField.setText(textOut);
           		
           		//APPEND textOut TO historyList HERE
           		historyList.add(textOut);
           		
           		//SAVE ARRAYLIST historyList TO FILE
           		try { //OUTPUT ROUTINE FOR HISTORY LIST FILE
        			FileOutputStream fout = openFileOutput(historyFileName, MODE_PRIVATE);
        			for(int i=0; i<=historyList.size()-1; i++){
        				
        				try {
							fout.write(historyList.get(i).getBytes());
							if(DEBUG)
								System.out.println(historyList.get(i).getBytes());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							if(DEBUG)
								System.out.println("Output file not saved");
							e.printStackTrace();
						}//end FIRST INNER try/catch
        				
        				try {
							fout.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							if(DEBUG)
								System.out.println("Output file not closed");
							e.printStackTrace();
						}//end SECOND INNER try/catch
        				
        			}//END FOR
        			
        		} catch (FileNotFoundException e) {
        			// TODO Auto-generated catch block
        			if(DEBUG)
						System.out.println("Output file not found");
        			e.printStackTrace();
        		}//end OUTERMOST try/catch
           		
           		
           		
           		
           		
           		if(DEBUG){
	           		for(int i=0; i<=historyList.size()-1; i++){
	           			System.out.println(historyList.get(i));
	           		}
           		}
           		
            }
        });
		
		buttonDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	checkIfCalculated();
            	// Append a '/' to the string //
            	textOut+='/';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	checkIfCalculated();
            	// Append a '1' to the string //
            	textOut+='1';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	checkIfCalculated();
            	// Append a '2' to the string //
            	textOut+='2';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	checkIfCalculated();
            	// Append a '3' to the string //
            	textOut+='3';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonMultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	checkIfCalculated();
            	// Append a '*' to the string //
            	textOut+='*';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	checkIfCalculated();
            	// Append a '4' to the string //
            	textOut+='4';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	checkIfCalculated();
            	// Append a '5' to the string //
            	textOut+='5';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	checkIfCalculated();
            	// Append a '6' to the string //
            	textOut+='6';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonSubtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	checkIfCalculated();
            	// Append a '-' to the string //
            	textOut+='-';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	checkIfCalculated();
            	// Append a '7' to the string //
            	textOut+='7';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	checkIfCalculated();
            	// Append a '8' to the string //
            	textOut+='8';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	checkIfCalculated();
            	// Append a '9' to the string //
            	textOut+='9';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	checkIfCalculated();
            	// Append a '+' to the string //
            	textOut+='+';
            	
           		outputField.setText(textOut);
            }
        });
		
		buttonReset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	// Clear the string //
            	textOut = "";
            	checkIfCalculated();
           		outputField.setText(textOut);
            }
        });
		
		buttonDelete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	// Remove last character from the string if string is not empty //
            	if(textOut.length()>=1)
            		textOut = textOut.substring(0, textOut.length() - 1);
            	isCalculated=false;
           		outputField.setText(textOut);
            }
        });
		
			
         

	}
	
	
	public void checkIfCalculated(){
		if(isCalculated){
    		textOut = "";
    		isCalculated = false;
    	}
	}
				
	

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
