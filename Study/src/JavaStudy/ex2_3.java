package JavaStudy;

//Ÿ�� ��ȯ(TypeConversion)
public class ex2_3 {
	
	public static void main(String args[]) {
		byte b = 127; 
		int i = 100; 
		
		System.out.println(b+i); 
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041); //char�� ��ȯ�� ��� 0x0041�μ� ����'A'
		System.out.println((byte)(b+i)); //b+i�� 227,16���� 0xE3 ��,-29
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
	}
	

}
