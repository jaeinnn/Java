package javaStudy;

//컴파일 오류에 대한 이유를 설명하라
public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample(); 
		sample.a = 10; 
		sample.b = 10;
		sample.c = 10; 
	}
}

/*
컴파일하면 
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The field Sample.b is not visible
에러가 발생한다.

Sample클래스의필드 b는 private 멤버로서 Sample 클래스 외
다른 어떤 클래스에서도 읽고 쓸 수 없기 때문에 sample.b=10; 여기서 
컴파일 오류가 발생한다.
 */