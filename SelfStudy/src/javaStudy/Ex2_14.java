package javaStudy;
import java.util.Scanner;

/*
switch��
: ���� ���� ���� �������� �б��ϴ� ���, 
if������ switch���� ����ϸ� 
�������� ���� ���� �ڵ带 �ۼ��� �� �ִ�. 

switch���� ���� ���� ����ϰ� �� ��� ���� ��ġ�ϴ� case������ �б��Ѵ�.
case���� ���� ������ ������ �� break�� ������ switch���� �����.
���� � case�����ε� �б����� ���ϴ� ��� default������ �б��Ѵ�.
default���� ���� �����ϸ�, ���๮���� '{'�� '}'�� �ѷ����� �ʴ´�.
*/

//���� 2-12�� ���� �ű�� �ڵ带 switch������ �ٽ� �ۼ��϶�. 
public class Ex2_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		char grade; 
		System.out.print("������ �Է��ϼ���(0~100): ");
		int score = scanner.nextInt();
		
		switch(score/10) {
		case 10: //score = 100
		case 9: //score�� 90~99
			grade = 'A'; //case10, case9�� ��� ��� ����
			break; 
		case 8: //score�� 80~89
			grade = 'B'; 
			break; 
		case 7: //score�� 70~79
			grade = 'C';
			break; 
		case 6: //score�� 60~69
			grade ='D'; 
			break;
		default: //score�� 59 ���� 
			grade = 'F'; 
		}
		System.out.println("������ " + grade + "�Դϴ�");
		
		scanner.close();
	}

}