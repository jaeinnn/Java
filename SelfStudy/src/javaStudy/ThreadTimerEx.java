package javaStudy;
import java.awt.*;
import javax.swing.*;

//Thread�� ��ӹ޾� 1�� ������ ����ϴ� Ÿ�̸� ������ �����
/* 
 * 
 1�� ������ �����ϴ� �����带 ����� ���̺��� �̿��Ͽ� Ÿ�̸� ���� ����϶�
 
 ���� ���α׷��� ���۰� �Բ� Ÿ�̸Ӱ� �ٷ� �۵��Ѵ�. Ÿ�̸� ���� JLabel ������Ʈ�� �����Ͽ� ����ϰ�,
 Thread Ŭ������ ��ӹ޴� TimerThread Ŭ������ ������� �����. 
 �� ������� 1�ʸ��� 1�� ������Ų ���� ���� JLabel�� �ؽ�Ʈ�� ����Ѵ�.
 */

class TimerThread extends Thread{
	private JLabel timerLabel; //Ÿ�̸� ���� ��µǴ� ���̺� 
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel; //Ÿ�̸� ī��Ʈ�� ����� ���̺�
	}
	//������ �ڵ�. run()�� �����ϸ� ������ ���� 
	@Override
	public void run() { //run()�� ������ �ڵ�μ� start()�޼ҵ尡 ȣ��� �� �����尡 ������ �����ϴ� �޼ҵ�
		int n=0; //Ÿ�̸� ī��Ʈ ��
		while(true) { //���� ����
			timerLabel.setText(Integer.toString(n)); //���̺� ī��Ʈ �� ��� 
			n++; //ī��Ʈ ����
			try {
				Thread.sleep(1000); //1�ʵ��� ���� �ܴ� 
			}catch(InterruptedException e) {
				return; //���ܰ� �߻��ϸ� ������ ����
			}
		}
	}
}

public class ThreadTimerEx extends JFrame{
	public ThreadTimerEx() {
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel(); 
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel); //���̺��� ����Ʈ�ҿ� ���� 
		
		//Ÿ�̸� ������ ��ü ����. Ÿ�̸� ���� ����� ���̺��� �����ڿ� ����
		TimerThread th = new TimerThread(timerLabel);
		
		setSize(300,170); 
		setVisible(true); 
		
		th.start(); //Ÿ�̸� �����带 ���۽�Ų��. �� ȣ���� ��� TimerThread�� run()�޼ҵ尡 ������ �����Ѵ�
	}
	
	public static void main(String[] args) {
		new ThreadTimerEx(); 
	}

}
