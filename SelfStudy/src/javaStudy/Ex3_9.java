package javaStudy;
//�迭�� for-each��

/*
������ for���� �����Ͽ�, �迭�̳� ����(enumeration)�� 
ũ�⸸ŭ ������ ���鼭 �� ���Ҹ� ���������� �����ϴµ� �����ϰ�
���� for���� for-each��(����Ŭ������ advanced for��� �θ�)
�̶�� �θ���, ������ ������ ����

 for(���� : �迭���۷���) {
       ..�ݺ� �۾���..
  }
  
 */

public class Ex3_9 {
	enum Week {
		��, ȭ, ��, ��, ��, ��, ��
	}

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5 };
		String names[] = { "���", "��", "�ٳ���", "ü��", "����", "����" };

		int sum = 0;
		// �Ʒ� for-each���� k�� n[0],n[1],...,n[4]�� �ݺ�
		for (int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("����" + sum);

		// �Ʒ� for-each���� s�� names[0], names[1], ... , names[5]�� �ݺ�
		for (String s : names)
			System.out.print(s + " ");
		System.out.println();

		// �Ʒ� for-each���� day�� ��,ȭ,��,��,��,��,�� ������ �ݺ�
		for (Week day : Week.values())
			System.out.print(day + "���� ");
		System.out.println();

	}

}
