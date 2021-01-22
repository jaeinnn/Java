package javaStudy;


/*
자바에서는 부모 클래스를 슈퍼클래스(super class), 
상속받는 자식 클래스를 서브클래스(sub class)라고 부르며,
상속을 선언할 때 확장한다는 뜻을 가진 extends 키워드를 사용한다 

부모클래스의 멤버를 물려받는 자식클래스는, 부모클래스에 선언된
필드나 메소드를 다시 반복하여 작성할 필요가 없고,
필드나 메소드를 추가 작성하면 된다.
 */
class Point{
	private int x,y; //한 점을 구성하는 x,y 좌표
	public void set(int x, int y) {
		this.x = x; this.y = y; 
	}
	public void showPoint() {//점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
	
}

class  ColorPoint extends Point{ //Point를 상속받은 ColorPoint 선언
	private String color; //점의 색
	public void setColor(String color) {
		this.color = color; 
	}
	public void showColorPoint() { //컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); //Point클래스의 showPoint() 호출
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); //Point 객체생성
		p.set(1, 2); //Point 클래스의 set() 호출
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); //ColorPoint객체생성
		cp.set(3, 4); //Point클래스의 set() 호출
		cp.setColor("red"); //ColorPoint클래스의 setColo() 호출
		cp.showColorPoint(); //컬러와 좌표 출력 
	}
}