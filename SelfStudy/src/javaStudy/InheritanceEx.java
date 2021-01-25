package javaStudy;
/*
클래스 Person을 아래와 같은 필드를 갖도록 선언하고, 
클래스 Student는 Person을 상속받아 각 멤버 필드에 값을 저장하라 

 private int weight; 
 int age;
 protected int height; 
 public String name; 
 */

/*이 예제에서 Person클래스의 private필드인 weight는 
 Student 클래스에서는 접근이 불가능하여 
 슈퍼클래스인 Person의 get,set메소드를 통해서만 조작이 가능하다
 */

class Person {
	private int weight;// private 접근지정. Student클래스에서 접근 불가
	int age; // 디폴트 접근 지정. Student 클래스에서 접근 가능
	protected int height; // protected
	public String name; // public 접근 지정. Student클래스에서접근 가능

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 30; //슈퍼 클래스의 디폴트 멤버 접근 가능
		name = "홍길동"; //슈퍼 클래스의 public 멤버 접근 가능
		height = 175; //슈퍼 클래스의 protected 멤버 접근 가능
		//weight = 99; //오류. 슈퍼클래스의 private 멤버접근 불가
		setWeight(99);//private 멤버 weight은 setWrite()로 간접 접근
	}
}
public class InheritanceEx {
	public static void main(String[] args) {
		Student s = new Student(); 
		s.set();
	}

}