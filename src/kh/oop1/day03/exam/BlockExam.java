package kh.oop1.day03.exam;

public class BlockExam {
	public static String name = "ȫ�浿"; //����� �ʱ�ȭ
	
	public BlockExam() { 
		System.out.println("������ ����");
	}
	int age = 20;
	
	
	//�ʱ�ȭ ��
	//Ŭ���� �� : Ŭ������ �����Ͽ��� �� ���ʷ� 1���� �����.
	static{
		System.out.println("static �� ����");
		name = "�ڱ浿";
	}
	{ // ������ ������ ���� �ʱ�ȭ�� �� ����Ѵ�.
		System.out.println(age);
		System.out.println("�ν��Ͻ� ��1");
		this.age = 21;
		System.out.println(age);
	}
	{
		System.out.println("�ν��Ͻ� ��2");
	}
}
