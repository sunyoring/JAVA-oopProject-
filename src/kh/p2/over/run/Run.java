package com.kh.p2.over.run;

import com.kh.p2.over.child.model.vo.CoffeeShop;
import com.kh.p2.over.parent.model.vo.Shop;

public class Run {

	public static void main(String[] args) {
		Shop sh = new Shop("홍길동","수원시 인계동");
		System.out.println(sh); 
		// toString을 오버라이딩하는 이유 : 객체 명만 써도 자동으로 객체 내의 toString을 찾아 문자열로 출려해준다.
		
		sh.order("부모 메소드 >> ");
		
		CoffeeShop cs = new CoffeeShop("홍길동","수원시 인계동","아메리카노",2000,"스타벅스");
		
		cs.order("오버라이딩에 의한 자식 메소드 >> ");
	}

}
