package javaStudy;

//���� �ڵ�� 2���� �����ڸ� ���� CircleŬ�����̴�.���� ����� �����ΰ�? 
public class Circle {
	int radius; //���� ������ �ʵ�
	String name; //���� �̸� �ʵ� 
	
	public Circle() { //�Ű����� ���� ������
		radius = 1; name = ""; //�ʵ� �ʱ�ȭ 
	} 
	
	public Circle(int r, String n) { //�Ű������� ���� ��������
		radius = r; name = n; //�Ű������� �ʵ� �ʱ�ȭ 
		//�����ڴ� radius�� name�ʵ带 �ʱ�ȭ�� ��
	}
//�����ڷ� ��ü�� ����� �ʱⰪ�� ������ �� �ִ�		
	
	
	public double getArea() { //���� ���� ��� �޼ҵ�
		return 3.14*radius*radius; 
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "��������"); 
		//��ü ����. �������� 10����, �̸��� "�ڹ�����"�� �ʱ�ȭ
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle donut = new Circle(); //��ü ����. �������� 1, �̸��� ""�� �ʱ�ȭ 
		donut.name = "��������"; //�̸� ����
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}

}
