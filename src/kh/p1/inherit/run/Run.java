package com.kh.p1.inherit.run;

import com.kh.p1.inherit.child.model.vo.Computer;
import com.kh.p1.inherit.child.model.vo.Employee;
import com.kh.p1.inherit.child.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("�达");
		emp.setAge(17);
		emp.setSalary(200);

//		System.out.println(emp.getName());
//		System.out.println(emp.getAge());
//		System.out.println(emp.getSalary());

		Employee emp2 = new Employee("ȫ�浿", 30, 'M', "������", 2000, "������");
		System.out.println(emp2.information());
		
		Student stu = new Student("ȫ���", 20,'F',"ȭ����",1,"�ܽĻ����");
//		System.out.println(stu.information());

		Computer com = new Computer("i7-1234","SAMSUNG",1800);
		Student stu2 = new Student("ȫ���", 20,'F',"ȭ����",1,"�ܽĻ����",com);
		System.out.println(stu2.information());
	}
}
