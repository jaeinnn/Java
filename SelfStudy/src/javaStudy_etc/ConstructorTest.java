package javaStudy_etc;
//������
/*
 �����ڴ� �ν��Ͻ��� ������ �� ȣ��Ǵ� '�ν��Ͻ� �ʱ�ȭ(�ν��Ͻ� �������� �ʱ�ȭ)�޼���'
 1. �������� �̸��� Ŭ������ �̸��� ���ƾ� �Ѵ�
 2. �����ڴ� ���� ���� ����
 
  -�����ڵ� �����ε��� �����ϹǷ� �ϳ��� Ŭ������ ���� ���� �����ڰ� ������ �� �ִ� 
  -������ new�� �ν��Ͻ��� �����ϴ� �� (�����ڰ� �ν��Ͻ��� �����ϴ� ���� �ƴϴ�) 
 */


/*
 �⺻ ������
 -�������� ��, �ҽ�����(*.java)�� Ŭ������ �����ڰ� �ϳ��� ���ǵ��� ���� ��� �����Ϸ���
  �ڵ������� �⺻ �����ڸ� �߰��Ͽ� �������Ѵ� 
 -�Ű������� �ִ� �����ڸ� �����صξ��� ��� �ν��Ͻ��� ������ ���� �Ű������� �־��־�� �Ѵ� 
 */
class Data1 {
    int value;
}
 
class Data2 {
    int value;
    
    Data2(int x) {    // �Ű������� �ִ� ������
        value =x;
    }
}
 
public class ConstructorTest {
 
    public static void main(String[] args) {
        Data1 d1 = new Data1();        // �����ڸ� �������� �ʾ����Ƿ�, ������ �� �ڵ����� �����ڰ� �����
//        Data2 d2 = new Data2();        // compile error �߻�
        Data2 d2 = new Data2(10);    // OK
 
    }
 
}
