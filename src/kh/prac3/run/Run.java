package com.kh.prac3.run;

import com.kh.prac3.controller.TestWork;

public class Run {

	public static void main(String[] args) {
		String str = "J a v a P r o g r a m";
		TestWork tw = new TestWork();

		System.out.println("======��ū ó���ϱ�======");
		tw.afterToken(str);

		System.out.println("=====���� ���� ã��=====");
		tw.findChar();
	}

}
