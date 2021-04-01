package com.kh.prac5.run;

import java.util.Scanner;

import com.kh.prac5.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Book b = new Book("KH자바강의", 12000, "API마스터", "KH");
		Book copyBk = b.clone();
		
		System.out.println("가격 입력 전 >> " + copyBk);

		System.out.println("책의 가격을 입력하시오 >> ");
		copyBk.setPrice(sc.nextInt());

		System.out.println("가격 입력 후 >> " + copyBk);

	}

}
