package javaStudy;
import java.awt.*;
import javax.swing.*;

//Thread를 상속받아 1초 단위로 출력하는 타이머 스레드 만들기
/* 
 * 
 1초 단위로 증가하는 스레드를 만들고 레이블을 이용하여 타이머 값을 출력하라
 
 응용 프로그램의 시작과 함께 타이머가 바로 작동한다. 타이머 값은 JLabel 컴포넌트를 생성하여 출력하고,
 Thread 클래스를 상속받는 TimerThread 클래스를 스레드로 만든다. 
 이 스레드는 1초마다 1씩 증가시킨 정수 값을 JLabel의 텍스트에 출력한다.
 */

class TimerThread extends Thread{
	private JLabel timerLabel; //타이머 값이 출력되는 레이블 
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel; //타이머 카운트를 출력할 레이블
	}
	//스레드 코드. run()이 종료하면 스레드 종료 
	@Override
	public void run() { //run()은 스레드 코드로서 start()메소드가 호출된 후 스레드가 실행을 시작하는 메소드
		int n=0; //타이머 카운트 값
		while(true) { //무한 루프
			timerLabel.setText(Integer.toString(n)); //레이블에 카운트 값 출력 
			n++; //카운트 증가
			try {
				Thread.sleep(1000); //1초동안 잠을 잔다 
			}catch(InterruptedException e) {
				return; //예외가 발생하면 스레드 종료
			}
		}
	}
}

public class ThreadTimerEx extends JFrame{
	public ThreadTimerEx() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel(); 
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel); //레이블을 컨텐트팬에 부착 
		
		//타이머 스레드 객체 생성. 타이머 값을 출력할 레이블을 생성자에 전달
		TimerThread th = new TimerThread(timerLabel);
		
		setSize(300,170); 
		setVisible(true); 
		
		th.start(); //타이머 스레드를 동작시킨다. 이 호출의 결과 TimerThread의 run()메소드가 실행을 시작한다
	}
	
	public static void main(String[] args) {
		new ThreadTimerEx(); 
	}

}
