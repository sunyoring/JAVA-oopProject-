package com.kh.prac4.model.vo;

public class Member {
	private String name; // 이름
	private int age; // 나이
	private char gender; // 성별
	private char bloodT; // 혈액형

	public Member() {
	}

	public Member(String name, int age, char gender, char bloodT) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bloodT = bloodT;
	}

	@Override	
	public boolean equals(Object obj) {
		Member m = (Member) obj;
		if(m.gender == gender && m.bloodT == bloodT)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age +
				", 성별 : " + gender + ", 혈액형 : " + bloodT;
	}
}