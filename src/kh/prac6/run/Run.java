package com.kh.prac6.run;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int count = 1;
			int rNum = (int) (Math.random() * 10) + 1;
			System.out.println("1~10������ �������� �����Ǿ����ϴ�.");
			System.out.println("������ �ϳ� �Է��Ͻÿ� : ");
			while(true) {
				int num = sc.nextInt();
			if (rNum == num) {
				System.out.println(count + "�� ���� ���߼̽��ϴ�!");
				break;

			} else
				System.out.println(count + "�� �����ϼ̽��ϴ�!");
		count++;
			}
		}
	}

}
