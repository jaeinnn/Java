package javaStudy;

/* 
  �񱳿����ڴ� �� ���� �ǿ����ڸ� ���Ͽ� 
 true �Ǵ� false�� �� ���� ���� �������̸�, 
  �������ڴ� �� ���� ������� 
 AND,OR,XOR,NOT�� �� ������ �Ͽ� �� ���� ���� �������̴�.
*/

//a^b�� a�� b�� XOR����. a�� b�� ���� �ٸ� �� true
//EX) (3>5)^(1==1)�� true�̴�. �´� false, ��� true�̱� ����. 
public class Ex2_7 {
	//�� �����ڿ� �� �������� ��� 
	public static void main(String[] args) {
		//�񱳿���
		System.out.println('a'>'b');//false
		System.out.println(3>=2); //true 
		System.out.println(-1<0); //true
		System.out.println(3.45<=2); //false
		System.out.println(3==2);//false
		System.out.println(3!=2);//true
		System.out.println(!(3!=2));//false
		
		//�� ����� �� ���� ����
		System.out.println((3>2) && (3>4));//false
		System.out.println((3!=2)||(-1>0)); //true
		System.out.println((3!=2)^(-1>0)); //true 
	
	}
}