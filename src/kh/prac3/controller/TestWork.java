package com.kh.prac3.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestWork {
// "J a v a P r o g r a m" 문자열을 공백 단위로 토큰 처리하여 char[]에 저장하여 출력한다.
// 저장한 값을 모두 String으로 바꾼 후 대문자로 변환하여 출력한다.
	public TestWork() {
	}

	Scanner sc = new Scanner(System.in);

	public void afterToken(String str) {
		System.out.println("토큰 처리 전 문자 : " + str);
		System.out.println("토큰 처리 전 갯수 : " + str.length());
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();

		int token = st.countTokens();
		// countToken : 현재 남아있는 토큰의 갯수
		// 토큰을 하나씩 꺼내오는 아래 while문 전에 선언하면 토큰의 총 갯수를 담고 있다.
		while (st.hasMoreTokens()) { // hashMoreTokens : 남아 있는 토큰이 있는지 여부
			sb.append(st.nextToken()); // nextToken : 토큰을 하나씩 꺼내옴.
		}
		System.out.println("토큰 처리 후 문자 : " + sb);
		System.out.println("토큰 처리 후 갯수 : " + token);// or sb.length()를 사용
		System.out.println("모두 대문자로 변환 : " + sb.toString().toUpperCase());
	}

	public void findChar() {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb2 = new StringBuilder();

		System.out.println("문자열을 입력하시오.");
		String str = sc.nextLine();

		// 첫글자를 대문자로 바꾸기
		for (int i = 0; i < str.length(); i++) {
			if (i == 0)
				sb2.append(str.toUpperCase().charAt(i));
			else
				sb2.append(str.charAt(i));
		}
		System.out.println("첫 글자 대문자로 변환 : " + sb2);
		System.out.println("찾을 문자 하나를 입력하시오.");
		char ch = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < sb2.length(); i++) {
			if (sb2.charAt(i) == ch)
				count++;
		}
		System.out.println(ch + "문자가 들어간 갯수 : " + count);
	}

}
