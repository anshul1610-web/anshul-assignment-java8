package com.yash.tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;


class ItemTest {

	
	@Test
	public void whenItemIdIsLessThanThree()
	{
	    Throwable exception=assertThrows(IllegalArgumentException.class,()->{
	    	Item item=new Item();
	    	item.setItemid(13);
	    });
	    assertEquals("itemid should have 3 digits at least", exception.getMessage());
	}

	@Test
	public void whenItemNameDoesNotContainAlphabates()
	{
	
		Throwable exception=assertThrows(IllegalArgumentException.class, ()->{
			  Item item=new Item();
			  item.setItemname("mobile123");
		  });
		  assertEquals("item name must contain only alphabates", exception.getMessage());
	}
	
	@Test
	public void whenItemCostPriceIsNegative()
	{
	     Throwable exception=assertThrows(IllegalArgumentException.class,()->{
			Item item=new Item();
			item.setCost_price(-23000);
		});
	     assertEquals("cost price can't be negative", exception.getMessage());
	}
	
	@Test
	public void WhenItemSellingPriceIsNegative()
	{
	   Throwable exception =assertThrows(IllegalArgumentException.class,()->{
	    	Item item=new Item();
	    	item.setSell_price(-2456);
	    });
		assertEquals("selling price can't be negative", exception.getMessage());
	}
	
	@Test
	public void WhenCostPriceAndSellingPriceAreSame() 
	{
		Throwable exception=assertThrows(IllegalArgumentException.class,()->{
			Item item=new Item();
			item.setCost_price(23000);
			item.setSell_price(23000);
			
		});
		assertEquals("cost price and selling price can't be same", exception.getMessage());
	}
	
	@Test
	public void whenItemExpiringDateIsToday()
	{
		LocalDate todaydate=LocalDate.now();
		Throwable exception=assertThrows(IllegalArgumentException.class,()->{
			Item item=new Item();
			item.setExpiringDate(todaydate.toString());
		});
		assertEquals("expiringDate can't be today", exception.getMessage());
	}
	
	@Test
	public void whenAllInputsAreValidToAddItem()
	{
		assertEquals("item added successfully", AddItem.addItem(101,"mobile" ,23000,25000,"2020-09-02","2022-03-02"));
		
	}
	
	
}
