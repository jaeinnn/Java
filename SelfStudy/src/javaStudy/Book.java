package javaStudy;

//������(constructor)�� ��ü�� ������ �� ��ü�� �ʱ�ȭ�� ���� ����Ǵ� �޼ҵ� 

/*
 �����ڴ� ��ü�� ������ ��, �ʵ� �ʱ�ȭ, �ʿ��� �޸� Ȯ��,
 ���� ����, ��Ʈ��ũ ���� �� ��ü�� Ȱ���ϱ� ���� 
 �ʿ��� �ʱ� �غ� �ϴµ� �̿�ȴ�. 
 */

/*
����� ���ڸ� ��Ÿ���� title�� author �ʵ带 ����
Book Ŭ������ �ۼ��ϰ�, �����ڸ� �ۼ��Ͽ� �ʵ带 �ʱ�ȭ�϶� 
 */
public class Book {
	String title;
	String author; 
	
	public Book(String t){ //������
		title = t; 
		author = "���ڹ̻�"; 
	}
	
	public Book(String t, String a) {//������
	title = t; 
	author = a; 
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("�����", "�������丮");
		                            //������ Book(String t, String a)ȣ��
		Book loveStory = new Book("������"); //������ Book(String t)ȣ��
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
