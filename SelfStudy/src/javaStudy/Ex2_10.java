package javaStudy;
import java.util.Scanner;

/*
if문의 조건식은 비교 연산이나 논리 연산이 혼합된 식으로 구성되며,
조건식의 결과는 boolean값이다.
조건식이 참(true)이면 if 내부의 '실행문장'이 실행되며,
거짓(false)이면 if문을 벗어난다. 
조건식은 boolean타입의 변수 하나만으로도 가능하다.
*/

//시험점수가 80점 이상이라면 합격 판별을 하는 프로그램을 작성하라
public class Ex2_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		if(score >= 80) 
			System.out.println("합격입니다.");
		
		scanner.close();
	}
}