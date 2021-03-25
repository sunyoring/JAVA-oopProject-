package kh.oop1.day04.run;

import kh.oop1.day04.exam.Student;

public class Run {

	public static void main(String[] args) {
		Student st = new Student();

		st.setStudentName("ȫ�浿");
		st.setStudentNo(1);
		
		System.out.println(st.getStudenName());
		System.out.println(st.getStudentNo());

	}
}
