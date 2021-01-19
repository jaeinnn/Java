package javaStudy;
import java.util.Scanner;

//static 멤버를 이용하여 달러와 원화를 변환해주는 환율 계산기를 만들어보자
class CurrencyConverter {
	private static double rate; //1$에 대한 원화
	public static double toDollar(double won) {
		return won/rate; //원화를 달러로 변환
	}
	public static double toKWR(double dollar) {
		return dollar * rate; //달러를 원화로 변환
	}
	public static void setRate(double r) {
		rate = r; //환율 설정. 원/$1
	}
}