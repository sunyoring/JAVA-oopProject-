package kh.oop1.day03.exam;

public class ThisConstructor {
	private String bookName;//å�̸�
	private int bookPrice;//å����
	private String bookPublisher;//���ǻ�
	private int bookId;//å���̵�
	
	public ThisConstructor() {
		System.out.println("�⺻�������Դϴ�.");
	}
	
	public ThisConstructor(String bookPublisher) {
		this.bookPublisher = bookPublisher;
		System.out.println("�Ű����� �ϳ�");
	}
	public ThisConstructor(String bookName, int bookPrice, int bookId) {
		this("OOO���ǻ�"); 
		//this�����ڸ� ���� �Ű������� �ϳ� �ִ� ���� ȣ���� �� �ִ�.
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
	
	//this �����ڴ� ������ ���̳� �����ڸ� �ٸ� �����ڿ��� ���� �� ��� �� ����
	//����� ���� �ٸ� �����ڿ��� ����Ѵ�. ��, ù �ٿ� ��ġ��ų ��
}
