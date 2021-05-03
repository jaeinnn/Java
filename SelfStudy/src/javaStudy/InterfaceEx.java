package javaStudy;

//���� 5-8
//PhoneInterface�� �����ϰ� flash()�޼ҵ带 �߰��� iPhoneŬ������ �ۼ��϶� 
interface PhoneInterface{ //�������̽� ����
	final int TIMEOUT = 10000; //��� �ʵ� ����
	void sendCall(); //�߻�޼ҵ�
	void receiveCall(); //�߻�޼ҵ�
	default void printLogo() { //default�޼ҵ� 
		System.out.println("** iPhone **");
	}
	
}

class iPhone implements PhoneInterface{ //�������̽� ����
	//PhoneInterface�� ��� �߻� �޼ҵ� ���� 

	@Override
	public void sendCall() {
		System.out.println("��");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�Խ��ϴ�");
		
	}
	
	//�޼ҵ� �߰� �ۼ�
	public void flas() { 
		System.out.println("�������� ���� �������ϴ�");
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
