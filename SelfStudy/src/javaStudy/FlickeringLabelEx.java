package javaStudy;
import java.awt.*;
import javax.swing.*; 

//JLabel을 상속받아 문자열을 깜빡이는 FlickeringLabel 컴포넌트를 작성하라

/*
 JLabel과 Runnable인터페이스를 상속받는 FlickeringLabel클래스를 작성하고
 run() 메소드를 오버라이딩하라. 깜빡거림을 만들기 위해, run()은 레이블의 배경색을
 노란색과 초록색을 번갈아 변경하면 된다.FlickeringLabel의 생성자에 깜빡거릴
 문자열과 배경색이 바뀌는 지연 시간을 전달하라
 */


class FlickeringLabel extends JLabel implements Runnable{
/*JLabel을 상속받은 새로운 레이블 클래스를 작성한다
 *Runnable을 상속받기 때문에 반드시 run()메소드를 오버라이딩해야 한다
 */
	
	private long delay; //배경색이 바뀌는 지연시간. 밀리초 단위 
	
	public FlickeringLabel(String text, long delay) { //생성자
		super(text); //JLabel 생성자 호출
		this.delay = delay; 
		setOpaque(true); //배경색 변경이 가능하도록 설정
		
		Thread th = new Thread(this); 
//Thread()의 생성자에 this를 넘기는 것은 바로 이 클래스가 Runnable을 상속받아 run()을 구현한 객체임을 표시한다
		th.start();
	}
	
	@Override
	public void run() { //500ms마다 반복적으로 노란색과 초록색을 번갈아 배경색으로 변경한다 
		int n=0; 
		while(true) {
			if(n==0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN); 
			if(n==0) n=1; 
			else n=0; 
			try {
				Thread.sleep(delay); //delay 밀리초 동안 잠을 잔다
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class FlickeringLabelEx extends JFrame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLableEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout());
		
		//깜빡이는 레이블 생성
		FlickeringLabel fLabel = new FlickeringLabel("깜빡",500);  //500밀리초 주기로 배경색 변경
		
		//깜빡이지 않ㄴ흔 레이블 생성
		JLabel label = new JLabel("안깜빡"); 
		
		//깜빡이는 레이블 생성
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜빡", 300); //300밀리초 주기로 배경색 변경
		
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
