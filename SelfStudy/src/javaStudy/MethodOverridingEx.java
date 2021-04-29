package javaStudy;

/*
  오버라이딩은 상속을 통해 
 '하나의 인터페이스(같은 이름)에 서로 다른 내용 구현'
  이라는 객체 지향의 다형성을 실현하는 도구이다.  
 */

/*
 예제5-5
 Shape의 draw()메소드를 Line,Circle,Rect클래스에서
 목적에 맞게 오버라이딩하는 다형성의 사례를 보여준다 
 */
class Shape{
	public Shape next;
	public Shape() { next = null; } 
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() { //메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() { //메소드 오버라이딩
		System.out.println("Rect");
	}
}

class Circle2 extends Shape{
	public void draw() { //메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	
	//Shape를 상속받은 모든 객체들이 매개변수 p를 통해 넘어올 수 있다
	static void paint(Shape p) {
		p.draw(); //p가 가리키는 객체 내에 오버라이딩된 draw()호출. 동적 바인딩
	}
	
	public static void main(String[] args) {
		Line line = new Line(); 
		
		
	//다음 호출들은 모두 paint()메소드 내에 Shape에 대한 레퍼런스 p로 업캐스팅됨
		paint(line); //Line에 오버라이딩한 draw()실행, "Line"출력 
		paint(new Shape()); //Shape의 draw()실행. "Shape"출력 
		paint(new Line()); //Line에 오버라이딩한 draw()실행, "Line"출력
		paint(new Rect()); //Rect에 오버라이딩한 draw()실행, "Rect" 출력
		paint(new Circle2()); //Circle에 오버라이딩한 draw()실행, "Circle"출력
		
	}

}
