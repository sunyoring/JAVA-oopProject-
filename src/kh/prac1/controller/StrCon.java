package com.kh.prac1.controller;

public class StrCon {

	public void strMethod() {
		String str1 = "����ȭ ���� �Ǿ����ϴ�"; //���ͷ� ���1
		String str2 = new String("����ȭ ���� �Ǿ����ϴ�"); //new������ Ȱ��
		String str3 = new String("���ع��� ��λ���");
		String str4 = "����ȭ ���� �Ǿ����ϴ�"; //���ͷ� ���2

		//���ͷ������ String�� ���� �� ������ ����ȴ�. 
			
		System.out.println("=======hashCode��======="); //String�� �־�� �ּҰ��� �ƴϴ�.
		System.out.println("str1 : " + str1.hashCode());//���� ���ڿ��� hashCode���� ����.
		System.out.println("str2 : " + str2.hashCode());
		System.out.println("str3 : " + str3.hashCode());
		System.out.println("str4 : " + str4.hashCode());

		System.out.println("=====identityHashCode��======"); //�޸𸮻��� �ּҰ�
		System.out.println("str1 : " + System.identityHashCode(str1));
		System.out.println("str2 : " + System.identityHashCode(str2));
		System.out.println("str3 : " + System.identityHashCode(str3));
		System.out.println("str4 : " + System.identityHashCode(str4));

	}

}
