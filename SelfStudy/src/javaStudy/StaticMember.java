package javaStudy;

import java.util.Scanner;

/* static �޼ҵ��� �������� 

*static �޼ҵ�� static ����� ������ �� �ִ�
: static �޼ҵ��, ��ü ���̵� �����ϱ� ������, ��ü�� �Բ�
�����Ǵ� non-static����� ����� �� ���� static ����鸸 ��� �����ϴ�.
�ݸ� non-static�޼ҵ�� static������� ����� �� �ִ�

*static �޼ҵ�� this�� ����� �� ���� 
: static �޼ҵ��, ��ü ���̵� �����ϱ� ������, this�� ����� �� ����.
 */


public class StaticMember{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ȯ��(1�޷�)>> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate); //�̱� �޷� ȯ�� ����
		System.out.println("�鸸���� $" + CurrencyConverter.toDollar(1000000)
		+ "�Դϴ�.");
		System.out.println("$100�� " + CurrencyConverter.toKWR(100) + "���Դϴ�.");
		scanner.close();
	}
}
