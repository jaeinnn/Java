package javaStudy;
//배열과 for-each문

/*
기존의 for문을 변형하여, 배열이나 나열(enumeration)의 
크기만큼 루프를 돌면서 각 원소를 순차적으로 접근하는데 유용하게
만든 for문을 for-each문(오라클에서는 advanced for라고 부름)
이라고 부르며, 구조는 다음과 같다

 for(변수 : 배열레퍼런스) {
       ..반복 작업문..
  }
  
 */

public class Ex3_9 {
	enum Week {
		월, 화, 수, 목, 금, 토, 일
	}

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5 };
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };

		int sum = 0;
		// 아래 for-each에서 k는 n[0],n[1],...,n[4]로 반복
		for (int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("합은" + sum);

		// 아래 for-each에서 s는 names[0], names[1], ... , names[5]로 반복
		for (String s : names)
			System.out.print(s + " ");
		System.out.println();

		// 아래 for-each에서 day는 월,화,수,목,금,토,일 값으로 반복
		for (Week day : Week.values())
			System.out.print(day + "요일 ");
		System.out.println();

	}

}
