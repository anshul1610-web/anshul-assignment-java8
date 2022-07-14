package com.assignment.java8ArrayToMapSet;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args)
	{

		// create a list
		List<Employee> lt = new ArrayList<>();

		// add the member of list
		lt.add(new Employee(1, "anuj"));
		lt.add(new Employee(2, "Dharmesh"));
		lt.add(new Employee(3, "Vikas"));
		lt.add(new Employee(4, "Kashi"));
		lt.add(new Employee(5, "Ravi"));
		lt.add(new Employee(6, "Vijay"));
		lt.add(new Employee(7, "Harshal"));
		lt.add(new Employee(8, "Rahul"));
		lt.add(new Employee(9, "Atul"));

		// create map with the help of
		// Collectors.toMap() method
		LinkedHashMap<Integer, String>
			map = lt.stream()
					.collect(
						Collectors
							.toMap(
									Employee::getId,
									Employee::getName,
								(x, y)
									-> x + ", " + y,
								LinkedHashMap::new));

		// print map
		map.forEach(
			(x, y) -> System.out.println(x + "=" + y));
	}
}
