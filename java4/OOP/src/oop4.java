
public class oop4 {
	/*�߻� Ŭ���� �� �޼ҵ� abstract*/
	public static void main(String[] args) {
		
		ab_2 ab = new ab_2();
		System.out.println(ab.b());
		ab.ab_a();

	}

}

abstract class ab_1 {	/*�߻� Ŭ���� (�ܺο��� �ε尡 ���� �ȵ�) - ��ü ������ �ȵ�*/
	
	public void ab_a() {	//free (�μ��� ���� �߻� �޼ҵ�)	- ����ص� �ǰ� ���ص� ��
		//�ȿ� ���� ������ �ڽ� �޼ҵ忡�� ��� �Ұ�

	}
	
	public void ab_a(int a) {	//free (�μ��� �޴� �߻� �޼ҵ�)
		
	}
	//abstract ���� public �޼ҵ�� ������ �߰�ȣ�� �־�� ��. 
	//�θ� Ŭ������ abstract�� ���������� �ڽ� �޼ҵ忡�� �ݵ�� ����ؾ� �������� �ȶ�
	//public abstract void ab_c();	/*free ���� ������ �ڽ� Ŭ������ ���*/
	public abstract int b();	/*�߻� �޼ҵ� - ��ü ���� �ȵ�*/
	
}

class ab_2 extends ab_1{
	
	public void ab_a() {
		
		//System.out.println(this.c());
	}
	@Override
	public int b() {	/*���� �޼ҵ� + �߻� �޼ҵ�*/
		return 55;
	}
	public int c() {
		return 99;
	}
}