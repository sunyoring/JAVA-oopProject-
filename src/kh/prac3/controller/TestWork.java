package com.kh.prac3.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestWork {
// "J a v a P r o g r a m" ���ڿ��� ���� ������ ��ū ó���Ͽ� char[]�� �����Ͽ� ����Ѵ�.
// ������ ���� ��� String���� �ٲ� �� �빮�ڷ� ��ȯ�Ͽ� ����Ѵ�.
	public TestWork() {
	}

	Scanner sc = new Scanner(System.in);

	public void afterToken(String str) {
		System.out.println("��ū ó�� �� ���� : " + str);
		System.out.println("��ū ó�� �� ���� : " + str.length());
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();

		int token = st.countTokens();
		// countToken : ���� �����ִ� ��ū�� ����
		// ��ū�� �ϳ��� �������� �Ʒ� while�� ���� �����ϸ� ��ū�� �� ������ ��� �ִ�.
		while (st.hasMoreTokens()) { // hashMoreTokens : ���� �ִ� ��ū�� �ִ��� ����
			sb.append(st.nextToken()); // nextToken : ��ū�� �ϳ��� ������.
		}
		System.out.println("��ū ó�� �� ���� : " + sb);
		System.out.println("��ū ó�� �� ���� : " + token);// or sb.length()�� ���
		System.out.println("��� �빮�ڷ� ��ȯ : " + sb.toString().toUpperCase());
	}

	public void findChar() {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb2 = new StringBuilder();

		System.out.println("���ڿ��� �Է��Ͻÿ�.");
		String str = sc.nextLine();

		// ù���ڸ� �빮�ڷ� �ٲٱ�
		for (int i = 0; i < str.length(); i++) {
			if (i == 0)
				sb2.append(str.toUpperCase().charAt(i));
			else
				sb2.append(str.charAt(i));
		}
		System.out.println("ù ���� �빮�ڷ� ��ȯ : " + sb2);
		System.out.println("ã�� ���� �ϳ��� �Է��Ͻÿ�.");
		char ch = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < sb2.length(); i++) {
			if (sb2.charAt(i) == ch)
				count++;
		}
		System.out.println(ch + "���ڰ� �� ���� : " + count);
	}

}
