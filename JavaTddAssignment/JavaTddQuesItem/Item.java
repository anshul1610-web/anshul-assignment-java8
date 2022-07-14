package com.yash.tdd;

import java.time.LocalDate;
import java.util.Date;

public class Item {
	
private int itemid;
private String itemname;
private float cost_price;
private float sell_price;
private LocalDate manufacturingDate;
private LocalDate  expiringDate;



public Item() {
	super();
	
}



@Override
public String toString() {
	return "Item [itemid=" + itemid + ", itemname=" + itemname + ", cost_price=" + cost_price + ", sell_price="
			+ sell_price + ", manufacturingDate=" + manufacturingDate + ", expiringDate=" + expiringDate + "]";
}



public int getItemid() {
	return itemid;
}
public void setItemid(int itemid) {
	String iid=String.valueOf(itemid);
	if(iid.length()<3)
		throw new IllegalArgumentException("itemid should have 3 digits at least");
	this.itemid = itemid;
}
public String getItemname() {
	return itemname;
}
public void setItemname(String itemname){
   boolean flag	=itemname.matches("[a-zA-Z]+");
	if(!flag)	
		throw new IllegalArgumentException("item name must contain only alphabates");
	this.itemname = itemname;
}
public float getCost_price() {
	return cost_price;
}
public void setCost_price(float cost_price) {
	if(cost_price<0)
	  throw new IllegalArgumentException("cost price can't be negative") ;
	this.cost_price = cost_price;
}
public float getSell_price() {
	return sell_price;
}

public void setSell_price(float sell_price) {
	if(sell_price<0)
	{	
		throw new IllegalArgumentException("selling price can't be negative");
	}
	else if(cost_price==sell_price)
	{
		throw new IllegalArgumentException("cost price and selling price can't be same");
	}
	this.sell_price = sell_price;
}

public LocalDate getManufacturingDate() {
	return manufacturingDate;
}
public void setManufacturingDate(String date) {
	LocalDate manufacturingDate=LocalDate.parse(date);
	this.manufacturingDate = manufacturingDate;
}
public LocalDate getExpiringDate() {
	return expiringDate;
}
public void setExpiringDate(String date) {
 	LocalDate todaydate=LocalDate.now();
 	LocalDate expiringDate=LocalDate.parse(date);
 	if(todaydate.equals(expiringDate))
 	{
 		throw new IllegalArgumentException("expiringDate can't be today");
 	}	
 	else
 	{
 		this.expiringDate = expiringDate;
 		
 	}		
}








}
