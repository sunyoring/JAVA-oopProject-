package kh.oop1.day03.exam;

public class ConstructorExam {
	private int no;
	private String name;
		//������ ǥ����
	//�⺻������ : [����������] Ŭ������(){}
	//�Ű������� �ִ� ������ :
	//[����������] Ŭ������(�Ű�����){(this).�ʵ庯�� = �Ű�����;}
	
	//�⺻������ //�������� : Ŭ���� ���� �ڵ������� JVM���� �������ش�.
	public ConstructorExam() {
		
	}
	//�Ű������� �ִ� ������ // �ݵ�� �⺻�����ڸ� ������־����
	//��ü ������ ���޹��� ������ �ʱ�ȭ���ֱ� ���� �����.
	public ConstructorExam(int no,String name) {
		this.no = no;
		this.name = name;
		//this�� �ʵ��� ��������� ��������� ����
	}
	
	
}
