package com.kh.prac1.controller;

public class StrCon {

	public void strMethod() {
		String str1 = "무궁화 꽃이 피었습니다"; //리터럴 방식1
		String str2 = new String("무궁화 꽃이 피었습니다"); //new연산자 활용
		String str3 = new String("동해물과 백두산이");
		String str4 = "무궁화 꽃이 피었습니다"; //리터럴 방식2

		//리터럴방식의 String은 따로 한 공간에 저장된다. 
			
		System.out.println("=======hashCode비교======="); //String에 있어서는 주소값이 아니다.
		System.out.println("str1 : " + str1.hashCode());//같은 문자열은 hashCode값이 같다.
		System.out.println("str2 : " + str2.hashCode());
		System.out.println("str3 : " + str3.hashCode());
		System.out.println("str4 : " + str4.hashCode());

		System.out.println("=====identityHashCode비교======"); //메모리상의 주소값
		System.out.println("str1 : " + System.identityHashCode(str1));
		System.out.println("str2 : " + System.identityHashCode(str2));
		System.out.println("str3 : " + System.identityHashCode(str3));
		System.out.println("str4 : " + System.identityHashCode(str4));

	}

}
