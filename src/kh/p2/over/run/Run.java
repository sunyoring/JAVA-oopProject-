package com.kh.p2.over.run;

import com.kh.p2.over.child.model.vo.CoffeeShop;
import com.kh.p2.over.parent.model.vo.Shop;

public class Run {

	public static void main(String[] args) {
		Shop sh = new Shop("홍길동", "수원시 인계동");
		System.out.println(sh);
		// toString을 오버라이딩하는 이유 : 객체 명만 써도 자동으로 객체 내의 toString을 찾아 문자열로 출려해준다.

		sh.order("부모 메소드 >> ");

		CoffeeShop cs = new CoffeeShop("홍길동", "수원시 인계동", "아메리카노", 2000, "스타벅스");

		cs.order("오버라이딩에 의한 자식 메소드 >> ");

		CoffeeShop cs2 = new CoffeeShop("핫초코", 3000, "커피빈");
		CoffeeShop cs3 = new CoffeeShop("핫초코", 3000, "커피빈");

		// hashCode : 객체의 주소값을 정수형으로 변환
		System.out.println(cs2.hashCode());
		System.out.println(cs3.hashCode());
		// 두 객체는 주소값이 다르다.

		// equals메소드를 오버라이딩하여 주소값이 다른 두 객체 내부의 값이 같다면 true를 반환하도록 한다.

		System.out.println("equals의 비교 결과 : " + cs2.equals(cs3));

		CoffeeShop cs4 = null;

		// 객체를 복사해주는 clone메소드
		// protected Object clone()을 상속관계가 아닌 CoffeeShop과 Run메소드에서
		// 사용할수 있도록 public으로 바꿔서 재정의
		/*
		 * @Override
		 * 
		 * public CoffeeShop clone() { return this; }
		 */
		cs4 = cs2.clone();
		System.out.println(cs2);
		System.out.println(cs4);

	}

}
