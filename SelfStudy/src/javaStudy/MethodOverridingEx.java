package javaStudy;

/*
  �������̵��� ����� ���� 
 '�ϳ��� �������̽�(���� �̸�)�� ���� �ٸ� ���� ����'
  �̶�� ��ü ������ �������� �����ϴ� �����̴�.  
 */

/*
 ����5-5
 Shape�� draw()�޼ҵ带 Line,Circle,RectŬ��������
 ������ �°� �������̵��ϴ� �������� ��ʸ� �����ش� 
 */
class Shape{
	public Shape next;
	public Shape() { next = null; } 
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() { //�޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() { //�޼ҵ� �������̵�
		System.out.println("Rect");
	}
}

class Circle2 extends Shape{
	public void draw() { //�޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	
	//Shape�� ��ӹ��� ��� ��ü���� �Ű����� p�� ���� �Ѿ�� �� �ִ�
	static void paint(Shape p) {
		p.draw(); //p�� ����Ű�� ��ü ���� �������̵��� draw()ȣ��. ���� ���ε�
	}
	
	public static void main(String[] args) {
		Line line = new Line(); 
		
		
	//���� ȣ����� ��� paint()�޼ҵ� ���� Shape�� ���� ���۷��� p�� ��ĳ���õ�
		paint(line); //Line�� �������̵��� draw()����, "Line"��� 
		paint(new Shape()); //Shape�� draw()����. "Shape"��� 
		paint(new Line()); //Line�� �������̵��� draw()����, "Line"���
		paint(new Rect()); //Rect�� �������̵��� draw()����, "Rect" ���
		paint(new Circle2()); //Circle�� �������̵��� draw()����, "Circle"���
		
	}

}
