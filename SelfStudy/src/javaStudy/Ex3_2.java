//while��
package javaStudy;

import java.util.Scanner;

/* while���� ���� 
while (���ǽ�) {
   ..�۾���..
 } 

while���� �ݺ� Ƚ���� �� �� ���� ��쿡 �����ϴ�. while���� ���ǽ��� for���� ���� �����ϸ�,
true�� ���� �۾����� ������ �ݺ��ϰ�, false�� �Ǹ� while���� �����.
for���� �޸�, while������ ���ǽ��� ������ ������ ������ �߻��Ѵ�.

while���� ����ϴ� ���, ���ǽĿ� ���Ǵ� ������ while�� ���� ���� 
�ʱ�ȭ�ϴ°��� ���� ���ƾ� �Ѵ�. �׸��� �ݺ��� ����Ǹ鼭 ���ǽ��� false�� �Ǿ� 
�ݺ����� �������� �� �ֵ��� ����Ǿ�� �Ѵ�. �׷��� ������ ���ѹݺ��� ������ �ȴ�.
*/

/*while���� �ݺ� Ƚ���� ���� ���ϴ� ��쿡 �̿�ȴٰ� �ߴ�. while���� �̿��Ͽ�
-1���Էµ� ������ ������ ��� �Է¹޾� ���� ���ϰ� ����� ����ϴ� ���α׷��� �ۼ��϶�*/
public class Ex3_2 {
	public static void main(String[] args) {

		int count = 0; // count�� �Էµ� ������ ����
		int sum = 0; // sum�� ��

		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");

		int n = scanner.nextInt(); // ���� �Է�
		while (n != -1) { // -1�� �ԷµǸ� while�� ���

			sum += n;
			count++;
			n = scanner.nextInt(); // ���� �Է�
		}
		if (count == 0)
			System.out.println("�Էµ� ���� �����ϴ�.");
		else {

			System.out.println("�Էµ� ������ ������" + count + "���̸�");
			System.out.println("�����" + (double) sum / count + "�Դϴ�.");

		}
		scanner.close();

	}
}