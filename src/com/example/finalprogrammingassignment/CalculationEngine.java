package com.example.finalprogrammingassignment;

public class CalculationEngine {
	
	//This variable is obviously used for debugging. 
	//It will be used to test if the calling object is functioning correctly. 
	public final boolean DEBUG_CREATE_OBJECT = true;
	
	//Constructor
	public CalculationEngine(){
		
	}
	
	public String calculate(String expression){
		// Modify the expression string here. //
		// Create functions for different operators or perhaps 
			// you can use this as a non-recursive shell for a 
			// recursive expression-solving function. //
		
		//Finally, convert the result back to a string and return it. //
		//(I am temporarily returning expression, but a different string may be returned) //
		
		if(DEBUG_CREATE_OBJECT){
			//This is a test to see if this method is being called correctly
			expression = '=' + expression;
			//PS - it is. 
		}
		
		//Temporarily returning expression
		return expression; 
	}
	
}
