package javaStudy;

import java.util.Scanner;

/*
try-catch ����� �̿��Ͽ� ���� 3-14�� �����Ͽ�, ������ 0���� 
������ ��쿡 "0���� ���� �� �����ϴ�!"�� ����ϰ� 
�ٽ� �Է¹޴� ���α׷��� �ۼ��϶�
 */
public class Ex3_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("�������� �Է��ϼ���:");
			int dividend = scanner.nextInt(); // �������Է�
			System.out.print("�������� �Է��ϼ���:");
			int divisior = scanner.nextInt(); // �������Է�
			try {

				System.out.println(dividend + "�� " + divisior + "�� ������ ���� " + dividend / divisior + "�Դϴ�.");
				break; // �������� ������ �Ϸ� �� while �����
			} catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
			}
          /*
           catch��Ͽ��� ����ó���� ���ֹǷ� ���� 3-14�� �޸� ���α׷��� ������� �ʴ´�
           catch��� ���� �� �ٽ� while���� �ݺ��ϰ�, try��Ͽ��� ���������� 
           �����Ⱑ �̷������ break���� ���� �������´�.  
           */
		}
		scanner.close();
	}
}