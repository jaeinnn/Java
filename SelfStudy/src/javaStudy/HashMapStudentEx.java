package javaStudy;
import java.util.*; 

//���� 7-7
/*
 id�� tel(��ȭ��ȣ)�� �����Ǵ� Student2 Ŭ������ �����,
 �̸��� 'Ű'�� �ϰ� Student ��ü�� '��'���� �ϴ� �ؽø��� �ۼ��϶� 
 */

class Student2{
	private int id; 
	private String tel; 
	public Student2(int id, String tel) {
		this.id = id; this.tel = tel; 
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
}

public class HashMapStudentEx {
	public static void main(String[] args) {
		//(�л� �̸�, Student ��ü)�� �����ϴ� �ؽø� ����
		HashMap<String, Student2> map = new HashMap<String, Student2>();
		map.put("Ȳ����", new Student2(1,"010-111-1111")); //3���� �л� ����
		map.put("���繮", new Student2(2,"010-222-2222")); 
		map.put("�賲��", new Student2(3,"010-333-3333"));
		
		Scanner scanner = new Scanner(System.in); 
		while(true) {
			System.out.print("�˻��� �̸�?");
			String name = scanner.nextLine(); //����ڷκ��� �̸� �Է�
			if(name.equals("exit"))
				break; //while���� ��� ���α׷� ���� 
			Student2 student = map.get(name); //�̸��� �ش��ϴ� Student ��ü �˻� 
			if(student == null)
				System.out.println(name + "�� ���� ����Դϴ�");
			else
				System.out.println("id" + student.getId() + ", ��ȭ:" + student.getTel());
		}
		
		scanner.close();
	}

}
