package javaStudy;
import java.util.Scanner;

//static ����� �̿��Ͽ� �޷��� ��ȭ�� ��ȯ���ִ� ȯ�� ���⸦ ������
class CurrencyConverter {
	private static double rate; //1$�� ���� ��ȭ
	public static double toDollar(double won) {
		return won/rate; //��ȭ�� �޷��� ��ȯ
	}
	public static double toKWR(double dollar) {
		return dollar * rate; //�޷��� ��ȭ�� ��ȯ
	}
	public static void setRate(double r) {
		rate = r; //ȯ�� ����. ��/$1
	}
}