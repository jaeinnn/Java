package javaStudy;
//���� 6-2
//Point3Ŭ������ Point3��ü�� ���ڿ��� �����ϴ� toString() �޼ҵ带 �ۼ��϶�

class Point3{
	int x,y; 
	public Point3(int x, int y) {
		this.x=x; 
		this.y=y; 
	}
	public String toString() { //Point3��ü�� ���ڿ��� �����ϴ� toString() �ۼ�
		return "Point(" + x + "," + y + ")"; 
	}
	
}

public class ToStringEx {
	public static void main(String[] args) {
		Point3 p = new Point3(2,3); 
		System.out.println(p.toString());
		System.out.println(p); //p�� p.toString()���� �ڵ���ȯ
		System.out.println(p+"�Դϴ�."); //p.toString() + "�Դϴ�"�� �ڵ���ȯ 
	}

}
