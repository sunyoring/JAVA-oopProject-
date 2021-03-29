package com.kh.p2.over.run;

import com.kh.p2.over.child.model.vo.CoffeeShop;
import com.kh.p2.over.parent.model.vo.Shop;

public class Run {

	public static void main(String[] args) {
		Shop sh = new Shop("ȫ�浿", "������ �ΰ赿");
		System.out.println(sh);
		// toString�� �������̵��ϴ� ���� : ��ü �� �ᵵ �ڵ����� ��ü ���� toString�� ã�� ���ڿ��� ������ش�.

		sh.order("�θ� �޼ҵ� >> ");

		CoffeeShop cs = new CoffeeShop("ȫ�浿", "������ �ΰ赿", "�Ƹ޸�ī��", 2000, "��Ÿ����");

		cs.order("�������̵��� ���� �ڽ� �޼ҵ� >> ");

		CoffeeShop cs2 = new CoffeeShop("������", 3000, "Ŀ�Ǻ�");
		CoffeeShop cs3 = new CoffeeShop("������", 3000, "Ŀ�Ǻ�");

		// hashCode : ��ü�� �ּҰ��� ���������� ��ȯ
		System.out.println(cs2.hashCode());
		System.out.println(cs3.hashCode());
		// �� ��ü�� �ּҰ��� �ٸ���.

		// equals�޼ҵ带 �������̵��Ͽ� �ּҰ��� �ٸ� �� ��ü ������ ���� ���ٸ� true�� ��ȯ�ϵ��� �Ѵ�.

		System.out.println("equals�� �� ��� : " + cs2.equals(cs3));

		CoffeeShop cs4 = null;

		// ��ü�� �������ִ� clone�޼ҵ�
		// protected Object clone()�� ��Ӱ��谡 �ƴ� CoffeeShop�� Run�޼ҵ忡��
		// ����Ҽ� �ֵ��� public���� �ٲ㼭 ������
		/*
		 * @Override
		 * 
		 * public CoffeeShop clone() { return this; }
		 */
		cs4 = cs2.clone();
		System.out.println(cs2);
		System.out.println(cs4);

	}

}
