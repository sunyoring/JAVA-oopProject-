package com.kh.p1.inherit.run;

import com.kh.p1.inherit.child.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("±è¾¾");
		emp.setAge(17);
		emp.setSalary(200);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
	}

}
