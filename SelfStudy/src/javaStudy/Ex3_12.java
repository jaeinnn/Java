package javaStudy;

//�޼ҵ忡�� �迭 �����ϱ�
public class Ex3_12 {
	
	/*
	 ���� 4���� ������ ������ �迭�� �����ϰ� 1,2,3,4�� �ʱ�ȭ�� ����, 
	 �迭�� �����ϴ� makeArray()�� �ۼ��ϰ�, ��
	 �޼ҵ�κ��� �迭�� ���޹޾� ���� ����ϴ� ���α׷��� �ۼ��϶�.
	 */
	static int[] makeArray() { // ������ �迭�� �����ϴ� �޼ҵ�
		int temp[] = new int[4]; // �迭 ����
		for (int i = 0; i < temp.length; i++)
			temp[i] = i; // �迭�� ���Ҹ� 0,1,2,3�����ʱ�ȭ

		return temp; // �迭 ����
	} // makeArray()�� �����ص� ������ �迭�� �Ҹ���� �ʴ´�

	public static void main(String[] args) {
		int intArray[]; // �迭 ���۷��� ���� ����
		intArray = makeArray(); // �޼ҵ�κ��� �迭���޹���
		//intArray�� makeArray()�� ������ �迭�� ����Ų��. 
		for (int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + " "); //�迭 ��� ���� ��� 
	}
}