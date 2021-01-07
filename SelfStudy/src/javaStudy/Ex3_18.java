package javaStudy;

//���ڿ��� ������ ��ȯ�� �� �߻��ϴ� NumberFormatException�� ó���ϴ� ���α׷��� �ۼ��϶�
public class Ex3_18 {
	public static void main(String[] args) {

		String[] stringNumber = { "23", "12", "3.141592", "998" };

		int i = 0;
		try {
			for (i = 0; i < stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]); 
				//3.141592�������� ��ȯ�� �� NumberFormatException ���� �߻�
				System.out.println("������ ��ȯ�� ���� " + j);
			}
		} catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "�� ������ ��ȯ�� �� �����ϴ�.");
		}

	}
}