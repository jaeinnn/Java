package javaStudy;

/*
 �������� �迭�� �ึ�� ���� ������ ���� �ٸ� �迭�� ���Ѵ�. 
 ��� �޼ҵ尡 �迭�� �Ű������� ���� ��, �迭�� ���������� 
 �������������� ǥ�õ��� �ʱ� ������ �׻� length �ʵ带 ����Ͽ�
 �� ���� ���� ������ �ľ��Ͽ��� �Ѵ�.
 �迭 �����ÿ� �ʱ�ȭ�� ���� �������� �迭�� ������ ���� �ִ�.
 */

public class Ex3_11 {
	public static void main(String[] args) {
		int intArray[][] = new int[4][]; // �� ���� ���۷��� �迭 ����
		intArray[0] = new int[3]; // ù° ���� ���� 3���� �迭 ����
		intArray[1] = new int[2]; // ��° ���� ���� 2���� �迭 ����
		intArray[2] = new int[3]; // ��° ���� ���� 3���� �迭 ����
		intArray[3] = new int[2]; // ��° ���� ���� 2���� �迭 ����

		for (int i = 0; i < intArray.length; i++) // �࿡ ���� �ݺ�
			for (int j = 0; j < intArray[i].length; j++) // ���� ���� �ݺ�
				intArray[i][j] = (i + 1) * 10 + j;

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++)
				System.out.print(intArray[i][j] + " ")
				;
				System.out.println();
		}
	}
}