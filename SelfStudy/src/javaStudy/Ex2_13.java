package javaStudy;
import java.util.Scanner;

/*  ��ø if-else��  
: if���̳� if-else��, else���� '���� ����'��, 
if���̳� if-else���� ������ �� �ִ�. */

//������ �г��� �Է¹޾� 60�� �̻��̸� �հ�,�̸��̸� ���հ��� ����Ѵ�.
//4�г��� ��� 70�� �̻��̾�� �հ��̴�. 
public class Ex2_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("������ �Է��ϼ���(0~100): ");
		int score = scanner.nextInt(); //���� �б� 
		System.out.print("�г��� �Է��ϼ���(1~4): ");
		int year = scanner.nextInt(); //�г� �б� 
		
		if(score>=60) { //60�� �̻�
			if(year !=4) 
				System.out.println("�հ�!"); //4�г� �ƴϸ� �հ�
				else if(score>=70)
					System.out.println("�հ�!"); //4�г��� 70�� �̻��̸� �հ�
				else
					System.out.println("���հ�!"); //4�г��� 70�� �̸��̸� ���հ�
			}
			else //60�� �̸� ���հ�
				System.out.println("���հ�!");
			
			scanner.close();
		}
}