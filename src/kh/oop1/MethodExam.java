package kh.oop1.day04.exam;

public class MethodExam {
	//1.매개변수와 리턴값이 없을 때
	/*
	 * [접근제한자] [예약어] void [메소드명](){
	 * 
	 * }
	 */
	public void method1() {
		System.out.println("매개변수와 리턴값이 없는 경우");
	}
	
	//2.매개변수가 있고 리턴값이 없을 때
	/*
	 * [접근제한자][예약어] void [메소드명](매개변수){
	 * 
	 * }
	 *///매개변수의 갯수는 여러가지 일 수 있으며 ,(콤마)로 구분.
	// 매개변수의 타입은 기본자료형, 배열, 클래스, 가변인자가 있다. 
	public void method2(int num) {
		System.out.println("매개변수 : "+ num + "이고 리턴값은 없는 경우");
	}
	
	public void method2(int num2, String str) {
		System.out.println("매개변수가 여러개이며, 리턴값은 없는 경우");
	}
	public void method2(String[] strs, int[] nums) {
		System.out.println("매개변수가 배열형태이며, 리턴값은 없는 경우");
	}
	
	//3.매개변수가 없고 리턴값이 있는 경우
	/*
	 *[접근제한자] [예약어] 반환형 메소드명(){
	 *
	 *} 
	 */
	public int method3() {
		System.out.println("매개변수가 없고, 리턴값이 있는 경우");
		return 10;
	}
	
	//4. 매개변수가 있고 리턴값도 있는 경우
	/*
	 * [접근제한자][예약어]반환형 메소드명(매개변수){
	 * 
	 * }
	 */
	public String method4(int num) {
		return "매개변수가 있고 리턴값이 있는 경우";
	}
}
