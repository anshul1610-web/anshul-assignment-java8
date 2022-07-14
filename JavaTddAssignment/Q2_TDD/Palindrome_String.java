package Q2_TDD;

public class Palindrome_String {
	
	public String Palindrome(String string) {
		
		String  reverseStr = "";
	    
	    int strLength = string.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + string.charAt(i);
	    }

 
		return string;
		
	}

}
