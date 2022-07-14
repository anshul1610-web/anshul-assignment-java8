package Q15_TDD;

 
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class ItTest {

	@Test
	void test() {
 
		    
		int itemId = 0;
		It test=new It();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter item ID");
		itemId=sc.nextInt();
		if(itemId<100){
			fail("item it must have 3 digit number");
		}
		System.out.println("enter Cost price");
		float costPrice = sc.nextFloat();
		System.out.println("enter Selling price");
		float sellPrice = sc.nextFloat();
		
		if(costPrice==sellPrice) {fail("cost price and sell price should not be same");}
	
		Item output1=test.allitem(itemId,"opticals",costPrice,sellPrice,"15-06-2022","01-01-2023");
		
			assertEquals(itemId,"opticals",costPrice,sellPrice,"15-06-2022","01-01-2023",output1);
		}

	private void assertEquals(int itemId, String string, float costPrice, float sellPrice, String string2,
			String string3, Item output1) {
		// TODO Auto-generated method stub
		
	}
		
		
	
 

 
}
