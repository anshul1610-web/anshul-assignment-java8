import static org.junit.Assert.*;

import org.junit.Test;

public class TestArray {

	@Test
	public void test1() {
		
		ArrayClass arrayclass = new ArrayClass();
		
		String [] str = {"apple","orange","banana","lemon"};
		
		String expected = "apple-orange-banana-lemon";
		String actual = arrayclass.StringConcate(str);
		
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void test2() {
		
		ArrayClass arrayclass = new ArrayClass();
		
		String [] str = {"APPLE","ORANGE","BANANA","LEMON"};
		
		String expected = "apple-orange-banana-lemon";
		String actual = arrayclass.StringConcate(str);
		
		assertEquals(expected,actual);
	}
	
}
