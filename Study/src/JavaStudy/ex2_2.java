package JavaStudy;

/*
 변수는 데이터를 저장하는 공간이다. 
 변수를 선언하면 타입 크기의 메모리가 할당되며, 
 프로그램은 실행 중에 값을 쓰고 읽는 공간으로 사용한다.  
 */
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
