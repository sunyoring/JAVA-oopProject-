package com.kh.prac6.run;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int count = 1;
			int rNum = (int) (Math.random() * 10) + 1;
			System.out.println("1~10사이의 랜덤수가 생성되었습니다.");
			System.out.println("정수를 하나 입력하시오 : ");
			while(true) {
				int num = sc.nextInt();
			if (rNum == num) {
				System.out.println(count + "번 만에 맞추셨습니다!");
				break;

			} else
				System.out.println(count + "번 실패하셨습니다!");
		count++;
			}
		}
	}

}
