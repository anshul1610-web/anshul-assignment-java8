//5. WAP to find the maximum length of given string without using any length function use 
//stream api. 


import java.util.Scanner;
import java.util.Arrays;
public class LengthOfString{
	public static void main(String args[]) {
		
		String str;
// 		Scanner scanner =new Scanner(System.in);
// 		System.out.println("Enter a String  ");
// 		String str= scanner.next();
// 		System.out.println(str.lastIndexOf(""));
		
		System.out.println(getLength("Dharmesh Rane"));
		
	

}
            	public static int getLength(String str)
            	{
            	    int i=0;
            	    try{
            	    
            	    while(true)
            	    {
            	        str.charAt(i);
            	        i++;
            	    }
            	    }
            	    catch(IndexOutOfBoundsException e)
            	    
            	    {
            	     return i;   
            	    }
            	}


}