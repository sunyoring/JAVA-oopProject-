package com.kh.p3.poly.model.vo;

public class ReadingBook extends Hobby {
	private int bookNo; //���� å�� �Ǽ�
	
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
		System.out.println(super.toString() + "���� �Ѵ޿� �ִ� å��" + bookNo + "�� �̴�.");
	}
	
	@Override
	public void print() {
		System.out.println(super.toString() + "���� �Ѵ޿� �ִ� å��" + bookNo + "�� �̴�.");
	}
	
}
