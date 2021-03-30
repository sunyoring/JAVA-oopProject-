package com.kh.prac4.model.vo;

public class Member {
	private String name; // �̸�
	private int age; // ����
	private char gender; // ����
	private char bloodT; // ������

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
		return "�̸� : " + name + ", ���� : " + age +
				", ���� : " + gender + ", ������ : " + bloodT;
	}
}