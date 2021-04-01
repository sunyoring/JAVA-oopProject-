package com.kh.prac5.model.vo;

public class Book {
	private String title; // å ����
	private int price; // å ����
	private String writer; // ����
	private String publisher; // ���ǻ�

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
		return "å ���� : " + title + ", å ���� : " + price + ", å ���� : " + writer + ", ���ǻ� : " + publisher;
	}

	@Override
	
// 1, new ������ ���
	public Book clone() {
		return new Book(title, 0, writer, publisher);
	}
}
