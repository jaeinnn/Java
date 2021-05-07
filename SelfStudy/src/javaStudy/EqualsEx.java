package javaStudy;
//예제 6-3
//Point2클래스에 두 점의 좌표가 같으면 true를 리턴하는 equals()를 작성하라 

class Point2{
	int x,y; 
	public Point2(int x, int y) {
		this.x = x; this.y = y; 
	}
	
	public boolean equals(Object obj){
		Point2 p = (Point2)obj; //객체 obj를 Point타입으로 다운캐스팅
		if(x==p.x && y == p.y) return true;
		else return false; 
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point2 a = new Point2(2,3); 
		Point2 b = new Point2(2,3); 
		Point2 c = new Point2(3,4); 
		if(a==b) //false
			System.out.println("a==b");
		if(a.equals(b)) //true
			 System.out.println("a is equals to b");
		if(a.equals(c)) //false
			System.out.println("a is equal to c");
	}

}
