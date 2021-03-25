package kh.oop1.day03.exam;

public class ThisConstructor {
	private String bookName;//책이름
	private int bookPrice;//책가격
	private String bookPublisher;//출판사
	private int bookId;//책아이디
	
	public ThisConstructor() {
		System.out.println("기본생성자입니다.");
	}
	
	public ThisConstructor(String bookPublisher) {
		this.bookPublisher = bookPublisher;
		System.out.println("매개변수 하나");
	}
	public ThisConstructor(String bookName, int bookPrice, int bookId) {
		this("OOO출판사"); 
		//this생성자를 통해 매개변수가 하나 있는 값을 호출할 수 있다.
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookId = bookPrice;
	}
	
	public String getBookName() {
		return bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public int getBookId() {
		return bookId;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	
	//this 생성자는 동일한 값이나 연산자를 다른 생성자에서 쓰게 될 경우 한 곳에
	//만들어 놓고 다른 생성자에서 사용한다. 단, 첫 줄에 위치시킬 것
}
