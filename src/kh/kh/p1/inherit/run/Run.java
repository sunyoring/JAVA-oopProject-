package com.kh.p1.inherit.run;

import com.kh.p1.inherit.child.model.vo.Employee;
import com.kh.p1.inherit.child.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("김씨");
		emp.setAge(17);
		emp.setSalary(200);

//		System.out.println(emp.getName());
//		System.out.println(emp.getAge());
//		System.out.println(emp.getSalary());

		Employee emp2 = new Employee("홍길동", 30, 'M', "수원시", 2000, "영업부");
		System.out.println(emp2.information());
		
		Student stu = new Student("홍길순", 20,'F',"화성시",1,"외식산업과");
		System.out.println(stu.information());

	}
}
