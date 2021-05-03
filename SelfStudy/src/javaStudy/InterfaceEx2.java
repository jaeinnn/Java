package javaStudy;

//���� 5-9 �������̽��� �����ϰ� ���ÿ� ����Ŭ������ ��ӹ޴� ��� 
/*
  Ŭ������ ��ӹ����鼭 ���ÿ� �������̽��� ������ �� �ִ�.
  ���� ���, ���� �������̽� ������ ���������� �����ϸ� Ŭ����, �������̽����� 
  ���谡 �������� ���α׷��� ��ü ������ �ľ��ϱ� ����� �� �����Ƿ� �����ؾ� �Ѵ� 
 */
interface MobilePhoneInterface extends PhoneInterface{ //�������̽� ���
	void sendSMS(); 
	void receiveSMS(); 	
}

interface MP3Interface{ //�������̽� ���� 
	public void play(); 
	public void stop(); 
}

class PDA{ //Ŭ���� �ۼ�
	public int calculate(int x, int y) {
		return x + y; 
	}
}

class smartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

	@Override
	public void sendCall() {
		System.out.println("��");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�Խ��ϴ�");
		
	}

	@Override
	public void play() {
		System.out.println("���� �����մϴ�");
		
	}

	@Override
	public void stop() {
		System.out.println("���� �ߴ��մϴ�");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("���� �߽�");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("���� ����");
		
	}
	
	//�߰��� �ۼ��� �޼ҵ�
	public void schedule() {
		System.out.println("���� �����մϴ�");
	}
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		
		smartPhone phone = new smartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3�� 5�� ���ϸ� " + phone.calculate(3, 5));
		phone.schedule();
		
	}

}
