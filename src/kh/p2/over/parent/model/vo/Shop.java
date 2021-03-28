package com.kh.p2.over.parent.model.vo;

public class Shop {
	private String owner; // 가게 주인
	private String address; // 가게주소
	
	public Shop() {}
	public Shop(String owner, String address) {
		this.owner = owner;
		this.address = address;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() { //객체가 가진 정보나 값을 스트링(문자열)으로 반환하는 toString메소드를 Object에서 오버라이딩해 쓴다.
		return "가게 주인 : " + owner + ", 가게 주소 : " + address;
	}
	
	public void order(String str) {
		System.out.println(str + owner + "씨가 "+ address + "에서 가게를 운영한다.");
	}
}
