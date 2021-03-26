package com.kh.p1.inherit.child.model.vo;

import com.kh.p1.inherit.parent.model.vo.Person;

public class Student extends Person{
	private int grade;
	private String major;
	
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
		return"이름 : " + super.name + " 성별 : " + super.gender + " 나이 : " + super.age
				+ " 주소 : " + super.addr + " 학년 : " + grade + " 전공 : " + major;
	}
}
