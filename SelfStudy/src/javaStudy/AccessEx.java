package javaStudy;

//������ ������ ���� ������ �����϶�
public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample(); 
		sample.a = 10; 
		sample.b = 10;
		sample.c = 10; 
	}
}

/*
�������ϸ� 
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The field Sample.b is not visible
������ �߻��Ѵ�.

SampleŬ�������ʵ� b�� private ����μ� Sample Ŭ���� ��
�ٸ� � Ŭ���������� �а� �� �� ���� ������ sample.b=10; ���⼭ 
������ ������ �߻��Ѵ�.
 */