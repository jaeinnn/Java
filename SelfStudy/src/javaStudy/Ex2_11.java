package javaStudy;
import java.util.Scanner;

/*

if-else문은 if의 조건식이 참인 경우와 거짓인 경우에 각각 실행할 문장을 지시할 수 있다.
if와 else의 실행문이 하나의 문장이면 중괄호({})를 생략할 수 있다. 
 */

//입력된 수가 3의 배수인지 판별하는 프로그램을 작성하라
public class Ex2_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("수를 입력하세요: ");
		
		int number = scanner.nextInt(); //정수를 입력받는다
		if(number %3 == 0) //3으로 나눈 나머지가 0인지 검사
			System.out.println("3의 배수입니다");
		else
			System.out.println("3의 배수가 아닙니다."); 
		
		scanner.close(); 
	}
}