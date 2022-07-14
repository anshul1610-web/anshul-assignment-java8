package com.yash.shapes;

import java.util.Scanner;

public class Circle  {
	 
	private int id;  
	private String name;  
	private int sal;
	public Circle() {}
	public Circle(int id)
	{
		this.id=id;
	}
	
	public Circle(int sal) {
		super();
		this.sal = sal;
	}
	
	public Circle(String name)
	{
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	
	@Override
//	public double areaOfShape() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Radius of circle: ");
//		double r=sc.nextDouble();
//		sc.close();
//		return r*r*(22/7);
//	}
//
//	@Override
//	public double sidesOfShape() {
//		return Double.POSITIVE_INFINITY;
//	}

}
