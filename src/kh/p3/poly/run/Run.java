package com.kh.p3.poly.run;

import com.kh.p3.poly.model.vo.Collecting;
import com.kh.p3.poly.model.vo.Hobby;
import com.kh.p3.poly.model.vo.ReadingBook;

public class Run {

	public static void main(String[] args) {
		Hobby h = new Hobby();
		Hobby upH = new Collecting(); //부모 클래스로 자식의 클래스를 다룰 수 있는 업 캐스팅
									//(Hobby)소괄호 생략 가능
		ReadingBook dwnR = (ReadingBook)(upH); //런타임 에러발생
		// 다운캐스팅이란 ? 자신의 고유한 특성을 잃은 자식 클래스의 객체를 다시 복구 시켜주는 것.
		// 업캐스팅된 것을 다시 원상태로 돌리는 것. (업캐스팅이 선행되어야 함)
		// (주의) : 부모클래스가 표현하고 있는 자식 클래스 자료형으로 해야함.
		
		//단순한 다형성 적용
		Hobby polyC = new Collecting();
		Hobby polyC2 = new Collecting(3, 100, "우표");
		Hobby polyRb1 = new ReadingBook(4, 200, 100);
		Hobby polyRb2 = new ReadingBook(5, 300, 200);
		Hobby polyC3 = new Collecting(6, 400, "도자기");
		
		//다형성 + 배열 적용
		Hobby[] polyArr = new Hobby[4];
		polyArr[0] = new Collecting(3, 100, "우표");
		polyArr[1] = new ReadingBook(4, 200, 100);
		polyArr[2] = new ReadingBook(5, 300, 200);
		polyArr[3] = new Collecting(6, 400, "도자기");
		
		//장점 : 여러 타입의 객체를 하나의 타입으로 관리가 가능 각각의 타입을 따로 정의하지 않아도 되므로 코드양이 그만큼 줄어든다.
	}

}
