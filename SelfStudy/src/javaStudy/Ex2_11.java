package javaStudy;
import java.util.Scanner;

/*

if-else���� if�� ���ǽ��� ���� ���� ������ ��쿡 ���� ������ ������ ������ �� �ִ�.
if�� else�� ���๮�� �ϳ��� �����̸� �߰�ȣ({})�� ������ �� �ִ�. 
 */

//�Էµ� ���� 3�� ������� �Ǻ��ϴ� ���α׷��� �ۼ��϶�
public class Ex2_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("���� �Է��ϼ���: ");
		
		int number = scanner.nextInt(); //������ �Է¹޴´�
		if(number %3 == 0) //3���� ���� �������� 0���� �˻�
			System.out.println("3�� ����Դϴ�");
		else
			System.out.println("3�� ����� �ƴմϴ�."); 
		
		scanner.close(); 
	}
}