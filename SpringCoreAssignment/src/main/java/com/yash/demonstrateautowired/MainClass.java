package com.yash.demonstrateautowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext(
					"com/yash/demonstrateautowired/applicationContext.xml");

			Employee employee1 = (Employee) ctx.getBean("employee");
			employee1.setEmpId(001);
			employee1.setEmpName("Guri");
			employee1.setEmpSalary(23000);
			empList.add(employee1);
			
			Employee employee2= (Employee) ctx.getBean("employee");
			employee2.setEmpId(002);
			employee2.setEmpName("Akash");
			employee2.setEmpSalary(45000);
			empList.add(employee2);
			
			
			Employee employee3 = (Employee) ctx.getBean("employee");
			employee3.setEmpId(003);
			employee3.setEmpName("Amay");
			employee3.setEmpSalary(26000);
			empList.add(employee3);
		
			List<Employee> empSortedList=empList.stream().sorted(Comparator.comparing(Employee::getEmpSalary)).collect(Collectors.toList());
			System.out.println(empSortedList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
