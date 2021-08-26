package javaStudy;
import java.awt.*;
import javax.swing.*; 

//JLabel�� ��ӹ޾� ���ڿ��� �����̴� FlickeringLabel ������Ʈ�� �ۼ��϶�

/*
 JLabel�� Runnable�������̽��� ��ӹ޴� FlickeringLabelŬ������ �ۼ��ϰ�
 run() �޼ҵ带 �������̵��϶�. �����Ÿ��� ����� ����, run()�� ���̺��� ������
 ������� �ʷϻ��� ������ �����ϸ� �ȴ�.FlickeringLabel�� �����ڿ� �����Ÿ�
 ���ڿ��� ������ �ٲ�� ���� �ð��� �����϶�
 */


class FlickeringLabel extends JLabel implements Runnable{
/*JLabel�� ��ӹ��� ���ο� ���̺� Ŭ������ �ۼ��Ѵ�
 *Runnable�� ��ӹޱ� ������ �ݵ�� run()�޼ҵ带 �������̵��ؾ� �Ѵ�
 */
	
	private long delay; //������ �ٲ�� �����ð�. �и��� ���� 
	
	public FlickeringLabel(String text, long delay) { //������
		super(text); //JLabel ������ ȣ��
		this.delay = delay; 
		setOpaque(true); //���� ������ �����ϵ��� ����
		
		Thread th = new Thread(this); 
//Thread()�� �����ڿ� this�� �ѱ�� ���� �ٷ� �� Ŭ������ Runnable�� ��ӹ޾� run()�� ������ ��ü���� ǥ���Ѵ�
		th.start();
	}
	
	@Override
	public void run() { //500ms���� �ݺ������� ������� �ʷϻ��� ������ �������� �����Ѵ� 
		int n=0; 
		while(true) {
			if(n==0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN); 
			if(n==0) n=1; 
			else n=0; 
			try {
				Thread.sleep(delay); //delay �и��� ���� ���� �ܴ�
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class FlickeringLabelEx extends JFrame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLableEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout());
		
		//�����̴� ���̺� ����
		FlickeringLabel fLabel = new FlickeringLabel("����",500);  //500�и��� �ֱ�� ���� ����
		
		//�������� �ʤ��� ���̺� ����
		JLabel label = new JLabel("�ȱ���"); 
		
		//�����̴� ���̺� ����
		FlickeringLabel fLabel2 = new FlickeringLabel("���⵵ ����", 300); //300�и��� �ֱ�� ���� ����
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true); 
	}
	
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

}
