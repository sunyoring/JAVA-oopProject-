package kh.oop1.day03.run;

import kh.oop1.day03.exam.FieldExam;

public class Run {
	public static void main(String[] args) {
		 // 클래스명.변수명 이와같은 방식으로 클래스변수를 호출한다.
			System.out.println(FieldExam.var1);
			System.out.println(FieldExam.method());
			
		//인스턴스변수 호출 : 객체를 생성하여 heap메모리 영역에 저장된 후 호출된다.
			FieldExam fe = new FieldExam();
			System.out.println(fe.var2);
			System.out.println(fe.method2()); //static키워드의 메소드는 호출할 수 없다.
			
			
		}
}
