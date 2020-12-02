package JavaStudy;

/*
 개발자는 응용프로그램 전체에서 Scanner 객체를 하나만 생성하고 공유하는 것이 바람직하다
 Scanner객체를 여러 개 생성해도 이들은 모두 하나뿐인 System.in을 공유하므로
 한 군데서 Scanner.close()를 호출하여 Scanner 객체를 닫아버리면
 System.in도 닫혀버려 응용프로그램 내 다른 Scanner객체에서 키 입력을
 받을 수 없게 된다. 
  
 */
import java.util.Scanner;
public class ex2_4 {
	public static void main(String args[]) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); //문자열 읽기
		System.out.print("이름은 " + name + ",");
		
		String city = scanner.next(); //문자열 읽기
		System.out.print("도시는 " + city + ", ");
		
		int age = scanner.nextInt(); //정수 읽기
		System.out.print("나이는 " + age + "살, ");
		
		double weight = scanner.nextDouble(); //실수 읽기
		System.out.print("체중은 " + weight + "kg, ");
		
		boolean isSingle = scanner.nextBoolean(); //논리값 읽기
		System.out.println("독신 여부는" + isSingle + "입니다.");
		scanner.close(); //scanner 객체 닫기 
		
	}

}

/*
 공백이 낀 문자열을 입력받기 위해서는 Scanner 클래스의  nextLine()을 이용하면 된다
 next()로는 공백이 낀 문자열을 읽을 수 없다. 
 또한 nextLine()은 <Enter>키의 입력을 기다리는 용도로 사용할 수 있다
 */


