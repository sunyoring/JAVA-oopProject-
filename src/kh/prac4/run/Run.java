package com.kh.prac4.run;

import com.kh.prac4.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member[] m = { new Member("김선후", 17, '남', 'B'), 
				new Member("홍미라", 23, '여', 'O'),
				new Member("장수인", 20, '여', 'A'), 
				new Member("김가람", 27, '남', 'B'), 
				new Member("박수연", 25, '여', 'O') };

		Member[] tempM = new Member[8]; // 객체배열을 기본생성자로 초기화한 객체로 채움.
		for (int i = 0; i < tempM.length; i++) {
			tempM[i] = new Member();

		}
		int tempIndex = 0; //
		for (int i = 0; i < m.length; i++) { // 기준이 되는 인원을 바꿀 for문
			for (int j = i+1; j< m.length; j++) {// 나머지 인원을 비교하는 for문
				if (m[i].equals(m[j])) {
					int k;
					for (k = 0; k < tempM.length; k++) { //tempM 객체배열을 돌려가며 확인
						if (m[j].equals(tempM[k])) { //중복값이면 for문을 돌리지 않음.
							break;
						}
					}
					if (k == tempM.length) { 
						tempM[tempIndex++] = m[j]; //tempM에 값을 넣는 코드
					}
				}
			}
		}
		System.out.println("성별과 혈액형이 둘 다 일치하는 경우의 수는 총 " + tempIndex+"가지" );
	}
}
