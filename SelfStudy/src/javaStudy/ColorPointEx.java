package javaStudy;


/*
�ڹٿ����� �θ� Ŭ������ ����Ŭ����(super class), 
��ӹ޴� �ڽ� Ŭ������ ����Ŭ����(sub class)��� �θ���,
����� ������ �� Ȯ���Ѵٴ� ���� ���� extends Ű���带 ����Ѵ� 

�θ�Ŭ������ ����� �����޴� �ڽ�Ŭ������, �θ�Ŭ������ �����
�ʵ峪 �޼ҵ带 �ٽ� �ݺ��Ͽ� �ۼ��� �ʿ䰡 ����,
�ʵ峪 �޼ҵ带 �߰� �ۼ��ϸ� �ȴ�.
 */
class Point{
	private int x,y; //�� ���� �����ϴ� x,y ��ǥ
	public void set(int x, int y) {
		this.x = x; this.y = y; 
	}
	public void showPoint() {//���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
	
}

class  ColorPoint extends Point{ //Point�� ��ӹ��� ColorPoint ����
	private String color; //���� ��
	public void setColor(String color) {
		this.color = color; 
	}
	public void showColorPoint() { //�÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); //PointŬ������ showPoint() ȣ��
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); //Point ��ü����
		p.set(1, 2); //Point Ŭ������ set() ȣ��
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); //ColorPoint��ü����
		cp.set(3, 4); //PointŬ������ set() ȣ��
		cp.setColor("red"); //ColorPointŬ������ setColo() ȣ��
		cp.showColorPoint(); //�÷��� ��ǥ ��� 
	}
}