package javaStudy;

import java.util.Scanner;

//�迭�� ũ��, length �ʵ�
/*
�ڹٴ� �迭�� ��ü�� �ٷ��. �迭�� �����Ǹ� ��ü�� �����ȴ�.
�迭�� ���� �������Բ� �迭�� ũ�� ���� ���� length�ʵ尡 �����Ѵ�.

int intArray[]; 
intArray = new int[5]; 

length �ʵ带 �̿��ϸ� �迭��ũ�⸦ �����ϰ� �˾Ƴ� �� �ִ�. 

int size = intArray.length; //size�� 5


�迭 ��ü�� length �ʵ尡 �ֱ� ������,
���α׷����� �迭�� ũ�⸦ ���� ������ �ʿ䰡 ����.
�迭�� ũ�⸸ŭ �ݺ��� ��, length �ʵ�� �ſ� �����ϴ�.
������ intArray �迭�� ��� ���� ����ϴ� �ڵ��̴�.

for(int i=0; i<intArray.length; i++) //intArray �迭 ũ��(5)��ŭ �ݺ��Ѵ�.
 System.out.println(intArray[i]); 

*/

//�迭�� length �ʵ带 �̿��Ͽ� �迭 ũ�⸸ŭ ������ �Է¹ް� ����� ���ϴ� ���α׷��� �ۼ��϶�
public class Ex3_8 {
	public static void main(String[] args) {

		int intArray[] = new int[5]; // �迭�� ����� ����
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "���� ������ �Է��ϼ���>> ");
		for (int i = 0; i < intArray.length; i++)
			intArray[i] = scanner.nextInt(); // Ű���忡�� �Է¹��� ���� ����

		for (int i = 0; i < intArray.length; i++)
			sum += intArray[i]; // �迭�� ����� ���� �� ���ϱ�

		System.out.print("����� " + (double) sum / intArray.length);
		scanner.close();

	}

}