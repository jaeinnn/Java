//while문
package javaStudy;

import java.util.Scanner;

/* while문의 구조 
while (조건식) {
   ..작업문..
 } 

while문은 반복 횟수를 알 수 없는 경우에 적합하다. while문의 조건식은 for문의 경우와 동일하며,
true인 동안 작업문의 실행을 반복하고, false가 되면 while문을 벗어난다.
for문과 달리, while문에는 조건식이 없으면 컴파일 오류가 발생한다.

while문을 사용하는 경우, 조건식에 사용되는 변수를 while문 실행 전에 
초기화하는것을 잊지 말아야 한다. 그리고 반복이 진행되면서 조건식이 false가 되어 
반복문을 빠져나올 수 있도록 설계되어야 한다. 그렇지 않으면 무한반복에 빠지게 된다.
*/

/*while문은 반복 횟수를 알지 못하는 경우에 이용된다고 했다. while문을 이용하여
-1이입력될 때까지 정수를 계속 입력받아 합을 구하고 평균을 출력하는 프로그램을 작성하라*/
public class Ex3_2 {
	public static void main(String[] args) {

		int count = 0; // count는 입력된 정수의 개수
		int sum = 0; // sum은 합

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

		int n = scanner.nextInt(); // 정수 입력
		while (n != -1) { // -1이 입력되면 while문 벗어남

			sum += n;
			count++;
			n = scanner.nextInt(); // 정수 입력
		}
		if (count == 0)
			System.out.println("입력된 수가 없습니다.");
		else {

			System.out.println("입력된 정수의 개수는" + count + "개이며");
			System.out.println("평균은" + (double) sum / count + "입니다.");

		}
		scanner.close();

	}
}