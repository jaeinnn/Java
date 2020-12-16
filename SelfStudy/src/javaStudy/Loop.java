package javaStudy;

//반복문 
/*
for문은 처음부터 반복 횟수를 알 수 있는 경우에,
while문과 do-while문은 반복 횟수를 알 수 없고 
조건에 따라 반복이 계속되거나 중단되는 경우에 이용한다.
while문은 반복 조건을 처음부터 따지는경우에, do-while문은 반복 조건을
나중에 따지는경우에 적합하다. 
*/

//for문
/* 초기문 
: for문에서 초기문은 주로 조건식에서 사용하는 변수를 초기화한다. 
-초기문은 시작할 때 한 번만 수행된다.
-콤마(,)로 분리하여 여러 문장을 나열할 수 있다.
-초기문은 빈 상태로 두어도 되지만 끝에 세미콜론(;)은 있어야 한다.
*/

//조건식
/*
조건식에는 논리형 변수나 논리 연산을 사용한다. 조건식의 결과가 true이면 반복이 계속되며
false이면 for문을 벗어난다. 조건식은 for문의 작업 문장을 수행하기 전에 검사되므로
조건식이 처음부터 false이면 바로 반복문을 벗어난다.  
조건식에 true가 있거나 비어 있으면 무한반복(infinite loop)된다. 
*/

public class Loop {
	public static void main(String[] args) {
		//조건식
		int i;
		for(i=0; i<10; i++) { //i가 0~9까지 10번 반복
			System.out.print(i); //0에서 9까지 출력
		}
		
		
		System.out.println();
		for(i=0; i<10; i+=2) {
			System.out.print(i); // 한번 반복할 때마다 i가 2씩 증가(i+=2)하므로 i값이 0,2,4,6,8로 변하면서 5번 반복한다.		
		}
		
		
		System.out.println();
	//'반복 후 작업문'에는 콤마(,)로 분리하여 여러 문장을 나열할 수 있다. 
	for(i=0; i<10; i++, System.out.println(i)) {
		System.out.print(i);
	} //이 코드는 i값을 증가시키고 증가된 i값을 화면에 출력한다.
	System.out.println();
	
	}
}