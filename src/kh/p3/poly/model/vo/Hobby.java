package com.kh.p3.poly.model.vo;

public class Hobby {
	int spendTime; // ���ڽð�(��)
	int spendMoney;// ���ڱݾ�(����)
	
	public Hobby() {};
	
	public Hobby(int spendTime,int spendMoney) {
		this.spendMoney = spendMoney;
		this.spendTime = spendMoney;
	}
	
	@Override
	public String toString() {
		return "�� ��̸� ���� ������ �ð��� " + spendTime + "��, ������ �ݾ��� " + spendMoney+"�����̴�.";
		
	}
	public void print() {
		System.out.println("�� ��̸� ���� ������ �ð��� " + spendTime + "��, ������ �ݾ��� " + spendMoney+"�����̴�.");
	}

}
