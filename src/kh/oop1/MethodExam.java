package kh.oop1.day04.exam;

public class MethodExam {
	//1.�Ű������� ���ϰ��� ���� ��
	/*
	 * [����������] [�����] void [�޼ҵ��](){
	 * 
	 * }
	 */
	public void method1() {
		System.out.println("�Ű������� ���ϰ��� ���� ���");
	}
	
	//2.�Ű������� �ְ� ���ϰ��� ���� ��
	/*
	 * [����������][�����] void [�޼ҵ��](�Ű�����){
	 * 
	 * }
	 *///�Ű������� ������ �������� �� �� ������ ,(�޸�)�� ����.
	// �Ű������� Ÿ���� �⺻�ڷ���, �迭, Ŭ����, �������ڰ� �ִ�. 
	public void method2(int num) {
		System.out.println("�Ű����� : "+ num + "�̰� ���ϰ��� ���� ���");
	}
	
	public void method2(int num2, String str) {
		System.out.println("�Ű������� �������̸�, ���ϰ��� ���� ���");
	}
	public void method2(String[] strs, int[] nums) {
		System.out.println("�Ű������� �迭�����̸�, ���ϰ��� ���� ���");
	}
	
	//3.�Ű������� ���� ���ϰ��� �ִ� ���
	/*
	 *[����������] [�����] ��ȯ�� �޼ҵ��(){
	 *
	 *} 
	 */
	public int method3() {
		System.out.println("�Ű������� ����, ���ϰ��� �ִ� ���");
		return 10;
	}
	
	//4. �Ű������� �ְ� ���ϰ��� �ִ� ���
	/*
	 * [����������][�����]��ȯ�� �޼ҵ��(�Ű�����){
	 * 
	 * }
	 */
	public String method4(int num) {
		return "�Ű������� �ְ� ���ϰ��� �ִ� ���";
	}
}
