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
}
