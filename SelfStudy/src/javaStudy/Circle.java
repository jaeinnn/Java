package javaStudy;

//���α׷��־��� 202034-365046 ������
public class Circle {
	int radius; //���� ������ �ʵ�
	String name; //���� �̸� �ʵ� 
	
	public Circle() {} //������ 
	
	public double getArea() { //���� ���� ��� �޼ҵ�
		return 3.14*radius*radius; 
	}
	
	public static void main(String[] args) {
		Circle pizza ; //���۷��� ���� pizza ����
		pizza = new Circle(); //Circle ��ü ���� 
		pizza.radius = 10; //������ �������� 10���� ����
		pizza.name="ġ������"; //������ �̸� ����
		double area = pizza.getArea(); //������ ���� �˾Ƴ���
		System.out.println(pizza.name + "�� ������ " + area);
	}
}
