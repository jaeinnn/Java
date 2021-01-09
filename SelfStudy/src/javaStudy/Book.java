package javaStudy;

//생성자(constructor)는 객체가 생성될 때 객체의 초기화를 위해 실행되는 메소드 

/*
 생성자는 객체가 생성될 때, 필드 초기화, 필요한 메모리 확보,
 파일 열기, 네트워크 연결 등 객체가 활동하기 전에 
 필요한 초기 준비를 하는데 이용된다. 
 */

/*
제목과 저자를 나타내는 title과 author 필드를 가진
Book 클래스를 작성하고, 생성자를 작성하여 필드를 초기화하라 
 */
public class Book {
	String title;
	String author; 
	
	public Book(String t){ //생성자
		title = t; 
		author = "작자미상"; 
	}
	
	public Book(String t, String a) {//생성자
	title = t; 
	author = a; 
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생택쥐페리");
		                            //생성자 Book(String t, String a)호출
		Book loveStory = new Book("춘향전"); //생성자 Book(String t)호출
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
