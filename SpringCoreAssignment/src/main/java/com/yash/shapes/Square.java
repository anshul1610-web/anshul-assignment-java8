package com.yash.shapes;

import java.util.Scanner;

public class Square implements Shape {

	@Override
	public double areaOfShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of square : ");
		double a=sc.nextDouble();
		sc.close();
		return a*a;
	}

	@Override
	public double sidesOfShape() {
		return 4;
	}

}
