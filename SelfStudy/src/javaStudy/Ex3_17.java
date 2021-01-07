package javaStudy;

import java.util.Scanner;
import java.util.InputMismatchException;

//�Է� ������ �߻��ϴ� ����(InputMismatchException)
public class Ex3_17 {
	/*
	 * 3���� ������ �Է¹޾� ���� ���ϴ� ���α׷��� �ۼ��϶�. ����ڰ� ������ �ƴ� ���ڸ� �Է��� �� �߻��ϴ�
	 * InputMismatchException ���ܸ� ó���Ͽ� �ٽ� �Է¹޵��� �϶�.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");

		int sum = 0, n = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				n = scanner.nextInt(); // ���� �Է�
				// ����ڰ������� �ƴ� ���ڸ� �Է��ϸ� InputMismatchException ���� �߻�
			} catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ�  �Է��ϼ���! ");
				scanner.nextLine(); // ���� �Է� ��Ʈ���� ���� �ִ� ��ū�� �����.
				i--;
				continue; // ���� ����
			}
			sum += n; // ���ϱ�
		}
		System.out.println("���� " + sum);
		scanner.close();
	}

}