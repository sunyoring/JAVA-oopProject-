package com.kh.p1.inherit.child.model.vo;

import com.kh.p1.inherit.parent.model.vo.Person;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {}
	
	public Employee(int salary, String dept) {
		this.salary = salary; //월급 (만원 단위)
		this.dept = dept;	//부서
	}
	
	public String getDept() {
		return dept; 
	}
	public int getSalary() {
		return salary;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
