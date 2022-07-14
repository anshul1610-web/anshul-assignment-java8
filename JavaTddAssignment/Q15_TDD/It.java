package Q15_TDD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Item {	
	    int itemId; 
	    String itemName; 
	    float costPrice; 
	    float sellPrice;
	    String mfd;
	    String exp;
		public Item(int itemId, String itemName, float costPrice, float sellPrice,String mfd,String exp) {
			super();
			this.itemId = itemId;
			this.itemName = itemName;
			this.costPrice = costPrice;
			this.sellPrice = sellPrice;
			this.mfd = mfd;
			this.exp = exp;
		}
		 
	   
	} 
  public class It{ 

	    public Item allitem(int itemId, String string, float costPrice, float sellPrice, String string2, String string3){ 

	        List<Item> list=new ArrayList<Item>(); 

	        list.add(new Item(101,"Samsung A",17000f,20000f,"12-06-2022","15-12-30")); 

	        list.add(new Item(102,"Iphone S",65000f,70000f,"12-06-2022","15-12-30")); 

	        list.add(new Item(103,"Sony Xperia",25000f,30000f,"12-06-2022","15-12-30")); 

	        list.add(new Item(104,"Nokia Lumia",15000f,20000f,"12-06-2022","15-12-30")); 

	        list.add(new Item(105,"Redmi ",26000f,40000f,"12-06-2022","15-12-30")); 

	        list.add(new Item(106,"Lenevo Vibe",19000f,30000f,"12-06-2022","15-12-30"));            

	        for(Item p:list){ 
	            System.out.println(p.itemId+" "+p.itemName+" "+p.costPrice+" "+p.sellPrice+" "+p.mfd+" "+p.exp); 
	        }
			return null;    


	    } 

	} 
