package javaStudy;

//예제 5-9 인터페이스를 구현하고 동시에 슈퍼클래스를 상속받는 사례 
/*
  클래스를 상속받으면서 동시에 인터페이스를 구현할 수 있다.
  다중 상속, 다중 인터페이스 구현은 유용하지만 남용하면 클래스, 인터페이스간의 
  관계가 복잡해져 프로그램의 전체 구조를 파악하기 어려울 수 있으므로 주의해야 한다 
 */
interface MobilePhoneInterface extends PhoneInterface{ //인터페이스 상속
	void sendSMS(); 
	void receiveSMS(); 	
}

interface MP3Interface{ //인터페이스 선언 
	public void play(); 
	public void stop(); 
}

class PDA{ //클래스 작성
	public int calculate(int x, int y) {
		return x + y; 
	}
}

class smartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

	@Override
	public void sendCall() {
		System.out.println("♬");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화왔습니다");
		
	}

	@Override
	public void play() {
		System.out.println("음악 연주합니다");
		
	}

	@Override
	public void stop() {
		System.out.println("음악 중단합니다");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("문자 발신");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자 수신");
		
	}
	
	//추가로 작성한 메소드
	public void schedule() {
		System.out.println("일정 관리합니다");
	}
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		
		smartPhone phone = new smartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
		phone.schedule();
		
	}

}
