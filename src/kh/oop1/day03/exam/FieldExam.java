package kh.oop1.day03.exam;

public class FieldExam {
	// 클래스 변수 : 모든 객체가 공통적인 특성을 가질 때 사용하며, 생성시 메모리 영역에 같이 저장되므로
	// 꼭 공통적인 특성을 가질 때만 사용한다.
//		[접근제한자] [예약어] 자료형 변수명;
	public static int var1;

	// 멤버 변수(인스턴스 변수) : 각 각의 객체가 다른 특성을 가질 때 사용한다.
	public int var2;
	private int var3; // 캡슐화 원칙으로 private사용, 해당 클래스 내에서만 사용 가능
	int var4; // 접근제한자를 쓰지 않을 경우 default제한자로 사용된다. 같은 패키지 내에서 사용가능

	// 생성자 : 메소드명을 클래스명과 동일하게 해줌.
	public FieldExam() {
		String var5 = "생성자 지역변수"; // 지역변수
		System.out.println(var5);
	}

	// 초기화 블럭
	{
		String var6 = "초기화 블럭 지역변수"; // 지역변수
		System.out.println(var6);
	}

	public static String method() {
		String var7 = "static메소드 내의 지역변수"; // 지역변수
		return var7;
	}

	public String method2() {
		String var8 = "메소드 내의 지역변수";
		return var8;
	}
}