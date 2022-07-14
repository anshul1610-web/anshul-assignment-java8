package Q13_TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
	 Calculator test=new Calculator();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("choose as follow");
	 System.out.println("+ -> addition \n-  ->substraction \n* ->multipication \n/ ->divide \n% -> modulus \np ->power \ns -> Square \nc ->Cube");
	 System.out.println("Choose an operator: +, -, *, /, % ,p,s,c");
     char operator = sc.next().charAt(0);
	  
	 System.out.println("enter number 1");
	 double num1=sc.nextDouble();
	 System.out.println("enter number 2");
	 double num2=sc.nextDouble();
	 double output=test.calc(num1, num2,operator);
	 assertEquals(num1,num2,output);
	 
	}

}
