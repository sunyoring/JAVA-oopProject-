package kh.oop1.day03.exam;

public class FieldExam {
	// Ŭ���� ���� : ��� ��ü�� �������� Ư���� ���� �� ����ϸ�, ������ �޸� ������ ���� ����ǹǷ�
	// �� �������� Ư���� ���� ���� ����Ѵ�.
//		[����������] [�����] �ڷ��� ������;
	public static int var1;

	// ��� ����(�ν��Ͻ� ����) : �� ���� ��ü�� �ٸ� Ư���� ���� �� ����Ѵ�.
	public int var2;
	private int var3; // ĸ��ȭ ��Ģ���� private���, �ش� Ŭ���� �������� ��� ����
	int var4; // ���������ڸ� ���� ���� ��� default�����ڷ� ���ȴ�. ���� ��Ű�� ������ ��밡��

	// ������ : �޼ҵ���� Ŭ������� �����ϰ� ����.
	public FieldExam() {
		String var5 = "������ ��������"; // ��������
		System.out.println(var5);
	}

	// �ʱ�ȭ ��
	{
		String var6 = "�ʱ�ȭ �� ��������"; // ��������
		System.out.println(var6);
	}

	public static String method() {
		String var7 = "static�޼ҵ� ���� ��������"; // ��������
		return var7;
	}

	public String method2() {
		String var8 = "�޼ҵ� ���� ��������";
		return var8;
	}
}