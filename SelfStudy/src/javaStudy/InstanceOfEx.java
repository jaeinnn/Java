package javaStudy;
//ĳ����(casting)�̶� Ÿ�� ��ȯ�� ���Ѵ�.
//�ڹٿ��� Ŭ������ ���� ĳ������ ��ĳ���ð� �ٿ�ĳ�������� ������


/*
 ���� Ŭ������ ��ü�� ���� ���۷����� ����Ŭ���� Ÿ������ ��ȯ�ϴ� ���� ��ĳ�����̶�� �Ѵ�.
 ��ĳ������ ���۷����δ� ��ü ���� ��� ����� ������ �� ���� ���� Ŭ������ ����� ������ �� �ִ�.
*/

/*
��ĳ���ð� �ݴ�� ĳ�����ϴ� ���� �ٿ�ĳ�����̶�� �Ѵ�.
�ٿ�ĳ������ ��ĳ���ð� �޸� ��������� Ÿ�� ��ȯ�� �����ؾ� �Ѵ�.
*/

/*
��ĳ������ �� ���, ���۷����� ����Ű�� ��ü�� ��¥ Ŭ���� Ÿ���� �����ϱ� ��ƴ�.

���۷����� ����Ű�� ��ü�� � Ŭ���� Ÿ�������� �����ϱ� ����,
�ڹٿ����� instanceof �����ڸ� �ΰ� �ִ�.
instanceof�� ���� �����ڷμ� ������ ���� ���ȴ�.

���۷��� instanceof Ŭ������

instanceof �������� ��� ���� boolean������,
'���۷���'�� ����Ű�� ��ü�� �ش� 'Ŭ����'Ÿ���� ��ü�̸�
true�̰� �ƴϸ� false�� ����Ѵ�.

instanceof�� Ŭ�������� ����ȴ�.

*/
class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceOfEx {
	static void print(Person p) {
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Professor ");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() ->\t"); print(new Student());
		System.out.print("new Researcher() ->\t"); print(new Researcher());
		System.out.print("new Professor() ->\t"); print(new Professor());
	}
}