package com.kh.p1.inherit.child.model.vo;

import com.kh.p1.inherit.parent.model.vo.Person;

public class Student extends Person{
	private int grade;
	private String major;
	
	private Computer com; // 컴퓨터 클래스를 스튜던트 클래스의 멤버변수로 쓸 수 있다.(포함관계)
							//상속관계와 다르다.
	
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
//		return"이름 : " + super.name + " 성별 : " + super.gender + " 나이 : " + super.age
//				+ " 주소 : " + super.addr 
		return super.information() + " 학년 : " + grade + " 전공 : " + major 
															+ com.information();
	}
}
