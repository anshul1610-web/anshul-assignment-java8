import static org.junit.Assert.*;

import org.junit.Test;

public class TestArray {

	@Test
	public void test1() 
	{
		
	   StringClass stringclass = new StringClass();
	   String  str = "This @ Red $car-";
	   String expected = "This Red car";
	   
	   String actual = stringclass.removeSpecialChar(str);
	   assertEquals(expected, actual);
	}
	
	
	@Test
	public void test2() 
	{
		
	   StringClass stringclass = new StringClass();
	   String  str = "This@# 6454 is My** Home%";
	   String expected = "This is My Home";
	   
	   String actual = stringclass.removeSpecialChar(str);
	   assertEquals(expected, actual);
	}

}
