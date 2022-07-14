package Q3_TDD;

public class EmailPassword {

	 public String isValidUserName(String name,String password){
 
	        String userName1 = "balram";
	        String pwd = "sonu234";
         if(name.equals(userName1) || password.equals(pwd)){
	            return "true";
	        }
         else 
         {
        	  return "false";
         }
	       
	    }
}
