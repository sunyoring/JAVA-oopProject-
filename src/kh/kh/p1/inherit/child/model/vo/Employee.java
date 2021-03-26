package com.kh.p1.inherit.child.model.vo;

import com.kh.p1.inherit.parent.model.vo.Person;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {}
	
	public Employee(int salary, String dept) {
		this.salary = salary; //���� (���� ����)
		this.dept = dept;	//�μ�
	}
	public Employee(String name, int age, char gender, 
			String adrr,int salary, String dept) {
		super(name,age,gender,adrr);
		this.salary = salary;
		this.dept = dept;
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
	public String information() {
		return super.information() + " ���� : " + salary + " �μ� : " + dept;
	}
}