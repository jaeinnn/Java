package JavaStudy;

/*
 �����ڴ� �������α׷� ��ü���� Scanner ��ü�� �ϳ��� �����ϰ� �����ϴ� ���� �ٶ����ϴ�
 Scanner��ü�� ���� �� �����ص� �̵��� ��� �ϳ����� System.in�� �����ϹǷ�
 �� ������ Scanner.close()�� ȣ���Ͽ� Scanner ��ü�� �ݾƹ�����
 System.in�� �������� �������α׷� �� �ٸ� Scanner��ü���� Ű �Է���
 ���� �� ���� �ȴ�. 
  
 */
import java.util.Scanner;
public class ex2_4 {
	public static void main(String args[]) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); //���ڿ� �б�
		System.out.print("�̸��� " + name + ",");
		
		String city = scanner.next(); //���ڿ� �б�
		System.out.print("���ô� " + city + ", ");
		
		int age = scanner.nextInt(); //���� �б�
		System.out.print("���̴� " + age + "��, ");
		
		double weight = scanner.nextDouble(); //�Ǽ� �б�
		System.out.print("ü���� " + weight + "kg, ");
		
		boolean isSingle = scanner.nextBoolean(); //���� �б�
		System.out.println("���� ���δ�" + isSingle + "�Դϴ�.");
		scanner.close(); //scanner ��ü �ݱ� 
		
	}

}

/*
 ������ �� ���ڿ��� �Է¹ޱ� ���ؼ��� Scanner Ŭ������  nextLine()�� �̿��ϸ� �ȴ�
 next()�δ� ������ �� ���ڿ��� ���� �� ����. 
 ���� nextLine()�� <Enter>Ű�� �Է��� ��ٸ��� �뵵�� ����� �� �ִ�
 */


