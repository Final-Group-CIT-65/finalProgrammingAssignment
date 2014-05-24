package com.example.finalprogrammingassignment;

public class CalculationEngine {
	
	
	public final boolean DEBUG = false;
	
	
	
	
	public int index;
	public int recursionLevel;
	
	
	//Constructor
	public CalculationEngine(){
		recursionLevel = 0;
	}
	
	public String doCalc(String expression){
		expression=this.calculate(expression);
		recursionLevel=0;
		return expression;
	}
	
	public String calculate(String expression){
		// Modify the expression string here. //
		// Create functions for different operators or perhaps 
			// you can use this as a non-recursive shell for a 
			// recursive expression-solving function. //
		
		//Finally, convert the result back to a string and return it. //
		//(I am temporarily returning expression, but a different string may be returned) //
	    //double num1, num2, answer;
		int index=0;
		
	    
		if(recursionLevel%2 == 0){
			expression=this.multiply(expression, index);
			expression=this.divide(expression, index);
			expression=this.add(expression, index);
			expression=this.subtract(expression, index);
		}
		else{
			
			expression=this.add(expression, index);
			expression=this.subtract(expression, index);
			expression=this.multiply(expression, index);
			expression=this.divide(expression, index);
		}
		
		recursionLevel++;
		/*
		
		
		index = expression.lastIndexOf("+");
		if(index != -1)
		{
			System.out.print(expression + "=");
		    if(index == 0) num1 = 0;
		    else num1 = Double.parseDouble(this.calculate(expression.substring(0, index)));
		    if(index == expression.length() - 1) num2 = 0;
		    else num2 = Double.parseDouble(this.calculate(expression.substring(index + 1)));
		    answer = num1 + num2;
		    expression = String.valueOf(answer);
		    
		    System.out.println(expression);
		}
		
		index = expression.lastIndexOf("-");
		if(index != -1)
		{
			System.out.print(expression + "=");
		    if(index == 0) num1 = 0;
		    else num1 = Double.parseDouble(this.calculate(expression.substring(0, index)));
		    if(index == expression.length() - 1) num2 = 0;
		    else num2 = Double.parseDouble(this.calculate(expression.substring(index + 1)));
		    answer = num1 - num2;
		    expression = String.valueOf(answer);
		    
		    System.out.println(expression);
		}
		
		
		index = expression.lastIndexOf("*");
		if(index != -1)
		{
			System.out.print(expression + "=");
		    if(index == 0) num1 = 1;
		    else num1 = Double.parseDouble(this.calculate(expression.substring(0, index)));
		    if(index == expression.length() - 1) num2 = 1;
		    else num2 = Double.parseDouble(this.calculate(expression.substring(index + 1)));
		    answer = num1 * num2;
		    expression = String.valueOf(answer);
		    
		    System.out.println(expression);
		}
		
		index = expression.lastIndexOf("/");
		if(index != -1)
		{
			System.out.print(expression + "=");
		    if(index == 0) num1 = 1;
		    else num1 = Double.parseDouble(this.calculate(expression.substring(0, index)));
		    if(index == expression.length() - 1) num2 = 1;
		    else num2 = Double.parseDouble(this.calculate(expression.substring(index + 1)));
		    answer = num1 / num2;
		    expression = String.valueOf(answer);
		    
		    System.out.println(expression);
		}*/
		
		//expression = '=' + expression;
		
		
		//Returning expression, the original value modified by the function. 
		
		return expression; 
	}
	
	public String add(String expression, int index){
		index = expression.lastIndexOf("+");
		double num1, num2, answer;
		if(index != -1)
		{
			if(DEBUG)
				System.out.print(expression + "=");
		    if(index == 0) num1 = 0;
		    else num1 = Double.parseDouble(this.calculate(expression.substring(0, index)));
		    if(index == expression.length() - 1) num2 = 0;
		    else num2 = Double.parseDouble(this.calculate(expression.substring(index + 1)));
		    answer = num1 + num2;
		    expression = String.valueOf(answer);
		    if(DEBUG)
		    	System.out.println(expression);
		}
		return expression;
	}
	
	public String subtract(String expression, int index){
		index = expression.lastIndexOf("-");
		double num1, num2, answer;
		if(index != -1)
		{	
			if(DEBUG)
				System.out.print(expression + "=");
		    if(index == 0) num1 = 0;
		    else num1 = Double.parseDouble(this.calculate(expression.substring(0, index)));
		    if(index == expression.length() - 1) num2 = 0;
		    else num2 = Double.parseDouble(this.calculate(expression.substring(index + 1)));
		    answer = num1 - num2;
		    expression = String.valueOf(answer);
		    if(DEBUG)
		    	System.out.println(expression);
		}
		return expression;
	}
	
	public String multiply(String expression, int index){
		index = expression.lastIndexOf("*");
		double num1, num2, answer;
		if(index != -1)
		{
			if(DEBUG)
				System.out.print(expression + "=");
		    if(index == 0) num1 = 1;
		    else num1 = Double.parseDouble(this.calculate(expression.substring(0, index)));
		    if(index == expression.length() - 1) num2 = 1;
		    else num2 = Double.parseDouble(this.calculate(expression.substring(index + 1)));
		    answer = num1 * num2;
		    expression = String.valueOf(answer);
		    if(DEBUG)
		    	System.out.println(expression);
		}
		return expression;
	}
	
	public String divide(String expression, int index){
		index = expression.lastIndexOf("/");
		double num1, num2, answer;
		if(index != -1)
		{
			if(DEBUG)
				System.out.print(expression + "=");
		    if(index == 0) num1 = 1;
		    else num1 = Double.parseDouble(this.calculate(expression.substring(0, index)));
		    if(index == expression.length() - 1) num2 = 1;
		    else num2 = Double.parseDouble(this.calculate(expression.substring(index + 1)));
		    answer = num1 / num2;
		    expression = String.valueOf(answer);
		    if(DEBUG)
		    	System.out.println(expression);
		}
		return expression;
	}
	
}
