package com.Function;

import java.util.Scanner;

import com.Controller.Main;
import com.Repo.Repository;
import com.entities.Beverages;
import com.entities.Cosmetics;

public class Functional {
   
	 public  void viewBeverages()
	  {   
		  System.out.println(">>>>>Beverages MENU");
		  System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
		  System.out.println();
		  for(Beverages b:Repository.beverage_list1) 
		  {
			  System.out.println("  " +b.getItem_id()+"  :  "+b.getItem_name()+"   :  "+b.getItem_price()+".00"+"    :    "+b.getItem_mfd()+"    :"+b.getItem_doe());
		      System.out.println();
		  }
              Main.menuUI();
     }
	 
	 public void getBevItemByName() {
		 System.out.println("Enter the First Letter");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine().toUpperCase();
		 
		 for(Beverages b : Repository.beverage_list1) {
			 
			 String name = b.getItem_name();
			 if(name.startsWith(str)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +b.getItem_id()+"  :  "+b.getItem_name()+"   :  "+b.getItem_price()+".00"+"    :    "+b.getItem_mfd()+"    :"+b.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 } 
		 }	 
	 }
	 
	 public void getBevItemByMFD() {
		 
		 System.out.println("Enter the mfd in formate abc/XXXX");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine().toUpperCase();
		 
		 for(Beverages b : Repository.beverage_list1) {
			 
			 String mfd = b.getItem_mfd();
			 if(mfd.equalsIgnoreCase(str)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +b.getItem_id()+"  :  "+b.getItem_name()+"   :  "+b.getItem_price()+".00"+"    :    "+b.getItem_mfd()+"    :"+b.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 }
			 
		 }
		 
		 
	 }
	 
	 
     public void getBevItemByDOE() {
		 
		 System.out.println("Enter the mfd in formate abc/XXXX");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine().toUpperCase();
		 
		 for(Beverages b : Repository.beverage_list1) {
			 
			 String doe = b.getItem_doe();
			 if(doe.equalsIgnoreCase(str)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +b.getItem_id()+"  :  "+b.getItem_name()+"   :  "+b.getItem_price()+".00"+"    :    "+b.getItem_mfd()+"    :"+b.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 }
			 
		 }
		 
		 
	 }
	 
 public void getBevItemByPriceRange() {
		 
		 System.out.println("Enter the starting price range from");
		 Scanner sc = new Scanner(System.in);
		 int range1 = sc.nextInt();
		 System.out.println("Enter the ending price range from");
		 int range2 = sc.nextInt();
		 	 
		 for(Beverages b : Repository.beverage_list1) {
			 
			 if((b.getItem_price()>range1) && (b.getItem_price()<range2)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +b.getItem_id()+"  :  "+b.getItem_name()+"   :  "+b.getItem_price()+".00"+"    :    "+b.getItem_mfd()+"    :"+b.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 }
			 
		 }
		 
		 
	 }
	 //***********************************************************************************************************************
	 public  void viewCosmetic()
	  {   
		  System.out.println(">>>>>Cosmetics MENU");
		  System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
		  System.out.println();
		  for(Cosmetics c:Repository.cosmetic_list2) 
		  {
			  System.out.println("  " +c.getItem_id()+"  :  "+c.getItem_name()+"   :  "+c.getItem_price()+".00"+"    :    "+c.getItem_mfd()+"    :"+c.getItem_doe());
		      System.out.println();
		  }
		  Main.menuUI();
     }
	 
	 
	 public void getCosItemByName() {
		 System.out.println("Enter the First Letter");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine().toUpperCase();
		 
		 for(Cosmetics c : Repository.cosmetic_list2) {
			 
			 String name = c.getItem_name();
			 if(name.startsWith(str)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +c.getItem_id()+"  :  "+c.getItem_name()+"   :  "+c.getItem_price()+".00"+"    :    "+c.getItem_mfd()+"    :"+c.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 }
			 
		 }
		 
	 }
	 
	 public void getCosItemByMFD() {
		 
		 System.out.println("Enter the mfd in formate abc/XXXX");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine().toUpperCase();
		 
		 for(Cosmetics c : Repository.cosmetic_list2) {
			 
			 String mfd = c.getItem_mfd();
			 if(mfd.equalsIgnoreCase(str)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +c.getItem_id()+"  :  "+c.getItem_name()+"   :  "+c.getItem_price()+".00"+"    :    "+c.getItem_mfd()+"    :"+c.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 }
			 
		 }
		 
		 
	 }
	 
	 
     public void getCosItemByDOE() {
		 
		 System.out.println("Enter the mfd in formate abc/XXXX");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine().toUpperCase();
		 
		 for(Cosmetics c : Repository.cosmetic_list2) {
			 
			 String doe = c.getItem_doe();
			 if(doe.equalsIgnoreCase(str)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +c.getItem_id()+"  :  "+c.getItem_name()+"   :  "+c.getItem_price()+".00"+"    :    "+c.getItem_mfd()+"    :"+c.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 }
			 
		 }
		 
		 
	 }
	 
 public void getCosItemByPriceRange() {
		 
		 System.out.println("Enter the starting price range from");
		 Scanner sc = new Scanner(System.in);
		 int range1 = sc.nextInt();
		 System.out.println("Enter the ending price range from");
		 int range2 = sc.nextInt();
		 	 
		 for(Cosmetics c : Repository.cosmetic_list2) {
			 
			 if((c.getItem_price()>range1) && (c.getItem_price()<range2)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +c.getItem_id()+"  :  "+c.getItem_name()+"   :  "+c.getItem_price()+".00"+"    :    "+c.getItem_mfd()+"    :"+c.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 }
			 
		 }
		 
		 
	 }
}
