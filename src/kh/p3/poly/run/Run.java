package com.kh.p3.poly.run;

import com.kh.p3.poly.model.vo.Collecting;
import com.kh.p3.poly.model.vo.Hobby;
import com.kh.p3.poly.model.vo.ReadingBook;

public class Run {

	public static void main(String[] args) {
		Hobby h = new Hobby();
		Hobby upH = new Collecting(); //�θ� Ŭ������ �ڽ��� Ŭ������ �ٷ� �� �ִ� �� ĳ����
									//(Hobby)�Ұ�ȣ ���� ����
		ReadingBook dwnR = (ReadingBook)(upH); //��Ÿ�� �����߻�
		// �ٿ�ĳ�����̶� ? �ڽ��� ������ Ư���� ���� �ڽ� Ŭ������ ��ü�� �ٽ� ���� �����ִ� ��.
		// ��ĳ���õ� ���� �ٽ� �����·� ������ ��. (��ĳ������ ����Ǿ�� ��)
		// (����) : �θ�Ŭ������ ǥ���ϰ� �ִ� �ڽ� Ŭ���� �ڷ������� �ؾ���.
		
		//�ܼ��� ������ ����
		Hobby polyC = new Collecting();
		Hobby polyC2 = new Collecting(3, 100, "��ǥ");
		Hobby polyRb1 = new ReadingBook(4, 200, 100);
		Hobby polyRb2 = new ReadingBook(5, 300, 200);
		Hobby polyC3 = new Collecting(6, 400, "���ڱ�");
		
		//������ + �迭 ����
		Hobby[] polyArr = new Hobby[4];
		polyArr[0] = new Collecting(3, 100, "��ǥ");
		polyArr[1] = new ReadingBook(4, 200, 100);
		polyArr[2] = new ReadingBook(5, 300, 200);
		polyArr[3] = new Collecting(6, 400, "���ڱ�");
		
		//���� : ���� Ÿ���� ��ü�� �ϳ��� Ÿ������ ������ ���� ������ Ÿ���� ���� �������� �ʾƵ� �ǹǷ� �ڵ���� �׸�ŭ �پ���.
	}

}
