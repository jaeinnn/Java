package javaStudy;

//���� 5-6

/*���ӿ��� ���⸦ ǥ���ϴ� WeaponŬ������ �����
���ɷ��� �����ϴ� fire()�޼ҵ带 �ۼ����� ������ ����
fire()�� 1�� �����Ѵ�*/
class Weapon {
	protected int fire() {
		return 1; // ����� �⺻������ �� �� ���
	}
}

/*
 * ������ �����ϱ� ���� Weapon�� ��ӹ޴� CannonŬ������ �ۼ��϶�. Cannon�� ���ɷ��� 10�̴�. fire() �޼ҵ带 �̿�
 * �°� �������̵��϶�. main()�� �ۼ��Ͽ� �������̵��� �׽�Ʈ�϶�.
 */
class Cannon extends Weapon {
	@Override
	protected int fire() { // �������̵�
		return 10; // ������ �ѹ��� 10���� ���
	}
}

public class Overriding {

	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ��� " + weapon.fire());

		weapon = new Cannon();
		System.out.println("������ ��� �ɷ��� " + weapon.fire());

	}

}
