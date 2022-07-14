//2. WAP to print distinct marks from the list of given marks.


import java.util.Scanner;

public class FindAverage {
	public static void main(String args[]) {
		
		
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
		       for( int j=0;j<i;j++)

			if(number[i]==number[j])
                         break;
                        if(i==j)
                         
		
		System.out.print("number are"+"  "+number[i]);
		

			
		}
		
		
		
	}

}

