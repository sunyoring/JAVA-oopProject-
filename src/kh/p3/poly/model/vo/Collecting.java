package com.kh.p3.poly.model.vo;

public class Collecting extends Hobby{
	private String stuff; //������ǰ
	
	public Collecting() {}
	public Collecting(String stuff) {
		this.stuff = stuff;
	}
	public Collecting(int spendTime, int spendMoney, String stuff) {
		super(spendTime,spendMoney);
		this.stuff = stuff;
	}
	
	public void colMethod() {
		System.out.println(super.toString() + "���� ��̷� ������ ��ǰ�� " + stuff +"�̴�.");
	}
	
	@Override
	public void print() {
		System.out.println(super.toString() + "���� ��̷� ������ ��ǰ�� " + stuff +"�̴�.");
	}
}
