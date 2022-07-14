// 6. WAP to create list of item price whose price is less than avg price of all item.

import java.util.Scanner;

public class PriceLessThanAverage {
	public static void main(String args[]) {
		
       	   private int avgPrice;

           private int totalPrice=0;

		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a Number  ");
		int n=scanner.nextInt();
		int number[]= new int[n];
		System.out.println("Enter "+ n +" numbers");
	    for(int i=0;i<n;i++)
	    {
	        number[i]=scanner.nextInt();
	    }
	
		for(int i=0;i<n;i++)
		{
		    
			totalPrice= totalPrice+ number[i];
			
		}
		avgPrice=totalPrice/n;
// 		System.out.print("average Price is"+"  "+avgPrice);
		System.out.println("Price is less than avgPrice");
		for(int i=0;i<n;i++)
		{
		    if(avgPrice> number[i])
		    {
		        System.out.println(number[i]);
		    }
		}
		
		
	}

}

