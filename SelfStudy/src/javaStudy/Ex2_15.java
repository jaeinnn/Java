package javaStudy;

/* <switch�� ���� break��>
switch������ break���� �߿��ϴ�. 
case��  ���� ������ ����ǰ� ���� break������ switch���� ������� �����Ѵ�.
���� case���� break���� ���ٸ� break���� ���� ������ case���� ���๮������ ��� �����Ѵ�.
break���� ���� ������ ��� �����Ѵٰ� �����ϸ� �ȴ�. 

<case���� ��>
switch���� ���� ��� ���� case���� ���� ���Ѵ�. case���� ���� ���� ���ͷ�, 
���� ���ͷ�, ���ڿ� ���ͷ��� ����Ѵ�. case������ ������ ���� ����� �� ����. 
 */

import java.util.Scanner;

//switch���� �̿��Ͽ� Ŀ�� �޴��� ������ �˷��ִ� ���α׷��� �ۼ��϶�.
//����������, īǪġ��, ī��󶼴� 3500���̰� �Ƹ޸�ī��� 2000���̴�.
public class Ex2_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("���� Ŀ�� �帱���? ");
		String order = scanner.next(); //�ֹ� �б�
		
		int price=0;
		switch(order) {
		case "����������":
		case "īǪġ��":
		case "ī���":
			price = 3500; break; 
		//"����������", "īǪġ��", "ī���" ��� �� case���� �����Ѵ�.
		
		case "�Ƹ޸�ī��":
			price = 2000; break;
		default: System.out.println("�޴��� �����ϴ�.");
		}
		
	if(price != 0) System.out.print(order + "�� " + price + "���Դϴ�");
	scanner.close();
	}

}