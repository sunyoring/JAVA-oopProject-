package kh.oop1.day01.run;

import kh.oop1.day01.exam.Pet;

public class Run {

	public static void main(String[] args) {
//		Pet p = new Pet();
		//Pet class¸¦ instanceÈ­ ÇÏ¿© °´Ã¼¸¦ 3°³ »ı¼ºÇÔ.
		Pet p1 = new Pet("ÅÎ½Ãµµ","±ôµ¹ÀÌ",1);
		Pet p2 = new Pet("»ï»öÀÌ","ÇÏ¾çÀÌ",2);
		Pet p3 = new Pet("Ä«¿À½º","¸·³»",3);
		
		System.out.println("Æê Á¾·ù : " + p1.getPetType());
		System.out.println("Æê ÀÌ¸§ : " + p1.getPetName());
		System.out.println("Æê ³ªÀÌ : " + p1.getPetAge());
		
		System.out.println("Æê Á¾·ù : " + p2.getPetType());
		System.out.println("Æê ÀÌ¸§ : " + p2.getPetName());
		System.out.println("Æê ³ªÀÌ : " + p2.getPetAge());
		
		System.out.println("Æê Á¾·ù : " + p3.getPetType());
		System.out.println("Æê ÀÌ¸§ : " + p3.getPetName());
		System.out.println("Æê ³ªÀÌ : " + p3.getPetAge());

	}
}
