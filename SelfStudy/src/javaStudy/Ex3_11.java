package javaStudy;

/*
 비정방형 배열은 행마다 열의 개수가 서로 다른 배열을 말한다. 
 어던 메소드가 배열을 매개변수로 받을 때, 배열이 정방형인지 
 비정방형인지는 표시되지 않기 때문에 항상 length 필드를 사용하여
 각 행의 열의 개수를 파악하여야 한다.
 배열 생성시에 초기화를 통해 비정방형 배열을 생성할 수도 있다.
 */

public class Ex3_11 {
	public static void main(String[] args) {
		int intArray[][] = new int[4][]; // 각 행의 레퍼런스 배열 생성
		intArray[0] = new int[3]; // 첫째 행의 정수 3개의 배열 생성
		intArray[1] = new int[2]; // 둘째 행의 정수 2개의 배열 생성
		intArray[2] = new int[3]; // 셋째 행의 정수 3개의 배열 생성
		intArray[3] = new int[2]; // 넷째 행의 정수 2개의 배열 생성

		for (int i = 0; i < intArray.length; i++) // 행에 대한 반복
			for (int j = 0; j < intArray[i].length; j++) // 열에 대한 반복
				intArray[i][j] = (i + 1) * 10 + j;

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++)
				System.out.print(intArray[i][j] + " ")
				;
				System.out.println();
		}
	}
}