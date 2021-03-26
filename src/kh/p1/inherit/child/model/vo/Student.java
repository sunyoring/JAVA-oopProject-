package com.kh.p1.inherit.child.model.vo;

import com.kh.p1.inherit.parent.model.vo.Person;

public class Student extends Person{
	private int grade;
	private String major;
	
	private Computer com; // ��ǻ�� Ŭ������ ��Ʃ��Ʈ Ŭ������ ��������� �� �� �ִ�.(���԰���)
							//��Ӱ���� �ٸ���.
	
	public Student() {}
	
	public Student(int grade, String major) {
		this.grade = grade;
		this.major = major;
	}
	public Student(String name, int age, char gender, 
			String adrr,int grade, String major) {
		super(name,age,gender,adrr);
		this.grade = grade;
		this.major = major;
	}
	public Student(String name, int age, char gender, 
			String adrr,int grade, String major, Computer com) {
		super(name,age,gender,adrr);
		this.grade = grade;
		this.major = major;
		this.com = com;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	public String information() {
//		return"�̸� : " + super.name + " ���� : " + super.gender + " ���� : " + super.age
//				+ " �ּ� : " + super.addr 
		return super.information() + " �г� : " + grade + " ���� : " + major 
															+ com.information();
	}
}
