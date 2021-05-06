package javaStudy;
//예제 6-2
//Point3클래스에 Point3객체를 문자열로 리턴하는 toString() 메소드를 작성하라

class Point3{
	int x,y; 
	public Point3(int x, int y) {
		this.x=x; 
		this.y=y; 
	}
	public String toString() { //Point3객체를 문자열로 리턴하는 toString() 작성
		return "Point(" + x + "," + y + ")"; 
	}
	
}

public class ToStringEx {
	public static void main(String[] args) {
		Point3 p = new Point3(2,3); 
		System.out.println(p.toString());
		System.out.println(p); //p는 p.toString()으로 자동변환
		System.out.println(p+"입니다."); //p.toString() + "입니다"로 자동변환 
	}

}
