package com.kh.prac2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class spaceUpper {

	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);

		System.out.print("영어를 입력하시오.(띄어쓰기 포함) : ");
		String str = sc.nextLine();
		StringTokenizer stk = new StringTokenizer(str, " ");
		StringBuilder sbu = new StringBuilder();

		while(stk.hasMoreTokens()) {
			String token = stk.nextToken();
			for(int i = 0; i < token.length(); i++) {
				if(i==0) 
					sbu.append(token.toUpperCase().charAt(i));
				else 
					sbu.append(token.charAt(i));					
			}
			sbu.append(" ");
		}
		System.out.println(sbu);
	}
}
