//자바 프로그램의 기본 구조 
package JavaStudy;

/*
 소스파일 : ex2_1.java
*/
public class ex2_1 {
	
	public static int sum(int n, int m) {
		return n + m; 
	} //line 9~11 : 메소드 


//main() 메소드에서 실행 시작
	public static void main(String[] args) {
		int i = 20; 
		int s; 
		char a;
		
		s = sum(i, 10); //메소드 호출
		a = '?';
		System.out.println(a); //문자 '?' 출력
		System.out.println("Hello"); //"Hello" 문자열 출력
		System.out.println(s); //정수 s값 30 출력
		
	} //line14~26 : 메소드 
	
} //line 7~28 : 클래스 

/*

*클래스를 만들고 그 안에 변수, 상수, 함수(메소드)등 모든 프로그램 요소를 작성한다.
클래스 바깥에는 어떤 것도 작성하면 안 된다. 

*main()메소드는 반드시 public, static, void 타입으로 선언되어야 하며,
한 클래스에 2개 이상의 main()을 작성하면 안 된다. 자바 응용프로그램이 여러 클래스로
이루어지는 경우, 실행을 시작할 클래스에만 main()을 두면 되므로, 모든 클래스가
main()을 가지지는 않는다. 

*클래스의 멤버함수(아마 C++)를 자바에서는 메소드(method)라고 부른다.
메소드의 이름은 개발자가 지정하며, 메소드 개수에는 제한이 없다. 메소드 작성이나
호출 방법은 기본적으로 C/C++d의 함수와 같다. 


*변수 선언
-변수란 프로그램 실행 동안 데이터를 저장하는 공간으로 개발자가 이름을 붙이고 선언한다. 
메소드 내에 선언되어 사용되는 변수를 지역변수(local variable)라고 한다.
지역변수는 메소드 내에서만 사용되며, 메소드의 실행이 끝나면 소멸된다.
int i = 30; 이런식으로 선언하면 변수 선언과 동시에 값을 초기화할 수 있다. 


*/

