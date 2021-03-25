package kh.oop1.day03.exam;

public class ConstructorExam {
	private int no;
	private String name;
		//생성자 표현식
	//기본생성자 : [접근제한자] 클래스명(){}
	//매개변수가 있는 생성자 :
	//[접근제한자] 클래스명(매개변수){(this).필드변수 = 매개변수;}
	
	//기본생성자 //생략가능 : 클래스 사용시 자동적으로 JVM에서 생성해준다.
	public ConstructorExam() {
		
	}
	//매개변수가 있는 생성자 // 반드시 기본생성자를 만들어주어야함
	//객체 생성시 전달받은 값으로 초기화해주기 위해 사용함.
	public ConstructorExam(int no,String name) {
		this.no = no;
		this.name = name;
		//this는 필드의 멤버변수를 명시적으로 지명
	}
	
	
}
