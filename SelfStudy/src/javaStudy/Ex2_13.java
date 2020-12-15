package javaStudy;
import java.util.Scanner;

/*  중첩 if-else문  
: if문이나 if-else문, else문의 '실행 문장'에, 
if문이나 if-else문을 내포할 수 있다. */

//점수와 학년을 입력받아 60점 이상이면 합격,미만이면 불합격을 출력한다.
//4학년의 경우 70점 이상이어야 합격이다. 
public class Ex2_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt(); //점수 읽기 
		System.out.print("학년을 입력하세요(1~4): ");
		int year = scanner.nextInt(); //학년 읽기 
		
		if(score>=60) { //60점 이상
			if(year !=4) 
				System.out.println("합격!"); //4학년 아니면 합격
				else if(score>=70)
					System.out.println("합격!"); //4학년이 70점 이상이면 합격
				else
					System.out.println("불합격!"); //4학년이 70점 미만이면 불합격
			}
			else //60점 미만 불합격
				System.out.println("불합격!");
			
			scanner.close();
		}
}