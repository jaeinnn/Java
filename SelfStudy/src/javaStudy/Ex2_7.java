package javaStudy;

/* 
  비교연산자는 두 개의 피연산자를 비교하여 
 true 또는 false의 논리 값을 내는 연산자이며, 
  논리연산자는 논리 값을 대상으로 
 AND,OR,XOR,NOT의 논리 연산을 하여 논리 값을 내는 연산자이다.
*/

//a^b는 a와 b의 XOR연산. a와 b가 서로 다를 때 true
//EX) (3>5)^(1==1)은 true이다. 좌는 false, 우는 true이기 때문. 
public class Ex2_7 {
	//비교 연산자와 논리 연산자의 사례 
	public static void main(String[] args) {
		//비교연산
		System.out.println('a'>'b');//false
		System.out.println(3>=2); //true 
		System.out.println(-1<0); //true
		System.out.println(3.45<=2); //false
		System.out.println(3==2);//false
		System.out.println(3!=2);//true
		System.out.println(!(3!=2));//false
		
		//비교 연산과 논리 연산 복합
		System.out.println((3>2) && (3>4));//false
		System.out.println((3!=2)||(-1>0)); //true
		System.out.println((3!=2)^(-1>0)); //true 
	
	}
}