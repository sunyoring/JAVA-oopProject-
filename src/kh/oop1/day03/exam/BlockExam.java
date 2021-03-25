package kh.oop1.day03.exam;

public class BlockExam {
	public static String name = "홍길동";
	
	public BlockExam() {
		System.out.println("생성자 영역");
	}
	int age = 20;
	
	
	//초기화 블럭
	//클래스 블럭 : 클래스를 실행하였을 때 최초로 1번만 실행됨.
	static{
		System.out.println("static 블럭 영역");
		name = "박길동";
	}
	{
		System.out.println(age);
		System.out.println("인스턴스 블럭1");
		this.age = 21;
		System.out.println(age);
	}
	{
		System.out.println("인스턴스 블럭2");
	}
}
