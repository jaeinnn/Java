package javaStudy;

import java.util.Scanner;

/*
break문은 하나의 반복문을 즉시 벗어날 때 사용하며 다음과 같이 사용한다
  
     break; 
     
break문이 실행되면 현재의 반복문을 벗어나 실행이 계속된다.
break문은 하나의 반복문만 벗어난다.
중첩 반복의 경우 안쪽 반복문에서 break문이 실행되면, 
안쪽 반복문만 벗어나고 바깥쪽 반복문 내에서 실행이 유지된다.   
*/

//"exit"이 입력되면 while문을 벗어나도록 break문을 활용하는 프로그램을 작성하라 
public class Ex3_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("exit을 입력하면 종료합니다.");
		while (true) {
			System.out.print(">>");
			String text = scanner.nextLine(); // 한 라인 읽기
			if (text.equals("exit")) // "exit"이 입력되면 반복 종료
				break; // while문을 벗어남
		}
		
		System.out.println("종료합니다...");
		scanner.close();
	}

}