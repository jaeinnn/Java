package JavaStudy;

/*
 변수는 데이터를 저장하는 공간이다. 
 변수를 선언하면 타입 크기의 메모리가 할당되며, 
 프로그램은 실행 중에 값을 쓰고 읽는 공간으로 사용한다.  
 */


//리터럴(literal) 
/*
 리터럴이란 프로그램에 직접 표현한 값을 말한다.
 정수, 실수, 문자, 논리, 문자열 타입 모두 리터럴이 있으며 
 예를 들면 다음과 같다
 
34, 42.195, '%', true, "Hello" 
 */
//정수 리터럴은 int 타입으로 자동 컴파일된다.
//만일 long타입으로 지정하려면 숫자 뒤에 L또는 l을 붙이면 된다
public class ex2_2 {

//상수 PI를 선언하고 원의 면적을 구하는 프로그램을 작성하라
	public static void main(String[] args) {
		final double PI = 3.14; //원주율을 상수로 선언

	double radius = 10.0; //원의 반지름
	double circleArea = radius*radius*PI; //원의 면적 계산
	
	//원의 면적을 화면에 출력
	System.out.println("원의 면적 = " + circleArea);
	}
}
