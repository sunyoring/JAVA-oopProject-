package com.kh.prac5.run;

import java.util.Scanner;

import com.kh.prac5.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Book b = new Book("KH�ڹٰ���", 12000, "API������", "KH");
		Book copyBk = b.clone();
		
		System.out.println("���� �Է� �� >> " + copyBk);

		System.out.println("å�� ������ �Է��Ͻÿ� >> ");
		copyBk.setPrice(sc.nextInt());

		System.out.println("���� �Է� �� >> " + copyBk);

	}

}
