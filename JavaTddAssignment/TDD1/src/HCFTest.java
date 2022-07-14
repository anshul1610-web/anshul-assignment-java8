import static org.junit.Assert.*;

import org.junit.Test;

public class HCFTest {

	@Test
	public void test() 
	{
		Main main = new Main();
		int num1 = 36;
		int num2 = 60;
		
		int expected = 12;
		
		int actual = main.ffindHCF(num1, num2);
		assertEquals(expected,actual);
	}
	
	
	

}
