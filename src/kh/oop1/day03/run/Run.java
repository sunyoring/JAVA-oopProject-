package kh.oop1.day03.run;

import kh.oop1.day03.exam.FieldExam;

public class Run {
	public static void main(String[] args) {
		 // Ŭ������.������ �̿Ͱ��� ������� Ŭ���������� ȣ���Ѵ�.
			System.out.println(FieldExam.var1);
			System.out.println(FieldExam.method());
			
		//�ν��Ͻ����� ȣ�� : ��ü�� �����Ͽ� heap�޸� ������ ����� �� ȣ��ȴ�.
			FieldExam fe = new FieldExam();
			System.out.println(fe.var2);
			System.out.println(fe.method2()); //staticŰ������ �޼ҵ�� ȣ���� �� ����.
			
			
		}
}
