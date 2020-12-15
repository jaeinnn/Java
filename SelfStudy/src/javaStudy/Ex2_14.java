package javaStudy;
import java.util.Scanner;

/*
switch문
: 값에 따라 여러 방향으로 분기하는 경우, 
if문보다 switch문을 사용하면 
가독성이 높은 좋은 코드를 작성할 수 있다. 

switch문은 먼저 식을 계산하고 그 결과 값이 일치하는 case문으로 분기한다.
case문의 실행 문장을 실행한 후 break를 만나면 switch문을 벗어난다.
만약 어떤 case문으로도 분기하지 못하는 경우 default문으로 분기한다.
default문은 생략 가능하며, 실행문장은 '{'와 '}'로 둘러싸지 않는다.
*/

//예제 2-12의 학점 매기는 코드를 switch문으로 다시 작성하라. 
public class Ex2_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		char grade; 
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();
		
		switch(score/10) {
		case 10: //score = 100
		case 9: //score는 90~99
			grade = 'A'; //case10, case9의 경우 모두 실행
			break; 
		case 8: //score는 80~89
			grade = 'B'; 
			break; 
		case 7: //score는 70~79
			grade = 'C';
			break; 
		case 6: //score는 60~69
			grade ='D'; 
			break;
		default: //score는 59 이하 
			grade = 'F'; 
		}
		System.out.println("학점은 " + grade + "입니다");
		
		scanner.close();
	}

}