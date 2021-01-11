package javaStudy;

/*
�������� 0~4�� Circle ��ü 5���� ������ �迭�� �����ϰ�, 
�迭�� �ִ� ��� Circle ��ü�� ������ ����϶� 
*/

class Circle{
 int radius; 
 public Circle(int radius) {
	 this.radius = radius; 
 }
 public double getArea() {
	 return 3.14*radius*radius;
 }
}


public class CircleArray {
	public static void main(String[] args) {
		
		Circle[] c; //Circle �迭�� ���� ���۷��� c ����
		c = new Circle[5]; //5���� ���۷��� �迭 ����
		
		for(int i=0; i<c.length; i++) //�迭�� ������ŭ
			c[i] = new Circle(i); //i��° ���� ��ü ����
		for(int i=0; i<c.length; i++) //�迭�� ��� Circle��ü�� ���� ���
			System.out.print((int)(c[i].getArea()) + " ");
		
	}

}
