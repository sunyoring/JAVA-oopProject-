package com.kh.p2.over.child.model.vo;

import com.kh.p2.over.parent.model.vo.Shop;

public class CoffeeShop extends Shop {
	private String coffeeName; // 커피 이름
	private int price; // 가격
	private String shopName; // 가게 이름

	public CoffeeShop() {
	}

	public CoffeeShop(String coffeeName, int price, String shopName) {
		this.coffeeName = coffeeName;
		this.price = price;
		this.shopName = shopName;
	}

	public CoffeeShop(String owner, String address, String coffeeName, int price, String shopName) {
		super(owner, address);
		this.coffeeName = coffeeName;
		this.price = price;
		this.shopName = shopName;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	@Override
	public String toString() {
		return "커피명 : " + coffeeName + ", 가격 : " + price + ", 가게명 : " + shopName;
	}

	@Override
	public void order(String str) {
		System.out.println(str + super.getOwner() + "씨가 " + super.getAddress() + "에서 운영하는 " + shopName + "에서 " + price
				+ "원을 주고 " + coffeeName + "를 주문한다.");
	}

// 객체 내부의 값을 모두 비교해 동일 값을 가진 객체를 판별하는 메소드 : (equals 오버라이딩)
// 기본 equals 메소드의 코드를 보면 객체 자체를 관계 연산자(==)로 비교한다. 
// 따라서 내부적으로 같은 값을 가진 객체 2개라도 다른 메모리 주소를 가지기 때문에 서로 다른 값으로 인식한다.
	@Override

	public boolean equals(Object obj) {
		CoffeeShop cs = (CoffeeShop) obj;
		if (this.coffeeName == cs.coffeeName && this.price == cs.price && this.shopName == cs.shopName)
			return true;
		else
			return false;
	}

	@Override
// public CoffeeShop(반환형) clone()
	public CoffeeShop clone() {
//		return this; 또는 새로운 객체를 만들어서 return해줘도 가능.
		return new CoffeeShop(coffeeName, price, shopName);
	}

}
