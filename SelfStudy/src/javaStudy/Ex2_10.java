package javaStudy;
import java.util.Scanner;

/*
if���� ���ǽ��� �� �����̳� �� ������ ȥ�յ� ������ �����Ǹ�,
���ǽ��� ����� boolean���̴�.
���ǽ��� ��(true)�̸� if ������ '���๮��'�� ����Ǹ�,
����(false)�̸� if���� �����. 
���ǽ��� booleanŸ���� ���� �ϳ������ε� �����ϴ�.
*/

//���������� 80�� �̻��̶�� �հ� �Ǻ��� �ϴ� ���α׷��� �ۼ��϶�
public class Ex2_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("������ �Է��ϼ���: ");
		int score = scanner.nextInt();
		if(score >= 80) 
			System.out.println("�հ��Դϴ�.");
		
		scanner.close();
	}
}