package javaStudy;

import java.util.Scanner;

// /�� %������� 
//�� ������ ������ �Է¹ް�, �� �ð�, �� ��, �� ������ ����ϴ� ���α׷��� �ۼ��϶�
public class Ex2_5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int time = scanner.nextInt(); // �����Է�
		int second = time % 60; // 60���� ���� �������� ��
		int minute = (time / 60) % 60; // 60���� ���� ���� �ٽ� 60���� ���� �������� ��
		int hour = (time / 60) / 60; // 60���� ���� ���� �ٽ� 60���� ���� ���� �ð�

		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.print(second + "���Դϴ�.");
		scanner.close();
	}

}