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
		super(owner,address);
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
		System.out.println(str + super.getOwner() + "씨가 " + super.getAddress() + 
				"에서 운영하는 "+shopName+"에서 " + price +"원을 주고 " + coffeeName + "를 주문한다.");
	}
}
