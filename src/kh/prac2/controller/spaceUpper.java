package com.kh.prac2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class spaceUpper {

	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);

		System.out.print("��� �Է��Ͻÿ�.(���� ����) : ");
		String str = sc.nextLine();
		sc.close();
		StringTokenizer stk = new StringTokenizer(str, " ");
		// ���޵� �Ű����� String str�� Ư�� delim���� ���ڿ��� �и��Ѵ�.
		StringBuilder sbu = new StringBuilder();
		//String�� ���� �Һ��ϱ� ������ ���� �߰��Ϸ��� ������ ���� ������ ���ο� ���� �Ҵ��Ѵ�.
		/*ex) String s;
		 * s = s.concat("���̱�");
		 * s = s + "���̱�"
		 */
		// ���� StringBuilder�� ����ϴ� ���� �޸𸮻� ȿ�����̴�.(����� �޼ҵ� : StringBuffer)
		/* StringBuilder sb = new StringBuilder(" ");
		 * sb.append(��) : StringBuilder �ڿ� ���� ���δ�.
		 * sb.insert(�ε���, ��) : Ư�� �ε������� ���� �����Ѵ�.
		 * sb.delete(�ε���,�ε���) : Ư�� �ε������� �ε��������� ���� �����Ѵ�.
		 * �� ��
		 */

		while (stk.hasMoreTokens()) {
			String token = stk.nextToken();
			for (int i = 0; i < token.length(); i++) {
				if (i == 0)
					sbu.append(token.toUpperCase().charAt(i));
				else
					sbu.append(token.charAt(i));
			}
			sbu.append(" ");
		}
		System.out.println(sbu);
	}
}
