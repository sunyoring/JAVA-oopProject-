package com.kh.prac4.run;

import com.kh.prac4.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member[] m = { new Member("�輱��", 17, '��', 'B'), 
				new Member("ȫ�̶�", 23, '��', 'O'),
				new Member("�����", 20, '��', 'A'), 
				new Member("�谡��", 27, '��', 'B'), 
				new Member("�ڼ���", 25, '��', 'O') };

		Member[] tempM = new Member[8]; // ��ü�迭�� �⺻�����ڷ� �ʱ�ȭ�� ��ü�� ä��.
		for (int i = 0; i < tempM.length; i++) {
			tempM[i] = new Member();

		}
		int tempIndex = 0; //
		for (int i = 0; i < m.length; i++) { // ������ �Ǵ� �ο��� �ٲ� for��
			for (int j = i+1; j< m.length; j++) {// ������ �ο��� ���ϴ� for��
				if (m[i].equals(m[j])) {
					int k;
					for (k = 0; k < tempM.length; k++) { //tempM ��ü�迭�� �������� Ȯ��
						if (m[j].equals(tempM[k])) { //�ߺ����̸� for���� ������ ����.
							break;
						}
					}
					if (k == tempM.length) { 
						tempM[tempIndex++] = m[j]; //tempM�� ���� �ִ� �ڵ�
					}
				}
			}
		}
		System.out.println("������ �������� �� �� ��ġ�ϴ� ����� ���� �� " + tempIndex+"����" );
	}
}
