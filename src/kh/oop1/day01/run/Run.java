package kh.oop1.day01.run;

import kh.oop1.day01.exam.Pet;

public class Run {

	public static void main(String[] args) {
//		Pet p = new Pet();
		//Pet class�� instanceȭ �Ͽ� ��ü�� 3�� ������.
		Pet p1 = new Pet("�νõ�","������",1);
		Pet p2 = new Pet("�����","�Ͼ���",2);
		Pet p3 = new Pet("ī����","����",3);
		
		System.out.println("�� ���� : " + p1.getPetType());
		System.out.println("�� �̸� : " + p1.getPetName());
		System.out.println("�� ���� : " + p1.getPetAge());
		
		System.out.println("�� ���� : " + p2.getPetType());
		System.out.println("�� �̸� : " + p2.getPetName());
		System.out.println("�� ���� : " + p2.getPetAge());
		
		System.out.println("�� ���� : " + p3.getPetType());
		System.out.println("�� �̸� : " + p3.getPetName());
		System.out.println("�� ���� : " + p3.getPetAge());

	}
}
