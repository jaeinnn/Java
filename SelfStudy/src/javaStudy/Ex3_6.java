package javaStudy;

import java.util.Scanner;

/*
break���� �ϳ��� �ݺ����� ��� ��� �� ����ϸ� ������ ���� ����Ѵ�
  
     break; 
     
break���� ����Ǹ� ������ �ݺ����� ��� ������ ��ӵȴ�.
break���� �ϳ��� �ݺ����� �����.
��ø �ݺ��� ��� ���� �ݺ������� break���� ����Ǹ�, 
���� �ݺ����� ����� �ٱ��� �ݺ��� ������ ������ �����ȴ�.   
*/

//"exit"�� �ԷµǸ� while���� ������� break���� Ȱ���ϴ� ���α׷��� �ۼ��϶� 
public class Ex3_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while (true) {
			System.out.print(">>");
			String text = scanner.nextLine(); // �� ���� �б�
			if (text.equals("exit")) // "exit"�� �ԷµǸ� �ݺ� ����
				break; // while���� ���
		}
		
		System.out.println("�����մϴ�...");
		scanner.close();
	}

}