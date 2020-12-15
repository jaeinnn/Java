package javaStudy;

import java.util.Scanner;

/*
다중 if-else문은 if-else가 연속되는 것이다.
위에서부터 조건식이 참인 경우, 해당하는 실행 문장을 실행한 후
다중 if-else문을 벗어난다.  
 */

//다중 if-else문을 이용하여 입력받은 성적에 대해 학점을 부여하는 프로그램을 작성하라.
public class Ex2_12 {
	public static void main(String[] args) {
		char grade;
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();// 점수 읽기
		if (score >= 90) // score가 90 이상
			grade = 'A';
		else if (score >= 80) // score가 80 이상 90 미만
			grade = 'B';
		else if (score >= 70) // score가 70 이상 80 미만
			grade = 'C';
		else if (score >= 60) // score가 60 이상 70 미만
			grade = 'D';
		else // score가 60 미만
			grade = 'F';
		System.out.println("학점은 " + grade + "입니다.");

		scanner.close();
	}
}