package javaStudy;

//do-while문

/*
 
 do-while문의 조건식은 while문과 동일하며 조건식이 없으면 컴파일 오류가 발생한다.
 다른 반복문과 달리, do-while문은 작업문 실행 후 조건식을 검사하므로 
 작업문이 최초 한 번은 반드시 실행된다.
 do-while문에서도 조건식에 사용되는 변수는 do-while문 실행 이전에 
 반드시 초기화가 이루어져야 하며, 무한 반복에 빠지지 않기 위해 반복이 진행되는 동안
 조건식을 false로 만들 수 있도록 설계가 되어야 한다.
  
*/

//do-while문을 이용하여 'a'부터 'z'까지 출력하는 프로그램을 작성하라
public class Ex3_3 {
	public static void main(String[] args) {
		char c = 'a';

		do {
			System.out.print(c);
			c = (char) (c + 1); // 영문의 경우 1을 더하면 다음 문자의 코드 값
		} while (c <= 'z');
	//while문 안이 true면 do 쪽으로 돌아가고 false면 break되는 것! 

	}
}