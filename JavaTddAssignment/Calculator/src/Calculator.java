import static org.junit.jupiter.api.Assertions.assertThrows;

public class Calculator {
	int result;
	public Integer multiply1;
	public int add(int num1, int num2){
		return num1+num2;
		
	}
	//Method for subtraction
	public int substract(int num1, int num2){
		result = num1-num2;
		return result;
	}
	//Method for multiplication
	public int multiply(int num1, int num2){
		
		if(num1==0 || num2==0)
		{
			result=0;
		}
		
		else {
		
		result = num1*num2;
		}
		return result;
		
	}
	//Method for division
	public int divide(int num1, int num2){
		
		result = num1/num2;
		return result;
	}

	
}
