package Q3_TDD;

import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.Test;

 
class EmailPasswordTest {

 
	@Test
	void test() {
		EmailPassword test=new EmailPassword();
		String userName = "balram";
		String password = "sonu234";
		String output=test.isValidUserName(userName,password);
		assertEquals("true",output);
 
	}

	 

	 
}
