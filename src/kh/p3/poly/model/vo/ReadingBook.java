package com.kh.p3.poly.model.vo;

public class ReadingBook extends Hobby {
	private int bookNo; //읽은 책의 권수
	
	public ReadingBook() {}
	public ReadingBook(int bookNo) {
		this.bookNo = bookNo;
	}
	public ReadingBook(int spendTime, int spendMoney, int BookNo) {
		super(spendTime, spendMoney);
		this.bookNo = bookNo;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public void reMethod() {
		System.out.println(super.toString() + "내가 한달에 있는 책은" + bookNo + "권 이다.");
	}
	
	@Override
	public void print() {
		System.out.println(super.toString() + "내가 한달에 있는 책은" + bookNo + "권 이다.");
	}
	
}
