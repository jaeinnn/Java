package javaStudy;

//���� 4-4���� �ۼ��� Book Ŭ������ �����ڸ� this()�� �̿��Ͽ� �����϶� 
public class Book {
	String title;
	String author;

	void show() {
		System.out.println("title" + " " + author);
	}

	public Book() {
		this("", "");
		System.out.println("������ ȣ���");
	}

	public Book(String title) {
		this(title, "���ڹ̻�");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		Book littlePrince = new Book("�����", "�������丮");
		Book loveStroy = new Book("������");
		Book emptyBook = new Book();
		loveStroy.show();
	}
}
