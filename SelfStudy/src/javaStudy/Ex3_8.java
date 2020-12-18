package javaStudy;

import java.util.Scanner;

//배열의 크기, length 필드
/*
자바는 배열을 객체로 다룬다. 배열이 생성되면 객체가 생성된다.
배열의 저장 공간과함께 배열의 크기 값을 가진 length필드가 존재한다.

int intArray[]; 
intArray = new int[5]; 

length 필드를 이용하면 배열의크기를 간단하게 알아낼 수 있다. 

int size = intArray.length; //size는 5


배열 객체에 length 필드가 있기 때문에,
프로그램에서 배열의 크기를 따로 관리할 필요가 없다.
배열의 크기만큼 반복할 때, length 필드는 매우 유용하다.
다음은 intArray 배열의 모든 값을 출력하는 코드이다.

for(int i=0; i<intArray.length; i++) //intArray 배열 크기(5)만큼 반복한다.
 System.out.println(intArray[i]); 

*/

//배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램을 작성하라
public class Ex3_8 {
	public static void main(String[] args) {

		int intArray[] = new int[5]; // 배열의 선언과 생성
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요>> ");
		for (int i = 0; i < intArray.length; i++)
			intArray[i] = scanner.nextInt(); // 키보드에서 입력받은 정수 저장

		for (int i = 0; i < intArray.length; i++)
			sum += intArray[i]; // 배열에 저장된 정수 값 더하기

		System.out.print("평균은 " + (double) sum / intArray.length);
		scanner.close();

	}

}