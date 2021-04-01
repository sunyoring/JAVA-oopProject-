package com.kh.prac5.model.vo;

public class Book {
	private String title; // 책 제목
	private int price; // 책 가격
	private String writer; // 저자
	private String publisher; // 출판사

	public Book() {
	}

	public Book(String title, int price, String writer, String publisher) {
		this.title = title;
		this.price = price;
		this.writer = writer;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public String getWriter() {
		return writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "책 제목 : " + title + ", 책 가격 : " + price + ", 책 저자 : " + writer + ", 출판사 : " + publisher;
	}

	@Override
	
// 1, new 연산자 사용
	public Book clone() {
		return new Book(title, 0, writer, publisher);
	}
}
