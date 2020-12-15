package javaStudy;

/* <switch문 내의 break문>
switch문에서 break문은 중요하다. 
case의  실행 문장이 실행되고 만난 break문장은 switch문을 벗어나도록 지시한다.
만약 case문에 break문이 없다면 break문을 만날 때까지 case문의 실행문장으로 계속 실행한다.
break문을 만날 때까지 계속 실행한다고 생각하면 된다. 

<case문의 값>
switch문은 식의 결과 값을 case문의 값과 비교한다. case문의 값은 정수 리터럴, 
문자 리터럴, 문자열 리터럴만 허용한다. case문에는 변수나 식은 사용할 수 없다. 
 */

import java.util.Scanner;

//switch문을 이용하여 커피 메뉴의 가격을 알려주는 프로그램을 작성하라.
//에스프레소, 카푸치노, 카페라떼는 3500원이고 아메리카노는 2000원이다.
public class Ex2_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("무슨 커피 드릴까요? ");
		String order = scanner.next(); //주문 읽기
		
		int price=0;
		switch(order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500; break; 
		//"에스프레소", "카푸치노", "카페라떼" 모두 이 case문을 실행한다.
		
		case "아메리카노":
			price = 2000; break;
		default: System.out.println("메뉴에 없습니다.");
		}
		
	if(price != 0) System.out.print(order + "는 " + price + "원입니다");
	scanner.close();
	}

}