package Q5_TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PythagorasTest {

	@Test
	void test() {
		Pythagoras test=new Pythagoras();
//		int arr[] = {10, 4,12,};    //not setisfied
         int arr[] = { 3, 4, 5,  }; //satisfy
		int n = arr.length;
		 boolean output=test.checkTriplet(arr, n);
		assertEquals(true,output);
 
	}

	 

}
