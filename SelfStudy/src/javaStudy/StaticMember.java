package javaStudy;

import java.util.Scanner;

/* static 메소드의 제약조건 

*static 메소드는 static 멤버만 접근할 수 있다
: static 메소드는, 객체 없이도 존재하기 때문에, 객체와 함께
생성되는 non-static멤버를 사용할 수 없고 static 멤버들만 사용 가능하다.
반면 non-static메소드는 static멤버들을 사용할 수 있다

*static 메소드는 this를 사용할 수 없다 
: static 메소드는, 객체 없이도 존재하기 때문에, this를 사용할 수 없다.
 */


public class StaticMember{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("환율(1달러)>> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate); //미국 달러 환율 설정
		System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000)
		+ "입니다.");
		System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");
		scanner.close();
	}
}
