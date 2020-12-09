package javaStudy;

//조건 연산 
//조건 연산자는 3개의 피연산자로 구성되어 삼항(ternary)연산자라고도 한다
/*condition ? opr2 : opr3 에서 
  조건문(condition)이 true면 결과값이 opr2가 되고 
 false면 opr3의 값이 된다. opr2나 opr3은 식이 될수도 있고 
  값이 될 수도있다. 
  int x = 5, y = 3; 
  int s= (x>y)?1:-1; 의 실행 결과는 1이 된다.
  x가 y보다 크기때문에 1이 s에 대입되는 것. 
 */
public class Ex2_8 {
	//조건 연산자의 사례 
	public static void main(String args[]) {
		int a = 3, b= 5; 
		System.out.println("두 수의 차는" + ((a>b)?(a-b):(b-a)));
	}

}