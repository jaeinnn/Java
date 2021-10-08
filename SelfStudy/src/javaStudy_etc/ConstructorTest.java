package javaStudy_etc;
//생성자
/*
 생성자는 인스턴스가 생성될 때 호출되는 '인스턴스 초기화(인스턴스 변수들을 초기화)메서드'
 1. 생성자의 이름은 클래스의 이름과 같아야 한다
 2. 생성자는 리턴 값이 없다
 
  -생성자도 오버로딩이 가능하므로 하나의 클래스에 여러 개의 생성자가 존재할 수 있다 
  -연산자 new가 인스턴스를 생성하는 것 (생성자가 인스턴스를 생성하는 것이 아니다) 
 */


/*
 기본 생성자
 -컴파일할 때, 소스파일(*.java)의 클래스에 생성자가 하나도 정의되지 않은 경우 컴파일러는
  자동적으로 기본 생성자를 추가하여 컴파일한다 
 -매개변수가 있는 생성자를 선언해두었을 경우 인스턴스를 생성할 때도 매개변수를 넣어주어야 한다 
 */
class Data1 {
    int value;
}
 
class Data2 {
    int value;
    
    Data2(int x) {    // 매개변수가 있는 생성자
        value =x;
    }
}
 
public class ConstructorTest {
 
    public static void main(String[] args) {
        Data1 d1 = new Data1();        // 생성자를 선언하지 않았으므로, 컴파일 시 자동으로 생성자가 선언됨
//        Data2 d2 = new Data2();        // compile error 발생
        Data2 d2 = new Data2(10);    // OK
 
    }
 
}

