package javaStudy;

//예제 5-8
//PhoneInterface를 구현하고 flash()메소드를 추가한 iPhone클래스를 작성하라 
interface PhoneInterface{ //인터페이스 선언
	final int TIMEOUT = 10000; //상수 필드 선언
	void sendCall(); //추상메소드
	void receiveCall(); //추상메소드
	default void printLogo() { //default메소드 
		System.out.println("** iPhone **");
	}
	
}

class iPhone implements PhoneInterface{ //인터페이스 구현
	//PhoneInterface의 모든 추상 메소드 구현 

	@Override
	public void sendCall() {
		System.out.println("♪");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화왔습니다");
		
	}
	
	//메소드 추가 작성
	public void flas() { 
		System.out.println("아이폰에 불이 켜졌습니다");
	}
	
}

public class InterfaceEx {
	public static void main(String[] args) {
		iPhone phone = new iPhone(); 
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flas();
	}

}
