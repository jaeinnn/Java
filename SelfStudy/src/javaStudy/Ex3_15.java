package javaStudy;

import java.util.Scanner;

/*
try-catch 블록을 이용하여 예제 3-14를 수정하여, 정수를 0으로 
나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고 
다시 입력받는 프로그램을 작성하라
 */
public class Ex3_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("나뉨수를 입력하세요:");
			int dividend = scanner.nextInt(); // 나뉨수입력
			System.out.print("나눗수를 입력하세요:");
			int divisior = scanner.nextInt(); // 나눗수입력
			try {

				System.out.println(dividend + "를 " + divisior + "로 나누면 몫은 " + dividend / divisior + "입니다.");
				break; // 정상적인 나누기 완료 후 while 벗어나기
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
          /*
           catch블록에서 예외처리를 해주므로 예제 3-14와 달리 프로그램이 종료되지 않는다
           catch블록 실행 후 다시 while문을 반복하고, try블록에서 정상적으로 
           나누기가 이루어지면 break문을 통해 빠져나온다.  
           */
		}
		scanner.close();
	}
}