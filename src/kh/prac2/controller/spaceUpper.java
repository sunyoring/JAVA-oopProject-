package com.kh.prac2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class spaceUpper {

	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);

		System.out.print("영어를 입력하시오.(띄어쓰기 포함) : ");
		String str = sc.nextLine();
		sc.close();
		StringTokenizer stk = new StringTokenizer(str, " ");
		// 전달된 매개변수 String str을 특정 delim으로 문자열을 분리한다.
		StringBuilder sbu = new StringBuilder();
		//String의 값은 불변하기 때문에 값을 추가하려면 기존의 값을 버리고 새로운 것을 할당한다.
		/*ex) String s;
		 * s = s.concat("붙이기");
		 * s = s + "붙이기"
		 */
		// 따라서 StringBuilder를 사용하는 것이 메모리상 효율적이다.(비슷한 메소드 : StringBuffer)
		/* StringBuilder sb = new StringBuilder(" ");
		 * sb.append(값) : StringBuilder 뒤에 값을 붙인다.
		 * sb.insert(인덱스, 값) : 특정 인덱스부터 값을 삽입한다.
		 * sb.delete(인덱스,인덱스) : 특정 인덱스부터 인덱스까지의 값을 삭제한다.
		 * 등 등
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
