package javaStudy;


//����5-6
//����5-5�� Shape,Line,Rect,Circle Ŭ���� Ȱ��
public class UsingOverride {
	public static void main(String[] args) {
		Shape start, last, obj; 
		
		//��ũ�帮��Ʈ�� ���� �����Ͽ� ����
		start = new Line(); //Line ��ü ����
		last = start; 
		obj = new Rect(); 
		last.next = obj; //Rect ��ü ����
		last = obj; 
		obj = new Line(); //Line ��ü ����
		last.next = obj; 
		last = obj; 
		obj = new Circle2(); //Circle��ü ����
		last.next = obj; 
		
		
		//��� ���� ���
		Shape p = start; 
		while(p!=null) {
			p.draw();
			p = p.next; 
		}
	}
}