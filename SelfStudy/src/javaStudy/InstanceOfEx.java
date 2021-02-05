package javaStudy;
//캐스팅(casting)이란 타입 변환을 말한다.
//자바에서 클래스에 대한 캐스팅은 업캐스팅과 다운캐스팅으로 나뉜다


/*
 서브 클래스의 객체에 대한 레퍼런스를 슈퍼클래스 타입으로 변환하는 것을 업캐스팅이라고 한다.
 업캐스팅한 레퍼런스로는 객체 내에 모든 멤버에 접근할 수 없고 슈퍼 클래스의 멤버만 접근할 수 있다.
*/

/*
업캐스팅과 반대로 캐스팅하는 것을 다운캐스팅이라고 한다.
다운캐스팅은 업캐스팅과 달리 명시적으로 타입 변환을 지정해야 한다.
*/

/*
업캐스팅을 한 경우, 레퍼런스가 가리키는 객체의 진짜 클래스 타입을 구분하기 어렵다.

레퍼런스가 가리키는 객체가 어떤 클래스 타입인지를 구분하기 위해,
자바에서는 instanceof 연산자를 두고 있다.
instanceof는 이항 연산자로서 다음과 같이 사용된다.

레퍼런스 instanceof 클래스명

instanceof 연산자의 결과 값은 boolean값으로,
'레퍼런스'가 가리키는 객체가 해당 '클래스'타입의 객체이면
true이고 아니면 false로 계산한다.

instanceof는 클래스에만 적용된다.

*/
class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceOfEx {
	static void print(Person p) {
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Professor ");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() ->\t"); print(new Student());
		System.out.print("new Researcher() ->\t"); print(new Researcher());
		System.out.print("new Professor() ->\t"); print(new Professor());
	}
}