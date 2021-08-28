package javaStudy;

/*
 main()�� �����ϴ� main������
 
 JVM�� �ڹ� ���� ���α׷��� �����ϱ� ����, ����� �����带 �ϳ� �����,
 �� ������� �Ͽ��� main()�޼ҵ带 �����ϵ��� �Ѵ�.
 �� �����尡 ���ν������̰� ���� ���� �ּҴ� main() �޼ҵ��� ù �ڵ尡 �ȴ�.
 
 �ڹ� �������α׷��� main()�޼ҵ尡 ����Ǵ� ���� 2���� �����尡 �����ϴ� ���̴�
 �ϳ��� main�������̰� �ٸ� �ϳ��� JVM���� �ڵ����� ������ ������ �÷��� �������̴� 
 */

public class ThreadMainEx {
	public static void main(String[] args) {
		
		long id = Thread.currentThread().getId(); //������ ID ���
		String name = Thread.currentThread().getName(); //������ �̸� ���
		int priority = Thread.currentThread().getPriority(); //������ �켱������ ��� 
		
		Thread.State s = Thread.currentThread().getState(); //������ ���°� ���
		
		System.out.println("���� ������ �̸� = " + name);
		System.out.println("���� ������ ID = " + id);
		System.out.println("���� ������ �켱���� �� = " + priority);
		System.out.println("���� ������ ����  = " + s);
	}

}
