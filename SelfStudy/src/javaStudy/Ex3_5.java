package javaStudy;
import java.util.Scanner;

/*
�ݺ��� ���� continue���̳� break���� �̿��ϸ�  �ݺ��� �帧�� �ٲٰų� �ݺ����� ����� �� �� �ִ�.
break���� ���� �ݺ����� ����� �ϸ�, continue���� ��� ���� �ݺ����� �Ѿ�� 
*/

/*

continue���� �ݺ����� ���������� �����鼭 
��� ���� �ݺ����� �Ѿ���� �� �� ���ȴ�.
continue���� ������ ���� �����ϰ� ����Ѵ�.

 continue; 
 
continue���� ���� ���� ��ΰ� ����ȴ�.
for������ continue���� ������ '�ݺ� �� �۾�'���� �б��ϰ�,
while���̳� do-while�������� ���ǽ��� �˻��ϴ� �������� �б��Ѵ�.

*/


//5���� ������ �Է¹ް� �� �� ����鸸 ���Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
//�Էµ� ���� 0�̳� �����̸� continue���� �̿��Ͽ� ������ �ʰ� ���� �ݺ����� �Ѿ��
public class Ex3_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ 5�� �Է��ϼ���.");
		int sum = 0;
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt(); //Ű���忡�� ���� �Է�
			if(n<=0)
				continue; //����� �ƴ� ��� ���� �ݺ����� ����
			else
				sum += n; //����� ��쵡�� 
		}
		System.out.println("����� ���� " + sum);
		
		scanner.close();
		
	}

}