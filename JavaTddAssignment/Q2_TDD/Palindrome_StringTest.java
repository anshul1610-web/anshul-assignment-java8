package Q2_TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Palindrome_StringTest {

	@Test
	void test() {
	 Palindrome_String test=new Palindrome_String();
	 String output=test.Palindrome("radar");
	 assertEquals("radar",output);
	  
	}

}
