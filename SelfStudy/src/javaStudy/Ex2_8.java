package javaStudy;

//���� ���� 
//���� �����ڴ� 3���� �ǿ����ڷ� �����Ǿ� ����(ternary)�����ڶ�� �Ѵ�
/*condition ? opr2 : opr3 ���� 
  ���ǹ�(condition)�� true�� ������� opr2�� �ǰ� 
 false�� opr3�� ���� �ȴ�. opr2�� opr3�� ���� �ɼ��� �ְ� 
  ���� �� �����ִ�. 
  int x = 5, y = 3; 
  int s= (x>y)?1:-1; �� ���� ����� 1�� �ȴ�.
  x�� y���� ũ�⶧���� 1�� s�� ���ԵǴ� ��. 
 */
public class Ex2_8 {
	//���� �������� ��� 
	public static void main(String args[]) {
		int a = 3, b= 5; 
		System.out.println("�� ���� ����" + ((a>b)?(a-b):(b-a)));
	}

}