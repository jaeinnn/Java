package javaStudy;
/*
Ŭ���� Person�� �Ʒ��� ���� �ʵ带 ������ �����ϰ�, 
Ŭ���� Student�� Person�� ��ӹ޾� �� ��� �ʵ忡 ���� �����϶� 

 private int weight; 
 int age;
 protected int height; 
 public String name; 
 */

/*�� �������� PersonŬ������ private�ʵ��� weight�� 
 Student Ŭ���������� ������ �Ұ����Ͽ� 
 ����Ŭ������ Person�� get,set�޼ҵ带 ���ؼ��� ������ �����ϴ�
 */

class Person {
	private int weight;// private ��������. StudentŬ�������� ���� �Ұ�
	int age; // ����Ʈ ���� ����. Student Ŭ�������� ���� ����
	protected int height; // protected
	public String name; // public ���� ����. StudentŬ������������ ����

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 30; //���� Ŭ������ ����Ʈ ��� ���� ����
		name = "ȫ�浿"; //���� Ŭ������ public ��� ���� ����
		height = 175; //���� Ŭ������ protected ��� ���� ����
		//weight = 99; //����. ����Ŭ������ private ������� �Ұ�
		setWeight(99);//private ��� weight�� setWrite()�� ���� ����
	}
}
public class InheritanceEx {
	public static void main(String[] args) {
		Student s = new Student(); 
		s.set();
	}

}