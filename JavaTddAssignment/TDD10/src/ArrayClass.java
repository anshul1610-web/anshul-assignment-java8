
public class ArrayClass 
{ 
		
	public String StringConcate(String [] str) {
		
		String temp = "";
		//String [] str = {"apple","orange","banana","lemon"};
		for(String array :str) {
			temp = temp+array+"-";
		}
      String Data = temp.substring(0, temp.length()-1);
      System.out.println(Data);	
      
	  return Data.toLowerCase();
	}
}
