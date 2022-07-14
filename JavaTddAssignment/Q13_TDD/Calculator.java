package Q13_TDD;

import java.util.Scanner;

public class Calculator {
	char operator;
	 Double number1, number2, result=(double) 1;
	 
	    
	public float calc(double number1,double number2,char operator) {
 
		switch (operator) {

	      // performs addition between numbers
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // performs division between numbers
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;
	      case '%':
		        result = number1 % number2;
		        System.out.println(number1 + " % " + number2 + " = " + result);
		        break;
	      case 'p':
		      for (double i = 1; i <= number2; i++)   
	  	      result = result * number1;
		      System.out.println(number1 + " power of" + number2 + " = " + result);
		       break;
		        
	      case 's':
   	  	      result = number1 * number1;
		      System.out.println( " square root of" + number1 + " = " + result);
		       break;
	      case 'c':
		      result = number1 * number1*number1;
		      System.out.println(" cube of" + number1 + " = " + result);
		       break;
		        
		       
	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
		return operator;

	    
	 
	 
	}
}
