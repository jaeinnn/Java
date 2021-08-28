package javaStudy;

/*
 main()을 실행하는 main스레드
 
 JVM은 자바 응용 프로그램을 실행하기 직전, 사용자 스레드를 하나 만들고,
 이 스레드로 하여금 main()메소드를 실행하도록 한다.
 이 스레드가 메인스레드이고 실행 시작 주소는 main() 메소드의 첫 코드가 된다.
 
 자바 응용프로그램의 main()메소드가 실행되는 순간 2개의 스레드가 존재하는 셈이다
 하나는 main스레드이고 다른 하나는 JVM내에 자동으로 생성된 가비지 컬렉션 스레드이다 
 */

public class ThreadMainEx {
	public static void main(String[] args) {
		
		long id = Thread.currentThread().getId(); //스레드 ID 얻기
		String name = Thread.currentThread().getName(); //스레드 이름 얻기
		int priority = Thread.currentThread().getPriority(); //스레드 우선순위값 얻기 
		
		Thread.State s = Thread.currentThread().getState(); //스레드 상태값 얻기
		
		System.out.println("현재 스레드 이름 = " + name);
		System.out.println("현재 스레드 ID = " + id);
		System.out.println("현재 스레드 우선순위 값 = " + priority);
		System.out.println("현재 스레드 상태  = " + s);
	}

}
