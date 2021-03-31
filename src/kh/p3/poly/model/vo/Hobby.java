package com.kh.p3.poly.model.vo;

public class Hobby {
	int spendTime; // 투자시간(년)
	int spendMoney;// 투자금액(만원)
	
	public Hobby() {};
	
	public Hobby(int spendTime,int spendMoney) {
		this.spendMoney = spendMoney;
		this.spendTime = spendMoney;
	}
	
	@Override
	public String toString() {
		return "이 취미를 위해 투자한 시간은 " + spendTime + "년, 투자한 금액은 " + spendMoney+"만원이다.";
		
	}
	public void print() {
		System.out.println("이 취미를 위해 투자한 시간은 " + spendTime + "년, 투자한 금액은 " + spendMoney+"만원이다.");
	}

}
