package com.kh.p2.over.run;

import com.kh.p2.over.child.model.vo.CoffeeShop;
import com.kh.p2.over.parent.model.vo.Shop;

public class Run {

	public static void main(String[] args) {
		Shop sh = new Shop("ȫ�浿","������ �ΰ赿");
		System.out.println(sh); 
		// toString�� �������̵��ϴ� ���� : ��ü �� �ᵵ �ڵ����� ��ü ���� toString�� ã�� ���ڿ��� ������ش�.
		
		sh.order("�θ� �޼ҵ� >> ");
		
		CoffeeShop cs = new CoffeeShop("ȫ�浿","������ �ΰ赿","�Ƹ޸�ī��",2000,"��Ÿ����");
		
		cs.order("�������̵��� ���� �ڽ� �޼ҵ� >> ");
	}

}
